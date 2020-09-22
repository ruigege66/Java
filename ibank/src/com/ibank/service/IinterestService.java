package com.ibank.service;

import com.ibank.bean.Interest;
import java.util.List;

public abstract interface IinterestService
{
	/**获取所有利率结果集
	 * @param hql hibernate查询语句*/
	@SuppressWarnings("rawtypes")
	public abstract List getinterest(String hql);

	/**修改利率
	 * @param interest 利率信息
	 * */
	public abstract String changeInterest(Interest interest);
	
	/**结算利息*/
	public double intestestMoney(String acid);
}

