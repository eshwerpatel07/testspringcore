package com.spring.stereotypeannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Stest {
public static void main(String[] args) {
	
	
	ApplicationContext ac= 
			new ClassPathXmlApplicationContext("com/spring/stereotypeannotations/steconfig.xml");

	Student s= (Student) ac.getBean("s1");

	System.out.println(s); 
	System.out.println(s.getAddress());
}
}
