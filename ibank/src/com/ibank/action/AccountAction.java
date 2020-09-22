package com.ibank.action;

import com.ibank.bean.Account;
import com.ibank.service.IAccountService;
import com.ibank.service.impl.AccountServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

@SuppressWarnings("serial")
public class AccountAction extends ActionSupport {
	private Account account;//账户信息
	private IAccountService accservice = new AccountServiceImpl();
	private String newpassword;//新密码
	private double inputmoney;//存款金额
	private double outputmoney;//取款金额
	private int typeid;//账户类别id
	private int flag;//标志位
	private int ibankid;//开户行id
	/**修改密码*/
	public String changepwd() {
		String status = this.accservice.changepwd(this.account.getId(),
				this.account.getPassword(), this.newpassword);
		
		if ("1".equals(status)) {
			ServletActionContext.getRequest().setAttribute("success",
					"密码以成功修改，请保管好密码");
			return "success";
		}
		if ("-1".equals(status)) {
			ServletActionContext.getRequest().setAttribute("error",
					"修改密码失败,此账号不存在");
			return "error";
		}
		if ("-2".equals(status)) {
			ServletActionContext.getRequest().setAttribute("error",
					"修改密码失败,原始密码或账号错误");
			return "error";
		}
		if ("-3".equals(status)) {
			ServletActionContext.getRequest().setAttribute("error",
					"修改密码失败,请重新操作");
			return "error";
		}
		if ("0".equals(status)) {
			ServletActionContext.getRequest().setAttribute("error",
					"账号异常,该账号已禁止使用");
			return "error";
		}
		return "input";
	}

	public Account getAccount() {
		return this.account;
	}
	/**获取账户信息*/
	public String getaccountinfo() {
		Account ac = this.accservice.getaccountinfo(this.account.getId());
		if ((ac == null) || (ac.getStatus().intValue() == 0)) {
			ServletActionContext.getRequest().setAttribute("error", "该账号不存在");
			return "error";
		}
		if (2 == ac.getStatus().intValue()) {
			ServletActionContext.getRequest().setAttribute("error",
					"该账号异常，不能使用");
			return "error";
		}
		if (this.flag == 1) {//表示是从存款页面获取的该账户的信息
			ServletActionContext.getRequest().setAttribute("account", ac);
			return "inputmoney";
		}
		if (this.flag == 2) {//表示是从取款页面获取的账户信息
			ServletActionContext.getRequest().setAttribute("account", ac);
			return "outputmoney";
		}
		ServletActionContext.getRequest().setAttribute("error", "操作错误");
		return "error";
	}

	public int getIbankid() {
		return this.ibankid;
	}

	public double getInputmoney() {
		return this.inputmoney;
	}

	public String getNewpassword() {
		return this.newpassword;
	}

	public double getOutputmoney() {
		return this.outputmoney;
	}

