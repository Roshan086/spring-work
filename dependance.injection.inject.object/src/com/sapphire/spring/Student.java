package com.sapphire.spring;

public class Student {
	private int id;
	private Math math;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setMath(Math math) {
		this.math = math;
	}
	
	public void display() {
		math.cheating();
	}
}
