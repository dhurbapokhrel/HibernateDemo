package com.cubic.repositories;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.cubic.entities.EmployeeEntity;
import com.cubic.utils.HibernateUtil;


public class EmployeeRepository {
	
	public void save(EmployeeEntity employeeEntity) {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(employeeEntity);
		session.getTransaction().commit();
		session.close();
	}
	public void update(EmployeeEntity employeeEntity) {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(employeeEntity);
		session.getTransaction().commit();
		session.close();
	}	
	
	public EmployeeEntity getEmployeeEntityById(int Id) {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		EmployeeEntity employee =session.get(EmployeeEntity.class, Id);
		session.getTransaction().commit();
		session.close();
		
	return employee;
	}
	
	public EmployeeEntity getEmployeeEntityByName(String first_name) {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query=session.createQuery("From EmployeeEntity Employee where Employee.first_name=:first_name");
		query.setParameter("first_name", first_name);
		List<EmployeeEntity> employees =(List<EmployeeEntity>)query.getResultList();
		session.getTransaction().commit();
		session.close();
		if(employees.size()>0) {
			return employees.get(0);
		}
			return null;
		
		
	}
}
