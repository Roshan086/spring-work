package com.sapphire.spring;

public class StudentDetail {
	
	private int studentId;
	private String studentName;
	
	
	
	public StudentDetail(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}



	/*public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}*/
	
	public void display() {
		System.out.println("Student Name : "+studentName+" Student Id : "+studentId);
	}
	
}
