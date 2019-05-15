package spring_anotation_value;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("15sw86")
	private String studentId;
	
	@Value("Roshan")
	private String StudentName;
	
	
	
	public void display() {
		System.out.println("Student Role NO: "+studentId+" Student Name: "+StudentName);
	}
}
