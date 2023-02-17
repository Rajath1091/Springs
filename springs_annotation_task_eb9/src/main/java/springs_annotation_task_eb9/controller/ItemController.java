package springs_annotation_task_eb9.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springs_annotation_task_eb9.dto.Bike;
import springs_annotation_task_eb9.dto.Item;
import springs_annotation_task_eb9.dto.Laptop;
import springs_annotation_task_eb9.dto.Pen;

public class ItemController {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("myspring.xml");
		
		Item i1=context.getBean("bike",Bike.class);
		i1.used();
		
		Pen i2=context.getBean("pen",Pen.class);
		i2.used();
		System.out.println(i2.getCost());
		
		Item i3=context.getBean("laptop",Laptop.class);
		i3.used();
	}

}
