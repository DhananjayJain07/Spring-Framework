package com.springcore.sepl;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
	
	ApplicationContext context	= new ClassPathXmlApplicationContext("com/springcore/sepl/seplconfig.xml");
		Demo d= context.getBean("demo", Demo.class);
		System.out.println(d);
		
	}

}
