package com.preparedstatement.employee.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeDao {

	public void insert() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/Student";

		try {

			Connection c = DriverManager.getConnection(url, "root", "Aniket@123");

			if (c != null) {
				System.out.println("Database is Connected...");
			}

			PreparedStatement ps = c.prepareStatement("insert into employee(id, name, city) values (?,?,?);");

			ps.setInt(1, 1);
			ps.setString(2, "Aniket");
			ps.setString(3, "pune");
			ps.executeUpdate();

			ps.setInt(1, 2);
			ps.setString(2, "Santosh");
			ps.setString(3, "pcmc");
			ps.executeUpdate();

			ps.setInt(1, 3);
			ps.setString(2, "Ashutosh");
			ps.setString(3, "nagar");
			ps.executeUpdate();

			System.out.println("Insert Query Executed!");

			c.close();
			ps.close();

		} catch (Exception e) {
//			throw e;
			System.out.println("Error!");
		}
	}

	public void update() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/Student";

		try {

			Connection c = DriverManager.getConnection(url, "root", "Aniket@123");

			if (c != null) {
				System.out.println("Database is Connected...");
			}

			PreparedStatement ps = c.prepareStatement("update employee set name = ?, city = ? where id = ?");

			ps.setString(1, "Sanket");
			ps.setString(2, "mumbai");
			ps.setInt(3, 1);
			ps.executeUpdate();

			System.out.println("Update Query Executed!");

			c.close();
			ps.close();

		} catch (Exception e) {
			throw e;
//			System.out.println("Error!");
		}
	}

	public void select() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/Student";
		
		try {
			
			Connection c = DriverManager.getConnection(url, "root", "Aniket@123");
			
			if (c != null) {
				System.out.println("Database is Connected...");
			}
			
			PreparedStatement ps = c.prepareStatement("select * from employee;");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println("id : " + rs.getInt(1) + " " + " name : " + rs.getString(2) + " " + " city : " + rs.getString(3));
			}
			
			System.out.println("Select Query Executed!");
			
			c.close();
			ps.close();
			
		} catch (Exception e) {
			throw e;
//			System.out.println("Error!");
		}
	}
	
	public void delete() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/Student";

		try {

			Connection c = DriverManager.getConnection(url, "root", "Aniket@123");

			if (c != null) {
				System.out.println("Database is Connected...");
			}

			PreparedStatement ps = c.prepareStatement("delete from employee where id = ?");
			
			ps.setInt(1, 3);
			ps.executeUpdate();

			System.out.println("Delete Query Executed!");

			c.close();
			ps.close();

		} catch (Exception e) {
			throw e;
//			System.out.println("Error!");
		}
	}
	
	public void selectone() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/Student";
		
		try {
			
			Connection c = DriverManager.getConnection(url, "root", "Aniket@123");
			
			if (c != null) {
				System.out.println("Database is Connected...");
			}
			
			PreparedStatement ps = c.prepareStatement("select * from employee limit 1;");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println("id : " + rs.getInt(1) + " " + " name : " + rs.getString(2) + " " + " city : " + rs.getString(3));
			}
			
			System.out.println("Select Query Executed!");
			
			c.close();
			ps.close();
			
		} catch (Exception e) {
			throw e;
//			System.out.println("Error!");
		}
	}
}
