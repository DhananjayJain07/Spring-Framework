package com.springcore.st;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
	ApplicationContext context	= new ClassPathXmlApplicationContext("com/springcore/st/stconfig.xml");
		Student s = (Student)context.getBean("ob");
		System.out.println(s);
		System.out.println(s.getAddress());
		System.out.println(s.getAddress().getClass().getName());
		System.out.println("********************");
		Teacher t = (Teacher)context.getBean("teacher");
		Teacher t2 = (Teacher)context.getBean("teacher");
		
		System.out.println(t.hashCode());
		System.out.println(t2.hashCode());
		
	}

}
