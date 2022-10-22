package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		// get(), load()
		
		 SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		 Session session = factory.openSession();
		 // get student 102
		 Student student=(Student)session.load(Student.class, 102);
		 System.out.println(student);
		 
		 Address ad =(Address)session.get(Address.class, 1);
		 System.out.println(ad.getStreet()+": "+ad.getCity());
		 
		 session.close();
		 factory.close();
	}

}
