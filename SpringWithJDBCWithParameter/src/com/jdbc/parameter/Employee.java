package com.jdbc.parameter;

public class Employee {
	private Integer id;
	private String name;
	private float salary;
	
	public Employee() {
		
	}
	
	public Employee(String name,float salary) {
		this.name=name;
		this.salary=salary;
	}
	
	public Employee(Integer id,String name,float salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
}
