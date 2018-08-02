package com.spring.beans;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean<Car> {

	@Override
	public Car getObject() throws Exception {
		Car car1 = new Car();
		car1.setType("宝马");
		return car1;
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
