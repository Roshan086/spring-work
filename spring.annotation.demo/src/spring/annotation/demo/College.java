package spring.annotation.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	@Value("${college.Name}")
	private String collegeName; 
	
	@Autowired
	private Principle principle;
	
	@Autowired
	private Teacher teacher;
	
	
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void setPrinciple(Principle principle) {
		this.principle = principle;
	}

	public void test() {
		System.out.println("College Name: "+collegeName);
		principle.getPrincipleInfo();
		teacher.teacherInfo();
	}
	
}
