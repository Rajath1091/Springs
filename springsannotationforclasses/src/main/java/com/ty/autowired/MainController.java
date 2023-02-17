package com.ty.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainController {
	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AnimalConfig.class);
		Zoo zoo=context.getBean("zoo",Zoo.class);
		zoo.food();
	}

}
