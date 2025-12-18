package maven.com.controller;

import java.util.Scanner;

import maven.com.entities.Employee;
import maven.com.service.EmployeeService;

public class EmployeeController {

	EmployeeService es = new EmployeeService();
	Scanner sc = new Scanner(System.in);

	public void insert() throws Exception {

		System.out.print("Enter id : ");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter name : ");
		String name = sc.nextLine();

		System.out.print("Enter city : ");
		String city = sc.nextLine();

		Employee E = new Employee(id, name, city);
		es.insert(E);
	}

	public void update() throws Exception {

		System.out.print("Enter id which you want to update : ");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter new name : ");
		String name = sc.nextLine();

		System.out.print("Enter new city : ");
		String city = sc.nextLine();

		Employee E = new Employee(id, name, city);
		es.update(E);
	}

	public void delete() throws Exception {

		System.out.print("Enter id which you want to delete : ");
		int id = sc.nextInt();
		sc.nextLine();

		es.delete(id);
	}

	public void select() throws Exception {
		es.select();
		System.out.println();
	}

}
