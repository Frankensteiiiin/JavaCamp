package Inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer = new Customer();
		Employee employee = new Employee();

		CustomerManager customerManager = new CustomerManager();
		EmployeeManager employeeManager = new EmployeeManager();

		customerManager.add();
		customerManager.list();

	}

}