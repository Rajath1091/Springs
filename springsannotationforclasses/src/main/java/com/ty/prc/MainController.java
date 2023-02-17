package com.ty.prc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainController {
	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
		School school=context.getBean("school",School.class);
		school.teach();
	}

}
