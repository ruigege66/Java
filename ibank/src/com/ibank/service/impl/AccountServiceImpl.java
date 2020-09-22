/*     */package com.ibank.service.impl;

import com.ibank.bean.Account;
import com.ibank.bean.Actype;
import com.ibank.bean.Ibank;
import com.ibank.dao.impl.AccountDAOImpl;
import com.ibank.service.IAccHistoryService;
import com.ibank.service.IAccountService;
import com.ibank.service.IIbankMoneyService;
import com.ibank.service.IinterestService;

import java.sql.Timestamp;
import java.util.Date;

public class AccountServiceImpl implements IAccountService {
	IinterestService interService;
	AccountDAOImpl dao;
	IIbankMoneyService ibankMoneyServiceImpl;
	IAccHistoryService accHistoryServiecImpl;

	//构造方法，初始化对象
	public AccountServiceImpl() {
		this.dao = new AccountDAOImpl();
		this.ibankMoneyServiceImpl = new IbankMoneyServiceImpl();
		this.accHistoryServiecImpl = new AccHistoryServiecImpl();
		this.interService=new InterestSerivecImpl();
	}
	/**注册
	 * @param account 要注册的账户
	 * @param typeid 账户类别
	 * @param ibankid 开户支行
	 * */
	public boolean regist(Account account, int typeid, int ibankid) {
		//查找账户类别是否存在
		Actype actype = (Actype) this.dao.load(Actype.class,
				Integer.valueOf(typeid));
		//查找开户支行是否存在
		Ibank ibank = (Ibank) this.dao.load(Ibank.class,
				Integer.valueOf(ibankid));
		//关联account
		account.setActype(actype);
		account.setIbank(ibank);
		account.setRegtime(new Timestamp(new Date().getTime()));
		account.setInteresttime(new Timestamp(new Date().getTime()));
		account.setStatus(Integer.valueOf(1));
		//开户
		boolean flag = this.dao.create(account);
		System.out.println("注册时的flag标记"+flag);
		if (flag) {
			
			//将余额添加进总额表
			this.ibankMoneyServiceImpl.add(account.getBalance().doubleValue());
			//增加账户记录
			this.accHistoryServiecImpl.addrecord(account.getId(), account
					.getBalance().doubleValue(), 1);
			return true;//添加成功
		}
		return false;//添加失败
	}
	/**获取账户信息
	 * @param accid 账户id
	 * @return Account 返回账户信息
	 * */
	public Account getaccountinfo(String accid) {
		Object obj = this.dao.find(Account.class, accid);
		if ((obj instanceof Account)) {
			return (Account) obj;
		}
		if (((obj instanceof Boolean)) && (!((Boolean) obj).booleanValue())) {
			return null;
		}
		return null;
	}
	/**修改密码
	 * @param accid 账户id
	 * @param password 账户密码
	 * @param newpassword 账户新密码
	 * */
	public String changepwd(String accid, String password, String newpassword) {
		Account ac = (Account) this.dao.find(Account.class, accid);
		if ((ac == null) || (0 == ac.getStatus())) {
			return "-1";//账号不存在
		}
		if (2 == ac.getStatus()) {
			return "0";//账号已禁用
		}
		if (!ac.getPassword().equals(password)) {
			return "-2";//密码错误
		}
		ac.setPassword(newpassword);
		boolean flag = this.dao.update(ac);
		if (!flag) {
			return "-3";
		}
		return "1";
	}
	/**存款
	 * @param accid 账户id
	 * @param money 存款金额
	 * @return string 返回字符串型标志信息
	 * */
	public String inputmoney(String accid, double money) {
		//调用更改金额方法，money为正，表示存款
		boolean flag = this.dao.changeMoney(accid, money);
		if (!flag) {
			return "-1";
		}
		//同时修改银行总金额和添加账户记录
		this.accHistoryServiecImpl.addrecord(accid, money, 1);//action为1表示存款
		this.ibankMoneyServiceImpl.add(money);

		return "1";
	}
	/**取款
	 * @param accid 账户id
	 * @param money 金额
	 * @param password 密码
	 * @return String 返回字符串型标志信息*/
	public String outputmoney(String accid, double money, String password) {
		//先查找账户是否存在
		Account ac = (Account) this.dao.find(Account.class, accid);
		double balance = ac.getBalance().doubleValue();
		double overdraft = ac.getOverdraft();

		if (!ac.getPassword().equals(password)) {
			return "-1";	//密码错误
		}
		if (balance + overdraft - money < 0.0D) {
			return "-2";//余额不足
		}
		money = 0.0D - money;
		//调用修改金额方法，参数为负，表示取款
		boolean flag = this.dao.changeMoney(accid, money);
		if (!flag) {
			return "-3";//操作失败
		}
		//同时添加记录表记录，并修改总金额
		this.accHistoryServiecImpl.addrecord(accid, money, 2);//action为2表示取款
		this.ibankMoneyServiceImpl.reduce(money);
		//结算利息
		Double interestmoney=interService.intestestMoney(ac.getId());
		if (interestmoney>0) {
			this.accHistoryServiecImpl.addrecord(accid, interestmoney, 3);//action为3表示利息
			this.ibankMoneyServiceImpl.add(interestmoney);
		}
		return "1";//操作成功
	}

