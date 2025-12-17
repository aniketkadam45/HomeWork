package com.statement.employee.controller;

import com.statement.employee.service.EmployeeService;

public class EmployeeController {
	public static void main(String[] args) throws Exception {
		EmployeeService ss = new EmployeeService();
//		ss.insert();
//		ss.update();
//		ss.getAllRecords();
//		ss.delete();
		ss.getoneRecords();
	}
}
