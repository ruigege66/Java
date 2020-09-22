package com.ibank.dao.impl;

import org.hibernate.Session;
import com.ibank.bean.Account;
import com.ibank.util.HibernateSessionFactory;

public class AccountDAOImpl extends BaseDAOimpl{
	/*
	//同时更新2个记录
	public boolean updateTwo(Object object1, Object object2) {
		boolean flag = false;
		Session session = HibernateSessionFactory.getSessionFactory()
				.openSession();
		try {
			session.beginTransaction();
			session.update(object1);
			session.update(object2);
			session.getTransaction().commit();
			flag = true;
		} catch (Exception e) {
			session.getTransaction().rollback();
		} finally {
			session.close();
		}
		return flag;
	}
	*/
	/**更改余额(可用于存款和取款)
	 * @param accid 账户id号(卡号)
	 * @param money 正数表示存款，负数表示取款*/
	public boolean changeMoney(String accid, double money) {
		boolean flag = false;
		Session session = HibernateSessionFactory.getSessionFactory()
				.openSession();
		try {
			session.beginTransaction();
			Account ac = (Account) session.get(Account.class, accid);
			double balance = ac.getBalance().doubleValue();
			ac.setBalance(Double.valueOf(balance + money));
			session.update(ac);
			session.getTransaction().commit();
			flag = true;
		} catch (Exception e) {
			session.getTransaction().rollback();
		} finally {
			session.close();
		}
		return flag;
	}
	/*更新余额(调用存储过程实现月末计算利息)
	@SuppressWarnings("deprecation")
	public String updatebalance(int interestid) {
		Session session = HibernateSessionFactory.getSessionFactory()
				.openSession();
		try {
			session.beginTransaction();
			java.sql.Connection con=session.connection();
			String procedure = "{call pro_updatebalance(?) }";
			java.sql.CallableStatement cstmt = con.prepareCall(procedure);
			cstmt.setInt(1,1);
			cstmt.executeUpdate();
			session.getTransaction().commit();
			
			return "1";
		} catch (Exception e) {
			session.getTransaction().rollback();
		} finally {
			session.close();
		}
		return "-1";
	}
	 */
}
