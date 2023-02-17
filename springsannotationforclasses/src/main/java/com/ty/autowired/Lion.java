package com.ty.autowired;

import org.springframework.stereotype.Component;

@Component
public class Lion implements Animal {

	public void eat() {
		System.out.println("Lion eats Meat");
	}

}
