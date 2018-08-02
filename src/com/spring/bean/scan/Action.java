package com.spring.bean.scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//Autowired:按照类型自动装配,如果IOC容器中存在多个service类型的话，异常
@Controller
public class Action {

	@Autowired(required=false)
	private MyService service;
	
	public String execute() {
		System.out.println("进入Action中的方法");
		service.add();
		return "";
		
	}
}
