package com.statement.employee.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDao {
	public void insert() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/Student";

		try {

			Connection c = DriverManager.getConnection(url, "root", "Aniket@123");

			Statement s = c.createStatement();

			if (c != null) {
				System.out.println("Database is Connected...");
			}

			s.executeUpdate(
					"insert into emp(id, name, city) values (1, 'Aniket','pune'), (2, 'Santosh','pcmc'), (3, 'raja','Nagar');");
			System.out.println("Insert Query Executed!");

			c.close();
			s.close();

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

			Statement s = c.createStatement();

			if (c != null) {
				System.out.println("Database is Connected...");
			}

			s.executeUpdate("UPDATE emp SET name = 'John', city = 'chainnai' WHERE id = 1;");
			System.out.println("Update Query Executed!");

			c.close();
			s.close();

		} catch (Exception e) {
//			throw e;
			System.out.println("Error!");
		}
	}

	public void getAllRecords() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/Student";

		try {

			Connection c = DriverManager.getConnection(url, "root", "Aniket@123");

			Statement s = c.createStatement();

			if (c != null) {
				System.out.println("Database is Connected...");
			}

			ResultSet rs = s.executeQuery("select * from emp;");
			System.out.println("Select Query Executed!");

			while (rs.next()) {
				System.out.println("id : " + rs.getInt(1) + " " + " name : " + rs.getString(2) + " " + " city : "
						+ rs.getString(3));
			}

			c.close();
			s.close();

		} catch (Exception e) {
//				throw e;
			System.out.println("Error!");
		}
	}

	public void delete() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/Student";

		try {

			Connection c = DriverManager.getConnection(url, "root", "Aniket@123");

			Statement s = c.createStatement();

			if (c != null) {
				System.out.println("Database is Connected...");
			}

			s.executeUpdate("delete from emp where id = 1;");
			System.out.println("Delete Query Executed!");

			c.close();
			s.close();

		} catch (Exception e) {
//				throw e;
			System.out.println("Error!");
		}
	}

	public void getoneRecords() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/Student";

		try {

			Connection c = DriverManager.getConnection(url, "root", "Aniket@123");

			Statement s = c.createStatement();

			if (c != null) {
				System.out.println("Database is Connected...");
			}

			ResultSet rs = s.executeQuery("select * from emp limit 1;");
			System.out.println("Select Query Executed!");

			while (rs.next()) {
				System.out.println("id : " + rs.getInt(1) + " " + " name : " + rs.getString(2) + " " + " city : "
						+ rs.getString(3));
			}

			c.close();
			s.close();

		} catch (Exception e) {
//				throw e;
			System.out.println("Error!");
		}
	}
}
