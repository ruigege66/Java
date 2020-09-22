package com.ibank.action;

import com.ibank.bean.Interest;
import com.ibank.service.IinterestService;
import com.ibank.service.impl.InterestSerivecImpl;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

@SuppressWarnings("serial")
public class InterestAction extends ActionSupport {
	private IinterestService iinterestService = new InterestSerivecImpl();
	private Interest interest;

	public Interest getInterest() {
		return this.interest;
	}
	
	@Override
	public String execute() throws Exception {
		return super.execute();
	}
	/**修改利率*/
	public String readjustmentofinterestrate() {
		String status = this.iinterestService.changeInterest(this.interest);
		if ("1".equals(status)) {
			ServletActionContext.getRequest().setAttribute("success", "利率修改成功");
			return SUCCESS;
		}
		ServletActionContext.getRequest().setAttribute("error", "利率修改失败");
		return ERROR;
	}

	public void setInterest(Interest interest) {
		this.interest = interest;
	}
}
