package com.ty.classesannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainController {
	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Person person=context.getBean("person",Person.class);
		person.walk();
		((AbstractApplicationContext) context).close();
		
//		Person person1=context.getBean("person",Person.class);
//		
//		System.out.println(person);
//		System.out.println(person1);
	}

}
