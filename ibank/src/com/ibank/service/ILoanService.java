package com.ibank.service;

import com.ibank.bean.Loan;
import com.ibank.bean.PageBean;

public abstract interface ILoanService
{
	/**贷款*/
	public abstract String loan(Loan loan);
	/**还贷款*/
	public boolean repayment(Loan loan);
	
	/**获取贷款信息
	 * @param 身份证号
	 * */
	public abstract Object getLoanInfo(String identitycard);
	
	/**获取一页正在贷款信息
	 * @param hql hibernate查询语句
	 * @param pageSize 每页显示多少条记录
	 * @param currentPage 当前第几页
	 * */
	public abstract PageBean getOnePageLoanInfo(String hql, int pageSize, int currentPage);
}