package com.ibank.service.impl;

import java.util.List;

import com.ibank.bean.PageBean;
import com.ibank.dao.impl.AccHistoryDAOImpl;
import com.ibank.service.IAccHistoryService;

public class AccHistoryServiecImpl implements IAccHistoryService {
	AccHistoryDAOImpl dao = new AccHistoryDAOImpl();
	
	/**添加一条账户操作记录
	 * @param acid 用户账号id
	 * @param money 金额(正数为存钱，负数为取款)
	 * @param action 1表示存款，2表示取款
	 * @return boolean*/
	public boolean addrecord(String acid, double money, int action) {
		return this.dao.addrecord(acid, money, action);
	}
	
	/**分页查询第几页
	 * @param hql hibernate查询语句
	 * @param pageSize 每页显示几条记录
	 * @param currentPage 当前第几页
	 * @return PageBean 返回一页信息*/
	public PageBean getOnePage(String hql, int pageSize, int currentPage){
		int offset=(currentPage-1)*pageSize;
		int length=pageSize;
		List<Object> list=dao.getListForPage(hql, offset, length);
		int allRow=dao.getAllRowCount(hql);
		return new PageBean(list,allRow,pageSize,currentPage);
	}
	
}