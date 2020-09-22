package com.ibank.service.impl;

import java.util.List;

import com.ibank.bean.Admin;
import com.ibank.bean.Ibank;
import com.ibank.bean.PageBean;
import com.ibank.dao.impl.AdminDAOImpl;
import com.ibank.service.IAdminService;

public class AdminServiceImpl implements IAdminService {
	AdminDAOImpl dao;
	//构造函数，初始化对象
	public AdminServiceImpl() {
		this.dao = new AdminDAOImpl();
	}
	/**操作员登录
	 * @param admid 操作员id
	 * @param password 密码
	 * @return Object 返回操作员信息或者String标志信息*/
	public Object login(String admid, String password) {
		Admin ad = null;
		try {
			ad = (Admin) this.dao.find(Admin.class, admid);

			if ((ad == null) || (ad.getStatus() == 0)) {
				return "-1";//操作员不存在
			}
			if (!password.equals(ad.getPassword())) {
				return "-2";//密码错误
			}
			return ad;//登录成功，返回操作员信息
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "-3";//操作异常
	}
	/**获取操作员信息
	 * @param admid 操作员id
	 * @result Admin 返回操作员信息或者空*/
	public Admin getAdmin(String admid) {
		Admin admin = null;
		try {
			admin = (Admin) this.dao.find(Admin.class, admid);
		} catch (Exception e) {
			System.out.println("getadmin方法出现异常,获取admin失败!");
			e.getMessage();
		}
		return admin;
	}
	/**注册操作员
	 * @param Admin 操作员信息*/
	public boolean regist(Admin admin) {
		boolean flag = false;
		try {
			flag = this.dao.create(admin);
		} catch (Exception e) {
			System.out.println("UserDao.login方法发生异常:");
			e.printStackTrace();
		}
		return flag;
	}
	/**获取所属支行信息
	 * @param ibankid 支行id
	 * @return Ibank 返回ibank信息*/
	public Ibank getibank(int ibankid) {
		System.out.println("调试1：银行id...."+ibankid);
		return (Ibank) this.dao.find(Ibank.class, Integer.valueOf(ibankid));
	}
	/**修改密码
	 * @param id 操作员id
	 * @param password 密码
	 * @param newpwd 新密码*/
	public String adminpwdchange(String id, String password, String newpwd) {
		Admin ad = (Admin) this.dao.find(Admin.class, id);
		if ((ad == null) || (ad.getType().intValue() == 0)) {
			return "-1";//账号不存在
		}
		if (!ad.getPassword().equals(password)) {
			return "-2";//原始密码错误
		}
		ad.setPassword(newpwd);
		boolean flag = this.dao.changepwd(id, newpwd);
		if (!flag) {
			return "-3";//操作失败，系统错误
		}
		return "1";//操作成功
	}
	/**分页查询一页操作员信息
	 * @param hql hibernate查询语句
	 * @param pageSize 每页显示几条记录
	 * @param currentPage 当前第几页
	 * @return PageBean 返回一页信息*/
	public PageBean getOnePage(String hql, int pageSize, int currentPage){
		//计算从第几条记录开始
		int offset=(currentPage-1)*pageSize;
		int length=pageSize;
		List<?> list=dao.getListForPage(hql, offset, length);
		int allRow=dao.getAllRowCount(hql);
		return new PageBean(list,allRow,pageSize,currentPage);
	}
	
	/**删除一个操作员
	 * */
	public String deleteAdmin(String admid){
		//先查找操作员记录
		Admin admin=(Admin) dao.load(Admin.class, admid);
		if(admin==null){
			return "-1";//操作员不存在
		}
		if (!dao.delete(admin)) {
			return "-2";//删除失败，系统错误
		}else {
			return "1";//删除成功
		}
	}
}