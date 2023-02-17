package com.ty.bank_task;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SBI implements Account {

	public void balance() {
		System.out.println("The balance is 10000");
	}

}