	/** 挂失 
	 * @param accid 账户id
	 * @param pasword 密码
	 * @param identitycard 身份证
	 * @param name 姓名
	 * @return String 返回字符串型标识信息*/
	public String reportlost(String accid, String password,
			String identitycard, String name) {
		//获取账户信息，
		Account ac = (Account) this.dao.find(Account.class, accid);
		if ((ac == null) || (0 == ac.getStatus())) {
			return "-1";//账户不存在
		}
		if (2 == ac.getStatus()) {
			return "0";//账户已经挂失中
		}
		if (!ac.getPassword().equals(password)) {
			return "-2";//密码错误
		}
		if (!ac.getIdentitycard().equals(identitycard)) {
			return "-3";//身份证错误
		}
		if (!ac.getName().equals(name)) {
			return "-4";//姓名错误
		}
		//修改状态为挂失状态 2表示挂失
		ac.setStatus(Integer.valueOf(2));
		//更新状态
		boolean flag = this.dao.update(ac);
		if (!flag) {
			return "-5";//操作失败，系统错误
		}
		return "1";//挂失成功
	}

	/** 注销账户 
	 * @param  accid 账户id
	 * @param password 密码
	 * @param identitycard 身份证
	 * @param name 姓名
	 * @return Object 返回可能是字符串型标志信息或者返回余额*/
	public Object logoff(String accid, String password, String identitycard,
			String name) {
		Account ac = (Account) this.dao.find(Account.class, accid);
		if ((ac == null) || (ac.getActype().getTypeid().intValue() == 0)) {
			return "-1";//账户不存在
		}
		if(ac.getActype().getTypeid() == 2){
			return "0";//账号已经禁用了
		}
		if (!ac.getPassword().equals(password)) {
			return "-2";//账户密码不对
		}
		if (!ac.getIdentitycard().equals(identitycard)) {
			return "-3";//身份证错误
		}
		if (!ac.getName().equals(name)) {
			return "-4";//姓名错误
		}
		//余额
		Object money = ac.getBalance();
		ac.setBalance(Double.valueOf(0.0D));
		ac.setStatus(Integer.valueOf(0));
		boolean flag = this.dao.update(ac);
		if (!flag) {
			return "-5";//操作错误，系统错误
		}
		//同时添加记录，并修改总行金额
		this.ibankMoneyServiceImpl.reduce(-((Double) (money)).doubleValue());
		this.accHistoryServiecImpl.addrecord(accid,
				-((Double) money).doubleValue(), 2);
		return money;
	}

	/** 查询余额
	 *  @param accid 账户id
	 *  @param password 密码
	 *  @return Object 返回余额或者字符串型标志信息*/
	public Object searchbalance(String accid, String password) {
		Account ac = (Account) this.dao.find(Account.class, accid);
		if ((ac == null) || (0 == ac.getStatus())) {
			return "-1";//账户不存在
		}
		if (2 == ac.getStatus()) {
			return "0";//账户已经禁用
		}
		if (!ac.getPassword().equals(password)) {
			return "-2";//密码错误
		}
		Object money = ac.getBalance();
		return money;
	}

	/** 取消挂失 
	 *  @param accid 账户id
	 *  @param password 密码
	 *  @param identitycard 身份证
	 *  @param name 姓名
	 *  @return String 返回字符串型标志信息*/
	public String cancellost(String accid, String password,
			String identitycard, String name) {
		Account ac = (Account) this.dao.find(Account.class, accid);
		if ((ac == null) || (0 == ac.getStatus())) {
			return "-1";//账号不存在
		}
		if ((1==ac.getStatus())) {
			return "0";//账号异常，已经挂失中
		}
		if (!ac.getPassword().equals(password)) {
			return "-2";//密码错误
		}
		if (!ac.getIdentitycard().equals(identitycard)) {
			return "-3";//身份证错误
		}
		if (!ac.getName().equals(name)) {
			return "-4";//姓名错误
		}
		//修改状态为1,1表示正常状态，即完成解除挂失
		ac.setStatus(Integer.valueOf(1));
		//更新状态到数据库
		boolean flag = this.dao.update(ac);
		if (!flag) {
			return "-5";//操作失败，系统错误
		}
		return "1";//操作成功
	}

	/*结算利息，弃用
	@SuppressWarnings("rawtypes")
	public String updatebalance() {
		List list = dao.list("from Actype");
		for (Object o : list) {
			Actype a = (Actype) o;
			int id = a.getTypeid();
			System.out.println(id);
			try {
				dao.updatebalance(id);
			} catch (Exception e) {
				return "-1";
			}
		}
		return "1";
	} */
}