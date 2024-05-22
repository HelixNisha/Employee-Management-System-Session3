package com.helixnisha.employeemanagementsystem;

import com.helixnisha.employeemanagementsystem.dao.EmployeeDAO;
import com.helixnisha.employeemanagementsystem.entity.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class EmployeeManagementSystemApplication {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();

		EmployeeDAO employeeDAO = new EmployeeDAO(sessionFactory);

		// Creating and saving a new employee
		Employee newEmployee = new Employee();
		newEmployee.setFirstName("John");
		newEmployee.setLastName("Deo");
		newEmployee.setEmail("john.doe@example.com");

		employeeDAO.saveEmployee(newEmployee);

		// Retrieving all employees
		List<Employee> employees = employeeDAO.getAllEmployees();
		for (Employee employee : employees) {
			System.out.println(employee);
		}

		sessionFactory.close(); // Don't forget to close the session factory
	}
}
