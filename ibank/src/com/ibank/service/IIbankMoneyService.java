package com.ibank.service;

public abstract interface IIbankMoneyService
{
	/**减少
	 * @param money 金额*/
	public abstract boolean reduce(double money);
	
	/**增加
	 * @param money 金额*/
	public abstract boolean add(double money);
}

