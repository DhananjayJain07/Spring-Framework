package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/standalone/collections/standconfig.xml");
		
		Person p = (Person) context.getBean("p1");
		System.out.println(p);
		System.out.println(p.getFriends().getClass().getName());
		System.out.println("***************************");
		System.out.println(p.getFee());
		System.out.println(p.getFee().getClass().getName());
		System.out.println("***************************");
		System.out.println(p.getProperties());
	}

}
