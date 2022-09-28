package inheritance;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
		customer.age = 25;
		employee.age= 35;
		
		CustomerManager customerManager = new CustomerManager();
		EmployeeManager employeeManager = new EmployeeManager();
		
		customerManager.Add();
		employeeManager.BestEmployee();
		employeeManager.List();
		
		
		
		
		
		
	}

}