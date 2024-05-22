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
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(employee);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public List<Employee> getAllEmployees() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("from Employee", Employee.class).list();
        }
    }
}
