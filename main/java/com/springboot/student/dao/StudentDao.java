package com.springboot.student.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.student.entity.Student;

@Repository
public class StudentDao {

	@Autowired
	SessionFactory sf;

	public String insertData(Student s) {

		Session session = sf.openSession();

		Transaction tr = session.beginTransaction();

		session.persist(s);

		tr.commit();
		session.close();

		return "Data is inserted ... !";
	}

	public String deleteData(int id) {

		Session session = sf.openSession();

		Transaction tr = session.beginTransaction();

		Student s = session.get(Student.class, id);

		session.remove(s);

		tr.commit();
		session.close();

		return "Data is deleted ... !";
	}
	
	
	public Student getSingleData(int id) {

		Session session = sf.openSession();

		Transaction tr = session.beginTransaction();

		String hql = "from Student where id= :id";
		Query<Student> query =  session.createQuery(hql);
		query.setParameter("id", id);
		Student s = query.uniqueResult();

		tr.commit();
		session.close();

		return s;
	}

}
