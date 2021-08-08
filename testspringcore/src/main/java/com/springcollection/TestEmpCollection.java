package com.springcollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmpCollection {
public static void main(String[] args) {
	
	ApplicationContext ac= new	ClassPathXmlApplicationContext("com/springcollection/collectionconfig.xml");
	Employee emp= (Employee) ac.getBean("empl");
	 
	 System.out.println(emp.getEname());
	 System.out.println(emp.getPhones());
	 System.out.println(emp.getAddresses());
	 System.out.println(emp.getCourse());
}
}
