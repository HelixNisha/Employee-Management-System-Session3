package com.helixnisha.employeemanagementsystem;

import com.helixnisha.employeemanagementsystem.dao.EmployeeDAO;
import com.helixnisha.employeemanagementsystem.entity.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class EmployeeManagementSystemApplication {
	public static void main(String[] args) {
		try (SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory()) {

			EmployeeDAO employeeDAO = new EmployeeDAO(sessionFactory);

			// Retrieving all employees
			List<Employee> employees = employeeDAO.getAllEmployees();
			for (Employee employee : employees) {
				// Print employee details in desired format
				System.out.println("FirstName is " + employee.getFirstName() + ", Last Name is " +
						employee.getLastName() + ", and Email is " + employee.getEmail());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
