package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		
		 SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		 Student st1 = new Student();
		 st1.setId(14134);
		 st1.setName("Ankit Tiwari");
		 st1.setCity("Jalgoan");
		 
		 Certificate certificate = new Certificate();
		 certificate.setCourse("Android");
		 certificate.setDuration("2 Months");
		 st1.setCerti(certificate);
		 
		 Student st2 = new Student();
		 st2.setId(1212);
		 st2.setName("Ravi Tiwari");
		 st2.setCity("Shirpur");
		 
		 Certificate certificate1 = new Certificate();
		 certificate1.setCourse("Hibernate");
		 certificate1.setDuration("1.5 Months");
		 st2.setCerti(certificate1);
		 
		 Session s = factory.openSession();
		 Transaction tx = s.beginTransaction();
		 
		 //object save
		 s.save(st1);
		 s.save(st2);
		 
		 
		 tx.commit();
		 s.close();
		 factory.close();
	}

}
