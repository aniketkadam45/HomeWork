package com.statement.employee.service;

import com.statement.employee.dao.EmployeeDao;

public class EmployeeService {

	public void insert() throws Exception {
		EmployeeDao sd = new EmployeeDao();
		sd.insert();
	}
	
	public void update() throws Exception {
		EmployeeDao sd = new EmployeeDao();
		sd.update();
	}
	
	public void getAllRecords() throws Exception {
		EmployeeDao sd = new EmployeeDao();
		sd.getAllRecords();
	}
	
	public void delete() throws Exception {
		EmployeeDao sd = new EmployeeDao();
		sd.delete();
	}

	public void getoneRecords() throws Exception {
		EmployeeDao sd = new EmployeeDao();
		sd.getoneRecords();
	}
}
