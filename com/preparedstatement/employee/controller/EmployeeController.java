package com.preparedstatement.employee.controller;

import com.preparedstatement.employee.service.EmployeeService;

public class EmployeeController {
	
	public static void main(String[] args) throws Exception {
		EmployeeService ss = new EmployeeService();
//		ss.insert();
//		ss.update();
//		ss.select();
//		ss.delete();
		ss.selectone();
	}
}
