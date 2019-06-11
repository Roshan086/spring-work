package spring.annotation.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "spring.annotation.demo")
@PropertySource("classpath:college_info.properties")
public class SpringConfiguration {
	
//	@Bean
//	public Teacher mathTeacherBean() {
//		return new MathTeacher();
//	}
//	
//	@Bean
//	public Principle principleBean() {
//		Principle principle=new Principle();
//		return principle;
//	}
//	
//	@Bean
//	public College collegeBean() {
//		College college=new College();
//		college.setPrinciple(principleBean());
//		college.setTeacher(mathTeacherBean());
//		return college;
//	}
	
}
