package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;



public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
       StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
//       Student student = new Student(2324,"Ram Patil","Jalgoan");
//       int e = studentDao.insert(student);
//       System.out.println("done "+e);
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       boolean go = true;
       while(go) {
       System.out.println("PRESS 1 for add new student");
       System.out.println("PRESS 2 for display all student");
       System.out.println("PRESS 3 for get details of single student");
       System.out.println("PRESS 4 for delete student");
       System.out.println("PRESS 5 for upadte student");
       System.out.println("PRESS 6 for exit");
       try {
    	   int input = Integer.parseInt(br.readLine());
    	   
    	   switch (input) {
		case 1:
			// taking input from user
			System.out.println("Enter Student id: ");
			 int sid = Integer.parseInt(br.readLine());
			 
			 System.out.println("Enter student name: ");
			 String sname= br.readLine();
			 
			 System.out.println("Enter student city: ");
			 String scity= br.readLine();
			 // creating object and setting values
			 Student student = new Student();
			 student.setStudentId(sid);
			 student.setStudentName(sname);
			 student.setStudentCity(scity);
			 
			 int r = studentDao.insert(student);
			 System.out.println(r+" Student added");
			 System.out.println("**********************************");
			 System.out.println();
			break;
		case 2:
			System.out.println("**********************************");
			List<Student> allStudents = studentDao.getAllStudents();
			for(Student s : allStudents) {
				System.out.println("Id: "+s.getStudentId());
				System.out.println("name: "+s.getStudentName());
				System.out.println("City: "+s.getStudentCity());
				System.out.println("----------------------------------");
			}
			System.out.println("**********************************");
;			break;
		case 3:
			System.out.println("Enter Student id: ");
			 int ssid = Integer.parseInt(br.readLine());
			 Student st = studentDao.getStudent(ssid);
			 System.out.println("Id: "+st.getStudentId());
				System.out.println("name: "+st.getStudentName());
				System.out.println("City: "+st.getStudentCity());
				System.out.println("----------------------------------");
				System.out.println();
			break;
		case 4:
			System.out.println("Enter Student id: ");
			 int sssid = Integer.parseInt(br.readLine());
			 studentDao.deleteStudent(sssid);
			 System.out.println("Student deleted....");
			 System.out.println("**************************");
			
			break;
		case 5:
			
			break;
		case 6:
			go = false;
			break;
		}
       }catch (Exception e) {
		System.out.println("Invalid Input Try with another one");
		System.out.println(e.getMessage());
		System.out.println();
	}
       }
       System.out.println("Thank you for using my application");
       System.out.println("See you soon");
    }
}
