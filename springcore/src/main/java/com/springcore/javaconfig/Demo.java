package com.springcore.javaconfig;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
			Student student1 = (Student)context.getBean("getStudent");
			System.out.println(student1);
			student1.study();
			
	}

}
