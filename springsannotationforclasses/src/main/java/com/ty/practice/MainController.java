package com.ty.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainController {
	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(SimConfig.class);
		Mobile mobile=context.getBean("mobile",Mobile.class);
		mobile.use();
	}

}
