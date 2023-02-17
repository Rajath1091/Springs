package springs_task_items_eb9_prc.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springs_task_items_eb9_prc.dto.Items;

public class ItemsController {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("myitems.xml");
		Items items=context.getBean("items",Items.class); //Property injection/Setter injection
		items.print();
	}

}
