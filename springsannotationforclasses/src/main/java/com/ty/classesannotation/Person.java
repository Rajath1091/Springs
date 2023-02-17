package com.ty.classesannotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype") //by default the scope is singleton(i.e it returns the same object)
public class Person {
	
	@PostConstruct
	public void start() {
		System.out.println("Wear shoes before walking");
	}
	
	public void walk() {
		System.out.println("Person can walk");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Return home");
	}

}
