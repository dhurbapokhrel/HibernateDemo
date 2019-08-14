package com.cubic.repositories;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.cubic.entities.AddressEntity;
import com.cubic.entities.EmployeeEntity;
import com.cubic.utils.HibernateUtil;

public class AddressRepository {
	
	public void save(AddressEntity addressEntity) {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(addressEntity);
		session.getTransaction().commit();
		session.close();
	}
	public void update(AddressEntity addressEntity) {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(addressEntity);
		session.getTransaction().commit();
		session.close();
	}	
	
	public AddressEntity getAddressEntityById(int Id) {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		AddressEntity address =session.get(AddressEntity.class, Id);
		session.getTransaction().commit();
		session.close();
		
	return address;
	}
	
//	public EmployeeEntity getEmployeeEntityByName(String first_name) {
//		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//		Query query=session.createQuery("From EmployeeEntity Employee where Employee.first_name=:first_name");
//		query.setParameter("first_name", first_name);
//		List<EmployeeEntity> employees =(List<EmployeeEntity>)query.getResultList();
//		session.getTransaction().commit();
//		session.close();
//		if(employees.size()>0) {
//			return employees.get(0);
//		}
//			return null;
		
		
//	}

}
