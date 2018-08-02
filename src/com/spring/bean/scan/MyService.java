package com.spring.bean.scan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

	@Autowired
	private DAO dao;
	
	public void add() {
		System.out.println("service中的add方法");
		dao.insert();
	}
}
