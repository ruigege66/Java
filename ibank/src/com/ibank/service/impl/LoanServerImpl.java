package com.ibank.service.impl;

import java.util.Date;
import java.util.List;
import com.ibank.bean.Interest;
import com.ibank.bean.Loan;
import com.ibank.bean.PageBean;
import com.ibank.dao.IBaseDAO;
import com.ibank.dao.impl.BaseDAOimpl;
import com.ibank.service.IIbankMoneyService;
import com.ibank.service.ILoanService;

public class LoanServerImpl implements ILoanService {
	IBaseDAO dao=new BaseDAOimpl();
	IIbankMoneyService ibankMoneyServiceImpl=new IbankMoneyServiceImpl();
	/**办理贷款*/
	public String loan(Loan loan) {
		//查询该用户是否已用身份证办理过贷款
		List<Object> list=dao.list("from Loan l where l.identitycard='"+loan.getIdentitycard()+"' and l.status=1");

		if (list.size()>0) {
			return "-1";//身份证已经贷款，不能重复贷款
		}
		Interest interest=(Interest) dao.find(Interest.class, 7);//查找利率
		loan.setStatus(1);//设置为贷款状态
		loan.setInterest(interest);//设置利率
		if(!dao.create(loan)){
			return "-2";//贷款失败
		}else {
			ibankMoneyServiceImpl.reduce(loan.getLoandays());//从总行金额中减去金额
			return "1";//贷款成功
		}
	}
	/**获取指定贷款信息*/
	public Object getLoanInfo(String identitycard){
		//查询贷款记录
		List<?> list=dao.list("from Loan l where l.identitycard='"+identitycard+"' and l.status=1");
		if (list.size()<=0) {
			return "-1";//获取贷款信息失败
		}
		else return list.get(0);//返回查询到的记录
	}
	/**获取一页正在贷款信息*/
	public PageBean getOnePageLoanInfo(String hql, int pageSize, int currentPage){
		int offset=(currentPage-1)*pageSize;
		int length=pageSize;
		int allRow=dao.getAllRowCount(hql);
		List<?> list=dao.getListForPage(hql, offset, length);
		PageBean pageBean=new PageBean(list, allRow, pageSize, currentPage);
		return pageBean;
	}
	/**偿还贷款*/
	public boolean repayment(Loan loan) {
		Loan loan2=(Loan)getLoanInfo(loan.getIdentitycard());
		double refundmoney=loan.getRefundmoney();//贷款偿还的金额数
		loan2.setEndtime(new Date());
		loan2.setLoandays(loan.getLoandays());
		loan2.setStatus(0);
		loan2.setRefundmoney(refundmoney);
		if (dao.update(loan2)){
			//更新总行金额
			ibankMoneyServiceImpl.add(refundmoney);
			return true;
		}
		return false;
	}
}
