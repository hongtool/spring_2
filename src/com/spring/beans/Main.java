package com.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person1 = (Person) ac.getBean("person1");
		System.out.println(person1);
		
		/*Person person2 = (Person) ac.getBean("person2");
		System.out.println(person2);*/
	}
}