	public int getTypeid() {
		return this.typeid;
	}
	/**存款*/
	public String inputMoney() {
		String status = this.accservice.inputmoney(this.account.getId(),
				this.inputmoney);
		if ("1".equals(status)) {
			ServletActionContext.getRequest().setAttribute("account", null);
			ServletActionContext.getRequest().setAttribute("success",
					"存款成功,本次存款金额为:" + this.inputmoney);
			return "success";
		}
		if ("-1".equals(status)) {
			ServletActionContext.getRequest()
					.setAttribute("error", "存款失败,操作异常");
			return "error";
		}
		return "input";
	}
	/**销户*/
	public String logoff() {
		Object status = this.accservice.logoff(this.account.getId(),
				this.account.getPassword(), this.account.getIdentitycard(),
				this.account.getName());
		if ((status instanceof Double)) {
			ServletActionContext.getRequest().setAttribute("success",
					"注销成功,该账号返回的剩余金额为:" + (Double) status);
			return "success";
		}
		String status2 = (String) status;
		if ("-1".equals(status2)) {
			ServletActionContext.getRequest().setAttribute("error",
					"注销失败,账号不存在");
			return "error";
		}
		if ("-2".equals(status2)) {
			ServletActionContext.getRequest().setAttribute("error",
					"注销失败，密码或账号错误");
			return "error";
		}
		if ("-3".equals(status2)) {
			ServletActionContext.getRequest().setAttribute("error",
					"注销失败，身份证错误");
			return "error";
		}
		if ("-4".equals(status2)) {
			ServletActionContext.getRequest()
					.setAttribute("error", "注销失败，姓名错误");
			return "error";
		}
		if ("-5".equals(status2)) {
			ServletActionContext.getRequest()
					.setAttribute("error", "注销失败，操作错误");
			return "error";
		}
		return "input";
	}
	/**取款*/
	public String outputMoney() {
		String status = this.accservice.outputmoney(this.account.getId(),
				this.outputmoney, this.account.getPassword());
		if ("1".equals(status)) {
			ServletActionContext.getRequest().setAttribute("account", null);
			ServletActionContext.getRequest().setAttribute("success",
					"取款成功,本次取款金额为:" + this.outputmoney);
			return "success";
		}
		if ("-1".equals(status)) {
			ServletActionContext.getRequest()
					.setAttribute("error", "取款失败,密码错误");
			return "error";
		}
		if ("-2".equals(status)) {
			ServletActionContext.getRequest()
					.setAttribute("error", "取款失败,余额不足");
			return "error";
		}
		if ("-3".equals(status)) {
			ServletActionContext.getRequest()
					.setAttribute("error", "取款失败,操作异常");
			return "error";
		}
		return "input";
	}
	/**注册*/
	public String regist() {
		boolean flag = this.accservice.regist(this.account, this.typeid,
				this.ibankid);
		System.out.println("flag="+flag);
		if (flag) {
			ServletActionContext.getRequest()
					.setAttribute("success", "成功添加新账户");
			return "success";
		}
		ServletActionContext.getRequest().setAttribute("error", "添加新账户失败");
		return "error";
	}
	/**挂失*/
	public String reportlost() {
		String status = this.accservice.reportlost(this.account.getId(),
				this.account.getPassword(), this.account.getIdentitycard(),
				this.account.getName());
		if ("1".equals(status)) {
			ServletActionContext.getRequest().setAttribute("success",
					"挂失成功,账号已禁用");
			return "success";
		}
		if ("-1".equals(status)) {
			ServletActionContext.getRequest().setAttribute("error",
					"挂失失败,账号不存在");
			return "error";
		}
		if ("-2".equals(status)) {
			ServletActionContext.getRequest().setAttribute("error",
					"挂失失败，密码或账号错误");
			return "error";
		}
		if ("-3".equals(status)) {
			ServletActionContext.getRequest().setAttribute("error",
					"挂失失败，身份证错误");
			return "error";
		}
		if ("-4".equals(status)) {
			ServletActionContext.getRequest()
					.setAttribute("error", "挂失失败，姓名错误");
			return "error";
		}
		if ("-5".equals(status)) {
			ServletActionContext.getRequest()
					.setAttribute("error", "挂失失败，操作错误");
			return "error";
		}
		if ("0".equals(status)) {
			ServletActionContext.getRequest().setAttribute("error",
					"账号异常,该账号已禁止使用");
			return "error";
		}
		return "input";
	}
	/**取消挂失*/
	public String canecllost() {
		String status = this.accservice.cancellost(this.account.getId(),
				this.account.getPassword(), this.account.getIdentitycard(),
				this.account.getName());
		if ("1".equals(status)) {
			ServletActionContext.getRequest().setAttribute("success",
					"操作成功,账号已恢复");
			return "success";
		}
		if ("-1".equals(status)) {
			ServletActionContext.getRequest().setAttribute("error",
					"操作失败,账号不存在");
			return "error";
		}
		if ("-2".equals(status)) {
			ServletActionContext.getRequest().setAttribute("error",
					"操作失败，密码或账号错误");
			return "error";
		}
		if ("-3".equals(status)) {
			ServletActionContext.getRequest().setAttribute("error",
					"操作失败，身份证错误");
			return "error";
		}
		if ("-4".equals(status)) {
			ServletActionContext.getRequest()
					.setAttribute("error", "操作失败，姓名错误");
			return "error";
		}
		if ("-5".equals(status)) {
			ServletActionContext.getRequest()
					.setAttribute("error", "操作失败，操作错误");
			return "error";
		}
		if ("0".equals(status)) {
			ServletActionContext.getRequest().setAttribute("error",
					"操作失败，账号正常,无需进行此操作");
			return "error";
		}
		return "input";
	}
	/**查询余额*/
	public String searchbalance() {
		Object status = this.accservice.searchbalance(this.account.getId(),
				this.account.getPassword());
		if ((status instanceof Double)) {
			ServletActionContext.getRequest().setAttribute("account", null);
			ServletActionContext.getRequest().setAttribute("success",
					"查询成功,该账号的余额为:" + (Double) status);
			return "success";
		}
		if ("-1".equals(status)) {
			ServletActionContext.getRequest().setAttribute("error",
					"查询失败,账号不存在");
			return "error";
		}
		if ("-2".equals(status)) {
			ServletActionContext.getRequest().setAttribute("error",
					"查询失败，密码或账号错误");
			return "error";
		}
		return "input";
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public void setIbankid(int ibankid) {
		this.ibankid = ibankid;
	}

	public void setInputmoney(double inputmoney) {
		this.inputmoney = inputmoney;
	}

	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}

	public void setOutputmoney(double outputmoney) {
		this.outputmoney = outputmoney;
	}

	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}

/*	
 * 转账操作，已弃用
 * public String transferaccount() {
		String status = this.accservice.transferaccount(this.account.getId(),
				this.account.getPassword(), this.inputaccid, this.inputmoney);
		if ("1".equals(status)) {
			ServletActionContext.getRequest().setAttribute("success",
					"转账成功,本次转账金额是:" + this.inputmoney);
			return "success";
		}
		if ("-1".equals(status)) {
			ServletActionContext.getRequest().setAttribute("error",
					"转账失败,转出账号不存在");
			return "error";
		}
		if ("-2".equals(status)) {
			ServletActionContext.getRequest().setAttribute("error",
					"转账失败,密码或账号错误");
			return "error";
		}
		if ("-3".equals(status)) {
			ServletActionContext.getRequest().setAttribute("error",
					"转账失败,转入账号不存在");
			return "error";
		}
		if ("-4".equals(status)) {
			ServletActionContext.getRequest().setAttribute("error",
					"账号异常,转入账号已禁止使用");
			return "error";
		}
		if ("-5".equals(status)) {
			ServletActionContext.getRequest().setAttribute("error",
					"转账失败,账号余额不足");
			return "error";
		}
		if ("-6".equals(status)) {
			ServletActionContext.getRequest()
					.setAttribute("error", "转账失败,操作异常");
			return "error";
		}
		if ("0".equals(status)) {
			ServletActionContext.getRequest().setAttribute("error",
					"账号异常,转出账号已禁止使用");
			return "error";
		}
		return "input";
	}
*/
	public void setFlag(int flag) {
		this.flag = flag;
	}

	public int getFlag() {
		return this.flag;
	}
}