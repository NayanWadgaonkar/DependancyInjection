package com.seleniumexpress.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
public static void main(String[]args) {
	/*Student student = new Student();
	student.StudentName = "Nayan ";
	student.displayStudentInfo();
	student.setStudentName("neha");
	student.displayStudentInfo();*/
	
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
   Student abhi = context.getBean("student", Student.class);
	abhi.displayStudentInfo();
	 
	Student usha = context.getBean("usha", Student.class);
	usha.displayStudentInfo();
	
	
	/*Student ashish = context.getBean("ashish", Student.class);
	ashish.displayStudentInfo();*/
}
}
