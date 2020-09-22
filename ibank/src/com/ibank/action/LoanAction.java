package com.ibank.action;

import org.apache.struts2.ServletActionContext;
import com.ibank.bean.Loan;
import com.ibank.service.ILoanService;
import com.ibank.service.impl.LoanServerImpl;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LoanAction extends ActionSupport {
	ILoanService loanService=new LoanServerImpl();
	private Loan loan;
	/**贷款*/
	public String loan(){
		//调用service层的贷款方法处理，获得返回的标志信息
		String status=loanService.loan(loan);
		if("1".equals(status)){
			ServletActionContext.getRequest().setAttribute("success",
			"贷款成功，请注意按时还贷");
			return SUCCESS;
		}
		if ("-1".equals(status)) {
			ServletActionContext.getRequest().setAttribute("error",
			"不能重复贷款");
			return ERROR;
		}
		if ("-2".equals(status)) {
			ServletActionContext.getRequest().setAttribute("error",
			"贷款失败");
			return ERROR;
		}
		return ERROR;
	}
	/**还贷款*/
	public String repayLoan(){
		System.out.println(loan.getRefundmoney());
		boolean falg=loanService.repayment(loan);
		if (falg) {
			ServletActionContext.getRequest().setAttribute("success",
			"已成功还贷款");
			return SUCCESS;//还款成功
		}
		ServletActionContext.getRequest().setAttribute("error", "还贷款失败");
		return ERROR;//还款失败
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	public Loan getLoan() {
		return loan;
	}
	/**获取指定贷款信息*/
	public String getLoanInfo(){
		Object obj=loanService.getLoanInfo(loan.getIdentitycard());
		
		if (obj instanceof Loan) {//如果返回的类型是Loan，说明查询成功
			Loan loan=(Loan) obj;
			ServletActionContext.getRequest().setAttribute("loanInfo", loan);
			return SUCCESS;//获取贷款信息成功
		}
		else{
			ServletActionContext.getRequest().setAttribute("error", "查询贷款信息失败");
			return ERROR;//获取贷款信息失败
		}
	}
}
