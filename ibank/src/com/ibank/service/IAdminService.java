package com.ibank.service;

import com.ibank.bean.Admin;
import com.ibank.bean.Ibank;
import com.ibank.bean.PageBean;

public abstract interface IAdminService
{
	/**操作员登录
	 * @param admid 操作员id
	 * @param password 密码
	 * @return Object 返回操作员信息或者String标志信息*/
	public abstract   Object login(String admid, String password);

	/**获取操作员信息
	 * @param admid 操作员id
	 * @result Admin 返回操作员信息或者空*/
	public  abstract  Admin getAdmin(String admid);

	/**注册操作员
	 * @param Admin 操作员信息*/
	public abstract   boolean regist(Admin admin);

	/**修改密码
	 * @param id 操作员id
	 * @param password 密码
	 * @param newpwd 新密码*/
	public  abstract  String adminpwdchange(String id, String password, String newpwd);
	
	/**分页查询一页操作员信息
	 * @param hql hibernate查询语句
	 * @param pageSize 每页显示几条记录
	 * @param currentPage 当前第几页
	 * @return PageBean 返回一页信息*/
	public  abstract  PageBean getOnePage(String hql, int pageSize, int currentPage);
	
	/**获取所属支行信息
	 * @param ibankid 支行id
	 * @return Ibank 返回ibank信息*/
	public abstract  Ibank getibank(int ibankid);
	
	/**删除一个操作员
	 * */
	public abstract String deleteAdmin(String admid);
}
