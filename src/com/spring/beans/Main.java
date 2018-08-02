package com.spring.beans;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Person person1 = (Person) ac.getBean("person1");
//		System.out.println(person1);
		
//		Person person2 = (Person) ac.getBean("person2");
//		System.out.println(person2);
		
//		Car car1 = (Car) ac.getBean("car1");
//		Car car2 = (Car) ac.getBean("car1");
//		System.out.println(car1);//值为true
		
		/*DateFormat df = (DateFormat) ac.getBean("dateFormat");
		System.out.println(df);*/
		
//		Date d = (Date) ac.getBean("date");
//		System.out.println(d);
		
		Car car2 = (Car) ac.getBean("car2");
		System.out.println(car2);
	}
	
}
