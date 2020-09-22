package com.ibank.dao.impl;

import com.ibank.dao.IBaseDAO;

import com.ibank.util.HibernateSessionFactory;

import java.io.Serializable;

import java.util.List;

import org.hibernate.Session;

public class BaseDAOimpl implements IBaseDAO {
	/**插入一条记录*/
	public boolean create(Object object) {
		boolean flag = false;
		Session session = HibernateSessionFactory.getSessionFactory()
				.openSession();
		try {
			System.out.println("进入插入记录行列");
			session.beginTransaction();

			session.save(object);

			session.getTransaction().commit();
			flag = true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			session.getTransaction().rollback();//事务回滚
		}finally{
			session.close();
		}
		return flag;
	}
	/**更新一条记录*/
	public boolean update(Object object) {
		boolean flag = false;
		Session session = HibernateSessionFactory.getSessionFactory()
				.openSession();
		try {
			session.beginTransaction();
			session.update(object);
			session.getTransaction().commit();
			flag = true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			session.getTransaction().rollback();//回滚事务
		}finally{
			session.close();
		}
		return flag;
	}
	/***删除一条记录*/
	public boolean delete(Object object) {
		boolean flag = false;
		Session session = HibernateSessionFactory.getSessionFactory()
				.openSession();
		try {
			session.beginTransaction();
			session.delete(object);
			session.getTransaction().commit();
			flag = true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			session.getTransaction().rollback();
		}finally{
			session.close();
		}
		return flag;
	}
	/**查询一条记录
	 * find方式获取记录只会获取一次，并且关闭会话
	 * */
	public Object find(Class<? extends Object> clazz, Serializable id) {
		Session session = HibernateSessionFactory.getSessionFactory()
				.openSession();
		try {
			session.beginTransaction();
			Object localObject2 = session.get(clazz, id);
			return localObject2;
		} finally {
			session.getTransaction().commit();
			session.close();
		}
	}
	/**查询一条记录
	 * load方式会将结果放在缓存中，并将会话保持，交给线程自动处理
	 * */
	public Object load(Class<? extends Object> clazz, Serializable id) {
		Session session = HibernateSessionFactory.getSessionFactory()
				.openSession();
		try {
			session.beginTransaction();
			Object localObject2 = session.load(clazz, id);
			return localObject2;
		} finally {
			session.getTransaction().commit();
		}
	}
	/**获取结果集*/
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Object> list(String hql) {
		Session session = HibernateSessionFactory.getSessionFactory()
				.openSession();
		try {
			session.beginTransaction();
			List localList = session.createQuery(hql).list();
			return localList;
		} finally {
			session.getTransaction().commit();
		}
	}
	/** 分页查询 
	 *@param hql hibernate查询语句
	 *@param offset 从第几条记录开始查询
	 *@param length 查询几条记录
	 * @return list<?> 返回一组结果集*/
	public List<?> getListForPage(String hql, int offset, int length) {
		Session session = HibernateSessionFactory.getSessionFactory()
				.openSession();
		try {
			session.beginTransaction();
			List<?> localList = session.createQuery(hql).setFirstResult(offset)
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
			
			int size= session.createQuery(hql).list().size();
			return size;
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
		finally {
			session.getTransaction().commit();
			session.close();
		}
	}
}