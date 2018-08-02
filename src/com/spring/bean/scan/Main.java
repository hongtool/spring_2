package com.spring.bean.scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-scan.xml");
//		Person p = (Person) ac.getBean("abc");
//		p.eat();
		Action action = (Action) ac.getBean("action");
		action.execute();
	}
}
