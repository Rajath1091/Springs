package com.ty.bank_task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainController {
	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AccountConfig.class);
		Person person=context.getBean("person",Person.class);
		person.check();
	}

}
