package com.firstcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class FirstDemo {

	public static void main(String[] args) {
	
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
		Session s= factory.openSession();
		
		// by default enable
		
		Student st = s.get(Student.class, 1212);
		
		System.out.println(st);
		
		System.out.println("Working something");
		
		Student st2 = s.get(Student.class, 1212);
		
		System.out.println(st2);
		
		System.out.println(s.contains(st));
		
		s.close();
		factory.close();
	}

}
