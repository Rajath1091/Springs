package com.ty.springs.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.springs.dto.School;

public class SchoolController {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("myschool.xml");
		School school=context.getBean("school",School.class); //Constructor injection
		System.out.println("Name:"+school.getName());
		System.out.println("Fees:"+school.getFees());
		System.out.println("Address:"+school.getAddress());
	}

}
