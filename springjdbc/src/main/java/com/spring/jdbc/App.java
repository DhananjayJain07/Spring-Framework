package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program Started..." );
        
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao studentDao= context.getBean("studentDao", StudentDao.class);
      
        Student student = new Student();
        //insert
        student.setId(999);
        student.setName("Shubham");
        student.setCity("Mumbai");
        
        int result = studentDao.insert(student);
        System.out.println("Student added: "+result);
        // update
  /*      Student student = new Student();
        student.setId(245);
        student.setName("Raj Kumar");
        student.setCity("Jalgoan");
        int result = studentDao.change(student);
        System.out.println("Data changed: "+result);
  */
        
        // delete
   /*     
        int result = studentDao.delete(245);
        System.out.println("deleted: "+result);*/
     /*   
        Student student = studentDao.getStudent(456);
        System.out.println(student);*/
        
        List<Student> students = studentDao.getAllStudents();
        
        for(Student s : students) {
        	System.out.println(s);
        }
        
    }
}
