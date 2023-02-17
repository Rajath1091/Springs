package com.ty.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Zoo {
	
	@Autowired
//	@Qualifier("lion")
	private Animal animal;
	
	public void food() {
		animal.eat();
	}

}
