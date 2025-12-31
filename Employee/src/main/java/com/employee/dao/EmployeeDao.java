package com.employee.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.employee.entity.Employee;

public class EmployeeDao {
	public void insert(String name, String email, String city) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Employee e = new Employee();
		e.setName(name);
		e.setCity(city);
		e.setEmail(email);

		ss.persist(e);
		System.out.println("Data is Inserted");

		tr.commit();
		ss.close();
	}

	public void update(int id, String name, String email, String city) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Employee e = new Employee();
		e.setId(id);
		e.setName(name);
		e.setCity(city);
		e.setEmail(email);

		ss.merge(e);
		System.out.println("Data is Updated");

		tr.commit();
		ss.close(); 
	}

	public void delete(int id) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Employee e = new Employee();
		e.setId(id);

		ss.remove(e);
		System.out.println("Data is Deleted");

		tr.commit();
		ss.close();
	}
	
	public void getAllData() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Employee e = new Employee();
	
		String query = "from Employee";
		Query<Employee> q =   ss.createQuery(query, Employee.class);
		
		List<Employee> list = q.list();
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		tr.commit();
		ss.close();
	}

	public void getSingleData(int id) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String query = "from Employee where id = :id";
		Query<Employee> q = ss.createQuery(query, Employee.class);

		q.setParameter("id", id);

		Employee e = q.uniqueResult();
		System.out.println(e);

		tr.commit();
		ss.close();
	}
}

