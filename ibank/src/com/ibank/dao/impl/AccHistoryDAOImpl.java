package com.ibank.dao.impl;

import com.ibank.bean.Acchistory;
import com.ibank.bean.Account;
import com.ibank.util.HibernateSessionFactory;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;

public class AccHistoryDAOImpl extends BaseDAOimpl {
	
	/** 添加记录
	 *  @param acid 账户id
	 *  @param money 涉及金额
	 *  @param action 动作，即存款或取款，1存款、2取款
	 *  */
	public boolean addrecord(String acid, double money, int action) {
		Session session = HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			//获取账户信息
			Account account = (Account) session.get(Account.class, acid);
			//新建账户记录对象，并关联外键和设置属性
			Acchistory history = new Acchistory();
			history.setAccount(account);
			history.setAction(Integer.valueOf(action));
			history.setMoney(Double.valueOf(money));
			history.setTime(new Timestamp(new Date().getTime()));
			//保存记录
			session.save(history);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			session.getTransaction().rollback();
		} finally {
			session.close();
		}
		return false;
	}

	/** 分页查询结果集
	 *  @param hql hibernate查询语句
	 *  @param offset 从第几天记录开始查询
	 *  @param length 要查询几条记录
	 *  @return list<Object> 返回一组结果集*/
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Object> getListForPage(String hql, int offset, int length) {
		Session session = HibernateSessionFactory.getSessionFactory()
				.openSession();
		try {
			session.beginTransaction();
			//hibernate的查询方法处理分页查询,设置开始记录和要查询的记录条数
			List localList = session.createQuery(hql).setFirstResult(offset)
					.setMaxResults(length).list();
			return localList;
		} finally {
			session.getTransaction().commit();
		}
	}
	/**获取记录总数*/
	public int getAllRowCount(String hql) {
		Session session = HibernateSessionFactory.getSessionFactory()
				.openSession();
		try {
			session.beginTransaction();
			//调用hibernate session的查询语句的size()返回结果数量
			int size= session.createQuery(hql).list().size();
			return size;
		}catch (Exception e) {
			return 0;
		}
		finally {
			session.getTransaction().commit();
		}
	}
}