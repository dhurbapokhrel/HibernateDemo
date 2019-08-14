package com.cubic.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cubic.entities.SalaryEntity;
import com.cubic.utils.HibernateUtil;




public class SalaryRepository {
	
public void save(SalaryEntity salaryEntity) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(salaryEntity);
		session.getTransaction().commit();
		session.close();
		
	}

	public SalaryEntity GetSalaryEntityById(int id) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		SalaryEntity salary = session.get(SalaryEntity.class, id);
		session.getTransaction().commit();
		session.close();
		
		
		return salary;
	}
	public void Update(SalaryEntity salaryEntity) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(salaryEntity);
		session.getTransaction().commit();
		session.close();
		
	}

}
