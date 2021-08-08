package com.spring.xmlautowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestWire {

	public static void main(String[] args) {
		
		ApplicationContext ac =new ClassPathXmlApplicationContext("com/spring/xmlautowire/autowireconfig.xml");
		Student std=ac.getBean("s1", Student.class);
		
		System.out.println(std);
	}
}
