package com.ibank.dao.impl;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import org.hibernate.Session;

import com.ibank.bean.Account;
import com.ibank.util.HibernateSessionFactory;

public class InterestDAOImpl extends BaseDAOimpl {
	//结算利息
	public Double intestestMoney(String acid){
		Session session = HibernateSessionFactory.getSessionFactory()
				.openSession();
		try {
			session.beginTransaction();
			Account account=(Account) session.load(Account.class, acid);
			long days=new Date().getTime() / 86400000 - account.getInteresttime().getTime() / 86400000;
			if(days<=0){
				return 0.00;//利息值为零
			}
			//计算最终的金额
			double interest=account.getActype().getInterest().getValue();
			double interestmoney=(interest / 365) * days * account.getBalance();//利息
			//利息转换，截取小数位，四舍五入
			BigDecimal bd = new BigDecimal(interestmoney);
			BigDecimal bd2 = bd.setScale(4, BigDecimal.ROUND_HALF_UP);
			interestmoney=Double.valueOf(bd2.toString());
			//计算本金
			double principal=interestmoney +account.getBalance();
			//更新余额
			account.setBalance(principal);
			//更新利息结算时间
			account.setInteresttime(new Timestamp(new Date().getTime()));
			//更新到数据库
			session.update(account);
			session.getTransaction().commit();
			return interestmoney;//返回利息值
		} catch (Exception e) {
			System.out.println(e.getMessage());
			session.getTransaction().rollback();//回滚事务
		}finally{
			session.close();
		}
		return 0.00;
	}
}
