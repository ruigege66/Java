package com.ibank.service;

import com.ibank.bean.PageBean;

public abstract interface IAccHistoryService
{
	/**添加一条记录
	 * @param acid 账户id
	 * @param money 金额
	 * @param action 动作 1表示存款2表示取款
	 * */
	public abstract boolean addrecord(String acid, double money, int action);
	/**分页查询一页记录
	 * @param hql hibernate查询语句
	 * @param pageSize 每页显示多少记录
	 * @param currentPage 当前第几页
	 * @result PageBean 返回一页记录*/
	public  abstract PageBean getOnePage(String hql, int pageSize, int currentPage);
}