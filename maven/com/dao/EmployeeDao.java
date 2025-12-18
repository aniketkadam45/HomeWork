package maven.com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import maven.com.entities.Employee;

public class EmployeeDao {

	public void insert(Employee E) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/student";

			Connection c = DriverManager.getConnection(url, "root", "Aniket@123");

			if (c != null) {
				System.out.println("Database is Connected...");
			}

			PreparedStatement ps = c.prepareStatement("insert into employee(id, name, city) values (?,?,?);");

			ps.setInt(1, E.getId());
			ps.setString(2, E.getName());
			ps.setString(3, E.getCity());
			ps.executeUpdate();

			System.out.println("Insert Query Executed!");

			c.close();
			ps.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update(Employee E) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/student";

			Connection c = DriverManager.getConnection(url, "root", "Aniket@123");

			if (c != null) {
				System.out.println("Database is Connected...");
			}

			PreparedStatement ps = c.prepareStatement("update employee set name = ?, city = ? where id = ?");

			ps.setString(1, E.getName());
			ps.setString(2, E.getCity());
			ps.setInt(3, E.getId());
			ps.executeUpdate();

			System.out.println("Update Query Executed!");

			c.close();
			ps.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(int id) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/student";

			Connection c = DriverManager.getConnection(url, "root", "Aniket@123");

			if (c != null) {
				System.out.println("Database is Connected...");
			}

			PreparedStatement ps = c.prepareStatement("delete from employee where id = ?");

			ps.setInt(1, id);
			ps.executeUpdate();

			System.out.println("Delete Query Executed!");

			c.close();
			ps.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void select() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/student";

			Connection c = DriverManager.getConnection(url, "root", "Aniket@123");

			if (c != null) {
				System.out.println("Database is Connected...");
			}

			PreparedStatement ps = c.prepareStatement("select * from employee;");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println("id : " + rs.getInt(1) + " " + " name : " + rs.getString(2) + " " + " city : "
						+ rs.getString(3));
			}

			System.out.println("Select Query Executed!");

			c.close();
			ps.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
