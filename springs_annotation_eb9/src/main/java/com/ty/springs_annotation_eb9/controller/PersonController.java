package com.ty.springs_annotation_eb9.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.springannotation.Person;

public class PersonController {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("myperson.xml");
		Person person = context.getBean("person", Person.class);
		person.walk();
		System.out.println(person.getAge());
	}

}
