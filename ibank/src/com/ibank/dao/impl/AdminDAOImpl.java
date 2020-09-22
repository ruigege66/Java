package com.ibank.dao.impl;

import com.ibank.bean.Admin;
import com.ibank.util.HibernateSessionFactory;
import org.hibernate.Session;

public class AdminDAOImpl extends BaseDAOimpl {
	/** 修改密码 
	 * @param id 操作员主键
	 * @param newpwd 新密码
	 * */
	public boolean changepwd(String id, String newpwd) {
		Session session = HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Admin ad = (Admin) session.load(Admin.class, id);
			ad.setPassword(newpwd);
			session.update(ad);
			session.getTransaction().commit();
			return true;
		} catch (Exception localException) {
		} finally {
			session.close();
		}
		return false;
	}
}