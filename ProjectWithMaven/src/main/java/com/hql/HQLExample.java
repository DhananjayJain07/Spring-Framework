package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class HQLExample {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		 Session s = factory.openSession();		
		//HQL
		 //Syntax
		 String query="from Student as s where s.city =: x and s.name=:n";
		 
		 Query q =s.createQuery(query);
		 q.setParameter("x", "ABC");
		 q.setParameter("n", "John");
		 
		 //single- (Unique)
		 //multiple-list
		 List<Student>list = q.list();	
		 
		 for(Student stu : list) {
			 System.out.println(stu.getName());
			 System.out.println(stu.getCerti().getCourse());
		 }
		 
		 System.out.println("-----------------------");
		
		 Transaction tx = s.beginTransaction();
		 /* Delete
		 Query q2 = s.createQuery("delete from Student where city=:c");
		 q2.setParameter("c", "ABC");
		 int r = q2.executeUpdate();
		 System.out.println("Deleted...");
		 System.out.println(r);
		 */
		 
		 //Update
		 Query q3 = s.createQuery("update Student set city =: c where name =:n");
		 q3.setParameter("c", "Dhule");
		 q3.setParameter("n","Ravi Tiwari");
		 int d = q3.executeUpdate();
		 System.out.println(d);
		 
		 //  How to Execute join query
		 Query q4 = s.createQuery("select q.question, q.questionId,a.answer from Question as q INNER JOIN q.answers as a");
		 List<Object[]> list3 = q4.getResultList();	
		 for(Object[] arr : list3) {
			 System.out.println(Arrays.toString(arr));
		 }
		 tx.commit();
			 
		 
		 s.close();
		 factory.close();
	}

}
