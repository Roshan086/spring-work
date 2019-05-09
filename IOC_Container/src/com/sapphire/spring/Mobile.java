package com.sapphire.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String arg[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Sim sim=context.getBean("sim",Sim.class);
		sim.calling();
		sim.data();
	}
}
