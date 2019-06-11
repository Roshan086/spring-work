package spring.annotation.demo;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	@Override
	public void teacherInfo() {
		System.out.println("I am your math teacher");
		System.out.println("My Name is Roshan");
	}

}
