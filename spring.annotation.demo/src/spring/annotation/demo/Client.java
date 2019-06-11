package spring.annotation.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		College college=context.getBean("college",College.class);
		System.out.println("College object is created");
		college.test();
		context.close();
	}
	
}
