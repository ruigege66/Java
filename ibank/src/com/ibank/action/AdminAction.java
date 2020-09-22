package com.ibank.action;

import com.ibank.bean.Admin;
import com.ibank.bean.Ibank;
import com.ibank.service.IAdminService;
import com.ibank.service.impl.AdminServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Timestamp;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

@SuppressWarnings("serial")
public class AdminAction extends ActionSupport {
	static Logger logger=Logger.getLogger(AdminAction.class);
	private HttpServletRequest request;
	private HttpSession session;
	private IAdminService service;
	private Admin ad;
	private int ibankid;
	private String newpassword;

	/*构造方法*/
	public AdminAction() {
		this.request = ServletActionContext.getRequest();
		this.session = this.request.getSession();
		this.service = new AdminServiceImpl();
		logger=Logger.getLogger(this.getClass());
	}

	public Admin getAdmin() {
		return this.ad;
	}
	/**登录*/
	public String login() {
		/*if (("".equals(this.ad.getId())) || (this.ad.getId().length() == 0)) {
			super.addFieldError("error", "账户号不能为空");
			logger.error("登录失败:账户号不能为空");
			return "input";
		}
		if (("".equals(this.ad.getPassword()))
				|| (this.ad.getPassword().length() == 0)) {
			super.addFieldError("error", "密码不能为空");
			logger.error("登录失败:密码不能为空");
			return "input";
		}*/
		
		Object status = this.service.login(this.ad.getId(),
				this.ad.getPassword());

		if ((status instanceof Admin)) {
			Admin admin = (Admin) status;
			this.session.setAttribute("admin", admin);
			logger.info("当前操作员:" + admin.getName());
			return SUCCESS;
		}
		
		if ("-1".equals(status)) {
			logger.error("登录失败:账户号不存在");
			super.addFieldError("error", "账号不存在");
			return ERROR;
		}

		if ("-2".equals(status)) {
			logger.error("登录失败:密码错误");
			super.addFieldError("error", "密码错误");
			return ERROR;
		}

		if ("-3".equals(status)) {
			System.out.println("未知错误,登录失败");
			logger.error("未知错误,登录失败");
			super.addFieldError("error", "未知错误,登录失败");
			return ERROR;
		}
		return ERROR;
	}
	/**退出登录*/
	public String logout() {
		this.session.setAttribute("admin", null);
		logger.info("管理员退出");
		return "logout";
	}

	public void setAdmin(Admin admin) {
		this.ad = admin;
	}
	/**注册操作员*/
	public String regist() {
		Ibank ibank = this.service.getibank(getIbankid());
		if (ibank == null) {
			ServletActionContext.getRequest().setAttribute("error", "所属支行ID错误!");
			return ERROR;
		}
		this.ad.setIbank(ibank);
		this.ad.setStatus(Integer.valueOf(1));
		this.ad.setRegtime(new Timestamp(new Date().getTime()));
		boolean flag = this.service.regist(this.ad);
		if (flag) {
			ServletActionContext.getRequest().setAttribute("success", "注册成功!");
			return SUCCESS;
		}else{
			ServletActionContext.getRequest().setAttribute("error", "注册失败!");
			return ERROR;
		}
	}

	public void setIbankid(int ibankid) {
		this.ibankid = ibankid;
	}

	public int getIbankid() {
		return this.ibankid;
	}
	/**修改密码*/
	public String adminpwdchange() {
		String status = this.service.adminpwdchange(this.ad.getId(),
				this.ad.getPassword(), this.newpassword);
		if ("1".equals(status)) {
			ServletActionContext.getRequest().setAttribute("success",
					"密码以成功修改，请保管好密码");
			return SUCCESS;
		}
		if ("-1".equals(status)) {
			ServletActionContext.getRequest().setAttribute("error",
					"修改密码失败,此账号不存在");
			return ERROR;
		}
		if ("-2".equals(status)) {
			ServletActionContext.getRequest().setAttribute("error",
					"修改密码失败,原始密码错误");
			return ERROR;
		}
		if ("-3".equals(status)) {
			ServletActionContext.getRequest().setAttribute("error",
					"修改密码失败,请重新操作");
			return ERROR;
		}
		return ERROR;
	}
	
	/**删除操作员*/
	public  String deleteAdmin(){
		String  status=service.deleteAdmin(ad.getId());
		if ("1".equals(status)) {
			ServletActionContext.getRequest().setAttribute("success",
			"删除操作员成功");
			return SUCCESS;//删除成功
		}
		if("-1".equals(status)){
			ServletActionContext.getRequest().setAttribute("error",
			"该操作员不存在");
			return ERROR;
		}
		if ("-2".equals(status)) {
			ServletActionContext.getRequest().setAttribute("error",
			"删除失败,请重新操作");
			return ERROR;
		}
		return ERROR;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}

	public String getNewpassword() {
		return this.newpassword;
	}
	public static void main(String[] args){

	}
}
