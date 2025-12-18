package maven.com.app;

import maven.com.controller.EmployeeController;

public class EmployeeApp {

	public static void main(String[] args) throws Exception {

		EmployeeController ec = new EmployeeController();
//		ec.insert();
//		ec.update();
//		ec.delete();
		ec.select();
	}
}
