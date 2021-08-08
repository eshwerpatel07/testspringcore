package com.springwork;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context=  new ClassPathXmlApplicationContext("com/springwork/config.xml");
        Student s1=(Student) context.getBean("s1");
        
        System.out.println("student1 obj value=: "+s1);
        
    Student s2=(Student) context.getBean("s2");
        
        System.out.println("student2 obj value=: "+s2);
        
Student s3=(Student) context.getBean("s3");
        
        System.out.println("student2 obj value by P schema===: "+s3);
    }
}
