package com.mapping.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		  SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		  Session s = factory.openSession();
		  Transaction tx = s.beginTransaction();
		  
		  Person p = new Person(23, "Ram", "Dhule", "532566");
		  
		  s.save(p);
		  
		  
		  
		  
		  tx.commit();
		  s.close();
		  factory.close();

	}

}
