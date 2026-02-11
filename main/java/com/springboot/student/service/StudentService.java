package com.springboot.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.student.dao.StudentDao;
import com.springboot.student.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentDao dao;
	
	public String insertData(Student s) {
		String msg = dao.insertData(s);
		return msg;
	}
	
	public String deleteData(int id) {
		String msg = dao.deleteData(id);
		return msg;
	}
	
	public Student getSingleData(int id) {
		Student s = dao.getSingleData(id);
		return s;
	}

}
