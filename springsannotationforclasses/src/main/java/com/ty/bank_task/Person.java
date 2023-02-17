package com.ty.bank_task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Autowired
	@Qualifier("HDFC") //if classname is UpperCase the beanname will also be UpperCase
	private Account account;

	public void check() {
		account.balance();
	}

}
