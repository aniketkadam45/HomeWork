package com.employee.service;

import com.employee.dao.EmployeeDao;

public class EmployeeService {
	public void insert(String name, String email, String city) {
		EmployeeDao ed = new EmployeeDao();
		ed.insert(name, email, city);
	}

	public void update(int id, String name, String email, String city) {
		EmployeeDao ed = new EmployeeDao();
		ed.update(id, name, email, city);
	}

	public void delete(int id) {
		EmployeeDao ed = new EmployeeDao();
		ed.delete(id);
	}

	public void getAllData() {
		EmployeeDao ed = new EmployeeDao();
		ed.getAllData();
	}

	public void getSingleData(int id) {
		EmployeeDao ed = new EmployeeDao();
		ed.getSingleData(id);
	}
}

