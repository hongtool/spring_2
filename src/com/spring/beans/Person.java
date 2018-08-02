package com.spring.beans;

public class Person {

	private String name;
	private int age;
	private Car car;

	
	public Person() {
		System.out.println("构造器方法");
	}

	public void a() {
		System.out.println("自定义初始化方法!!!");
	}
	
	public void b() {
		System.out.println("自定义销毁方法!!!");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName方法");
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("setAge方法");
		this.age = age;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		System.out.println("setCar方法");
		this.car = car;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", car=" + car + "]";
	}

}
