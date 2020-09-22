package com.ibank.service.impl;

import java.util.List;
import com.ibank.bean.Interest;
import com.ibank.dao.impl.InterestDAOImpl;
import com.ibank.service.IinterestService;

public class InterestSerivecImpl implements IinterestService {
	InterestDAOImpl dao;
	IbankMoneyServiceImpl ibankMoneyServiceImpl;

	public InterestSerivecImpl() {
		this.dao = new InterestDAOImpl();
		ibankMoneyServiceImpl=new IbankMoneyServiceImpl();
	}
	/**获取所有利率结果集
	 * @param hql hibernate查询语句*/
	@SuppressWarnings("rawtypes")
	public List getinterest(String hql) {
		List list = this.dao.list(hql);
		return list;
	}
	/**修改利率
	 * @param interest 利率信息
	 * */
	public String changeInterest(Interest interest) {
		boolean flag = this.dao.update(interest);
		if (flag) {
			return "1";//修改成功
		}
		return "-1";//修改失败，系统错误
	}
	/**结算利息*/
	public double intestestMoney(String acid){
		
		return dao.intestestMoney(acid);
	}
}