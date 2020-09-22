package com.ibank.dao.impl;

import com.ibank.bean.Ibankmoney;
import com.ibank.util.HibernateSessionFactory;
import org.hibernate.Session;

public class IbankDAOImpl extends BaseDAOimpl {
	
	/**更新总行金额
	 * @param i 总行编号
	 * @param money 涉及的金额(正数表示添加，负数表示减少)
	 * */
	public boolean changemoney(Integer i, double money) {
		boolean flag = false;
		Session session = HibernateSessionFactory.getSessionFactory()
				.openSession();
		try {
			session.beginTransaction();
			Ibankmoney ibankmoney = (Ibankmoney) session.get(Ibankmoney.class,
					1);
			double imoney = ibankmoney.getMoney();
			ibankmoney.setMoney(Double.valueOf(imoney + money));
			session.update(ibankmoney);
			session.getTransaction().commit();
			flag = true;
		} catch (Exception e) {
			session.getTransaction().rollback();
		} finally {
			session.close();
		}
		return flag;
	}
}