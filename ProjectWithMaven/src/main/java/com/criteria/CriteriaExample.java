package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.tut.Student;

public class CriteriaExample {

	public static void main(String[] args) {
		
		 SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		 
		 Session s = factory.openSession();
		 
		Criteria c = s.createCriteria(Student.class);
		
	//	c.add(Restrictions.eq("certi.course", "Android"));
	//	c.add(Restrictions.gt("id", 12));
		c.add(Restrictions.like("certi.course", "J%"));
		List<Student> st = c.list();
		
		for(Student stu : st) {
			System.out.println(stu);
		}
		
		
		
		
		
		
	
		 s.close();
		 factory.close();
	}

}
