package com.seleniumexpress.di;

public class Student {

	private String StudentName;
	private int id;
	
	/*public String getStudentName() {
		return StudentName;
		
	}
	public void setStudentName(String StudentName) {
		this.StudentName=StudentName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}*/
	
	public Student(int id)
	{
		this.id=id;
	}
	
	public Student(String StudentName,int id) {
		this.StudentName = StudentName;
		this.id = id;
	}
	public void displayStudentInfo() {
		System.out.println("Student name is : "+StudentName +"  and the id is : "+id);
	}
}
