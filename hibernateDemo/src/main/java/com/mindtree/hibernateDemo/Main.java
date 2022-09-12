package com.mindtree.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory = new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Employee.class).
				buildSessionFactory();
		
		
		//create a Session
		Session session = sessionFactory.getCurrentSession();
	
		
		try{
			
			System.out.println("Creating a new Employee object...");
			
			//create the Student object
			Employee student = new Employee(1, "Krupali", 24);
			
			//start a transaction
			session.beginTransaction();
			
			//Save the Student object to the database
			session.save(student);
			
			System.out.println("Java object saved to the database");
			//commit the transaction
			session.getTransaction().commit();
			
		}finally{
			
			sessionFactory.close();
		}
	}

}
