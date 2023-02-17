package com.ty.springs.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.springs.dto.GoodsServices;
import com.ty.springs.dto.KarGST;

public class GoodsServicesController {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("mygst.xml");
		GoodsServices goodsServices = context.getBean("kargst", KarGST.class);
		goodsServices.calculate();
	}

}
