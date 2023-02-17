package com.ty.springs.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.springs.dto.Employee;

public class EmployeeController {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("myemployee.xml");
		Employee employee = context.getBean("emp", Employee.class);
		// The values are initialized using property tag in xml file(Property
		// injection/Getter Injection/Setter Injection)
		employee.print();
	}

}
