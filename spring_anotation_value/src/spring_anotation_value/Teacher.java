package spring_anotation_value;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Teacher {
	public static void main(String arg[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Student student=context.getBean("student",Student.class);
		student.display();
	}
}
