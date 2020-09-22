package com.ibank.service;

import com.ibank.bean.Account;

public abstract interface IAccountService {
	/**注册
	 * @param account 要注册的账户
	 * @param typeid 账户类别
	 * @param ibankid 开户支行
	 * */
	public abstract boolean regist(Account account, int typeid, int ibankid);
	
	/**获取账户信息
	 * @param accid 账户id
	 * @return Account 返回账户信息
	 * */
	public abstract  Account getaccountinfo(String accid);
	
	/**修改密码
	 * @param accid 账户id
	 * @param password 账户密码
	 * @param newpassword 账户新密码
	 * */
	public abstract  String changepwd(String accid, String password, String newpassword);
	
	/**存款
	 * @param accid 账户id
	 * @param money 存款金额
	 * @return string 返回字符串型标志信息
	 * */
	public abstract  String inputmoney(String accid, double money);
	
	/**取款
	 * @param accid 账户id
	 * @param money 金额
	 * @param password 密码
	 * @return String 返回字符串型标志信息*/
	public abstract  String outputmoney(String accid, double money, String password);
	
	/** 挂失 
	 * @param accid 账户id
	 * @param pasword 密码
	 * @param identitycard 身份证
	 * @param name 姓名
	 * @return String 返回字符串型标识信息*/
	public abstract  String reportlost(String accid, String password,
			String identitycard, String name);
	
	/** 注销账户 
	 * @param  accid 账户id
	 * @param password 密码
	 * @param identitycard 身份证
	 * @param name 姓名
	 * @return Object 返回可能是字符串型标志信息或者返回余额*/
	public  abstract Object logoff(String accid, String password, String identitycard,
			String name);
	
	/** 查询余额
	 *  @param accid 账户id
	 *  @param password 密码
	 *  @return Object 返回余额或者字符串型标志信息*/
	public abstract  Object searchbalance(String accid, String password);
	
	/** 取消挂失 
	 *  @param accid 账户id
	 *  @param password 密码
	 *  @param identitycard 身份证
	 *  @param name 姓名
	 *  @return String 返回字符串型标志信息*/
	public abstract  String cancellost(String accid, String password,
			String identitycard, String name);
	/*结算激利息
	public abstract String updatebalance();
	*/
}
