package com.ty.springs.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.springs.dto.Animal;
import com.ty.springs.dto.Cow;
import com.ty.springs.dto.Lion;

public class AnimalController {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("myspring.xml");
//		Cow cow = context.getBean("cow", Cow.class);
//		cow.sound();
//
//		Lion lion = context.getBean("lion", Lion.class);
//		lion.sound();
		
		//Upcasting
		Animal animal=context.getBean("cow",Cow.class);
		animal.sound();
	}

}
