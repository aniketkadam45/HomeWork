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

	public void getSingleData(int id) { 
        es.getSingleData(id);
    }

	public static void main(String[] args) {

		EmployeeController ec = new EmployeeController();
		 Scanner sc = new Scanner(System.in);

        int choice;

        
        do { 
            System.out.println("\nChoose an operation:");
            System.out.println("1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. Get All Data");
            System.out.println("5. Get Single Data");
            System.out.println("6. Exit"); 

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    ec.insert();
                    break;
                case 2:
                    ec.update();
                    break;
                case 3:
                    ec.delete();
                    break;
                case 4:
                    ec.getAllData();
                    break;
                case 5:
                    System.out.println("Enter ID:");
                    int id = sc.nextInt();
                    sc.nextLine();
                    ec.getSingleData(id);
                    break;
                case 6: // exit option
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 6);
	}
}

