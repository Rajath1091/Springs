package com.ty.autowired;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //to inject the object by default into ref_var
public class Cow implements Animal {

	public void eat() {
		System.out.println("Cow eats Grass");
	}

}
