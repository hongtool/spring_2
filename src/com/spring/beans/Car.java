package com.spring.beans;

public class Car {

	private String type;

	public Car() {
		System.out.println("car被创建");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + "]";
	}

}
