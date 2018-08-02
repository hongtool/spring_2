package com.spring.bean.scan;

import org.springframework.stereotype.Component;

//1. Component标注无需指定创建bean的id的值，默认的命名策略为类名首字母小写，作为默认的id值
//2. xml文件当中，告知spring自动扫描哪些包下面的component修饰的组件
@Component(value="abc")
public class Person {

	public void eat() {
		System.out.println("正在吃饭");
	}
}
