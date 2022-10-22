package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.Certificate;
import com.tut.Student;

public class StateDemo {

	public static void main(String[] args) {
		
		 SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		 
		 Student st = new Student();
		 st.setId(1414);
		 st.setName("Peter");
		 st.setCity("ABC");
		 st.setCerti(new Certificate("Java", "2 Months"));
		 // Transient State
		 
		 Session s = factory.openSession();
		 Transaction tx = s.beginTransaction();
		 s.save(st);
		 // Persistent State - session, databases
		 st.setName("John");
		 tx.commit();
		 
		 s.close();
		 // Detached State
		 st.setName("Sachin");
		 System.out.println(st);
		 factory.close();
	}

}
