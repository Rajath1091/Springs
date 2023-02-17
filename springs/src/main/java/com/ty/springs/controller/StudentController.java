package com.ty.springs.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.springs.dto.Student;

public class StudentController {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("mystudent.xml");
		Student student = context.getBean("std", Student.class);
		// initializing the values through constructor(Constructor Injection)
		System.out.println("Name:" + student.getName());
		System.out.println("Phone:" + student.getPhone());
		System.out.println("Course:" + student.getCourse());
	}
}
