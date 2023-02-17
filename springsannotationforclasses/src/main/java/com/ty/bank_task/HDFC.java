package com.ty.bank_task;

import org.springframework.stereotype.Component;

@Component
public class HDFC implements Account {

	public void balance() {
		System.out.println("The balance is 15000");
	}

}
