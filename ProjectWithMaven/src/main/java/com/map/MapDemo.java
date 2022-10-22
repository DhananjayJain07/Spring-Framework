package com.map;

import java.util.*;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
	/*	Question que1 = new Question();
		que1.setQuestionId(1520);
		que1.setQuestion("What is java ?");
		
		Answer ans1 = new Answer();
		ans1.setAnswerId(343);
		ans1.setAnswer("Java is programming Langauge");
		ans1.setQuestion(que1);
		
		Answer ans2 = new Answer();
		ans2.setAnswerId(33);
		ans2.setAnswer("With the help of java we can create softwares");
		ans2.setQuestion(que1);
		
		Answer ans3 = new Answer();
		ans3.setAnswerId(363);
		ans3.setAnswer("java has different type of frameworks.");
		ans3.setQuestion(que1);
		
		List<Answer> list = new ArrayList<Answer>();
		list.add(ans1);
		list.add(ans2);
		list.add(ans3);
		
		que1.setAnswers(list);*/
		
		Session s1 = factory.openSession();
		Transaction tx = s1.beginTransaction();
		
		/*s1.save(que1);
		s1.save(ans1);
		s1.save(ans2);
		s1.save(ans3);*/
		Question q = (Question) s1.get(Question.class, 1520);
		System.out.println(q.getQuestionId());
		System.out.println(q.getQuestion());
		System.out.println(q.getAnswers().size());
		/*Lazy Loading
		System.out.println(q.getAnswers().size());
		
		/*for(Answer a : q.getAnswers()) {
			System.out.println(a.getAnswer());
		}*/
		tx.commit();
		/* fetch
		Question NewQ =(Question)s1.get(Question.class, 555);
		System.out.println(NewQ.getQuestion());
		System.out.println(NewQ.getAnswer().getAnswer());
		*/
		s1.close();
		factory.close();
	}

}
