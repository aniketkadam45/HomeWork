package com.employee.controller;

import java.util.Scanner;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

public class EmployeeController {
	Scanner sc = new Scanner(System.in);
	Employee e = new Employee();
	EmployeeService es = new EmployeeService();

	public void insert() {
		System.out.println("Enter Name :");
		String name = sc.nextLine();

		System.out.println("Enter email: ");
		String email = sc.nextLine();

		System.out.println("Enter city: ");
		String city = sc.nextLine();

		es.insert(name, email, city);

	}
	
	public void update() {
		System.out.println("Enter id to update :");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter new Name :");
		String name = sc.nextLine();

		System.out.println("Enter new email: ");
		String email = sc.nextLine();

		System.out.println("Enter new city: ");
		String city = sc.nextLine();

		es.update(id, name, email, city);

	}
	
	public void delete() {
		System.out.println("Enter id to delete :");
		int id = sc.nextInt();
		sc.nextLine();
	
		es.delete(id);

	}
	
	public void getAllData() {
		es.getAllData();
	}

	public static void main(String[] args) {

		EmployeeController ec = new EmployeeController();
		
//		ec.insert();
//		ec.update();
//		ec.delete();
		ec.getAllData();

	}
}
