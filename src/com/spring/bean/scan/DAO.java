package com.spring.bean.scan;

import org.springframework.stereotype.Repository;

@Repository
public class DAO {

	public void insert() {
		System.out.println("Dao中的insert方法");
	}
}
