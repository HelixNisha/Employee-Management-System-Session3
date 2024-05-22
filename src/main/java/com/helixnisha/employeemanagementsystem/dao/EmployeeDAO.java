package com.helixnisha.employeemanagementsystem.dao;

import com.helixnisha.employeemanagementsystem.entity.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;


import java.util.List;

public class EmployeeDAO {

    private final SessionFactory sessionFactory;

    public EmployeeDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void saveEmployee(Employee employee) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            // Start a transaction
            transaction = session.beginTransaction();
            // Save the employee
            session.save(employee);
            // Commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List<Employee> getAllEmployees() {
        try (Session session = sessionFactory.openSession()) {
            // Retrieve all employees
            return session.createQuery("FROM Employee", Employee.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
