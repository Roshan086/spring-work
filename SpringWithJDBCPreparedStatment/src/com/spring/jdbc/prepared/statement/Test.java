package com.spring.jdbc.prepared.statement;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {  
	    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
	      
	    EmployeeDAO dao=(EmployeeDAO)ctx.getBean("edao");  
	    /*Boolean status=dao.saveEmployeeByPrepareStatement(new Employee(10,"Amit",350));  
	    System.out.println(status); */ 
	    
	    List<Employee> employee=dao.getAllEmployees();
	    for(Employee e:employee) {
	    	System.out.println(e.getId()+"      "+e.getName()+"      "+e.getSalary());
	    }
	    
	    /*int status=dao.updateEmployee(new Employee(2,"Sonoo",150)); 
	    System.out.println(status); */
	      
	          
	    /*Employee e=new Employee(); 
	    e.setId(3); 
	    int status=dao.deleteEmployee(e); 
	    System.out.println(status);  */
	      
	}  
}
