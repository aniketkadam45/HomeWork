package com.preparedstatement.employee.service;

import com.preparedstatement.employee.dao.EmployeeDao;

public class EmployeeService {
	
	public void insert() throws Exception {
		EmployeeDao sd = new EmployeeDao();
		sd.insert();
	}
	
	public void update() throws Exception {
		EmployeeDao sd = new EmployeeDao();
		sd.update();
	}

	public void select() throws Exception {
		EmployeeDao sd = new EmployeeDao();
		sd.select();
	}

	public void delete() throws Exception {
		EmployeeDao sd = new EmployeeDao();
		sd.delete();
	}
	
	public void selectone() throws Exception {
		EmployeeDao sd = new EmployeeDao();
		sd.selectone();
	}
}
