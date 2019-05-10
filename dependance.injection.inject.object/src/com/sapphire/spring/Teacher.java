package com.sapphire.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Teacher {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Student student=context.getBean("student",Student.class);
		student.display();
		
		AnotherStudent anotherStudent= context.getBean("anotherStudent",AnotherStudent.class);
		anotherStudent.display();
	}
}
