package com.sapphire.spring;

public class Moblink implements Sim {

	@Override
	public void calling() {
		System.out.println("I am calling using moblink sim");
		
	}

	@Override
	public void data() {
		System.out.println("I am using Internet Browsing using Moblink sim");
		
	}
	
}
