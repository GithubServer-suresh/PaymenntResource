package com.spring.rest.curd.dao;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.rest.curd.model.Payment;

@Repository
public class PaymentDaoImpl implements PaymentDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public String payNow(Payment payment) {
		getsession().save(payment);
		return "Payment successful with amount= "+payment.getAmount();
	}
	
	
	private Session getsession()
	{
		Session session=null;
		try {
			session=sessionFactory.getCurrentSession();
			
		}catch (HibernateException e) {
			session=sessionFactory.openSession();
		}
		return session;
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Payment> getTransactionInfo(String vendor) {
		return getsession().createCriteria(Payment.class).add(Restrictions.eq("vendor",vendor)).list();

	}
	
}
