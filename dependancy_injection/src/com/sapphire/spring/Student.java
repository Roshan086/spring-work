package com.sapphire.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		StudentDetail studentDetails=context.getBean("student",StudentDetail.class);
		studentDetails.display();
		
//		StudentDetail studentDetail=context.getBean("raheem",StudentDetail.class);
//		studentDetails.display();
	}
}
