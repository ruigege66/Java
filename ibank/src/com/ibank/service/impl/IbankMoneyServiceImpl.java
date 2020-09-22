package com.ibank.service.impl;

import com.ibank.dao.impl.IbankDAOImpl;
import com.ibank.service.IIbankMoneyService;

public class IbankMoneyServiceImpl implements IIbankMoneyService {
	IbankDAOImpl dao;

	public IbankMoneyServiceImpl() {
		this.dao = new IbankDAOImpl();
	}
	/**增加
	 * @param money 金额*/
	public boolean add(double money) {
		//调用修改金额方法，money为正，表示是添加金额 1表示支行编号
		return this.dao.changemoney(Integer.valueOf(1), money);
		
	}
	/**减少
	 * @param money 金额*/
	public boolean reduce(double money) {
		 //调用修改金额方法，money为负，表示是减少金额
		return this.dao.changemoney(Integer.valueOf(1), money);
	}

}