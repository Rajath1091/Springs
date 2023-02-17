package com.ty.springs.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.ty.springs.dto.SchoolRelation;
import com.ty.springs.dto.Student;

public class SchoolMain {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("mystudent.xml");
		
		// Using BeanFactory
		Resource resource = new ClassPathResource("mystudent.xml");
		BeanFactory context = new XmlBeanFactory(resource);
		SchoolRelation school = context.getBean("sch", SchoolRelation.class); // Dependency injection
		Student student = school.getStudent();
		System.out.println(student.getCourse());
		System.out.println(school.getFees());
	}

}
