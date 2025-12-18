package maven.com.service;

import maven.com.dao.EmployeeDao;
import maven.com.entities.Employee;

public class EmployeeService {

	public void insert(Employee E) throws Exception {
		EmployeeDao ed = new EmployeeDao();
		ed.insert(E);
	}

	public void update(Employee E) {
		EmployeeDao ed = new EmployeeDao();
		ed.update(E);
	}

	public void delete(int id) {
		EmployeeDao ed = new EmployeeDao();
		ed.delete(id);
	}

	public void select() {
		EmployeeDao ed = new EmployeeDao();
		ed.select();
	}
}
