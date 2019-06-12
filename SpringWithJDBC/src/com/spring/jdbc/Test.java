package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {  
	    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
	      
	    EmployeeDAO dao=(EmployeeDAO)ctx.getBean("edao");  
	    int status=dao.saveEmployee(new Employee(1,"Amit",350));  
	    System.out.println(status);  
	          
	    /*int status=dao.updateEmployee(new Employee(2,"Sonoo",150)); 
	    System.out.println(status); */
	      
	          
	    /*Employee e=new Employee(); 
	    e.setId(3); 
	    int status=dao.deleteEmployee(e); 
	    System.out.println(status);  */
	      
	}  
}
