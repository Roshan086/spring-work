package com.jdbc.parameter;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class Test {
	public static void main(String[] args) {  
		ClassPathResource r=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory((org.springframework.core.io.Resource) r);  
	      
	    EmployeeDAO dao=(EmployeeDAO)factory.getBean("edao");  
	    dao.saveEmployee(new Employee("sonoo",(float) 50.00));  
	      
	} 
}
