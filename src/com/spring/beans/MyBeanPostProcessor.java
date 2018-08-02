package com.spring.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 处理IOC容器所有Bean的初始化方法
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("处理初始化方法之后的处理"+beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("处理初始化方法之前的处理"+beanName);
		return bean;
	}

}
