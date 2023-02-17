package springs_hibernate.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springs_hibernate.dao.EMConfig;
import springs_hibernate.dao.EmployeeDao;
import springs_hibernate.dto.BankAccount;
import springs_hibernate.dto.Config;
import springs_hibernate.dto.Employee;

public class SaveMainController {
	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		
		BankAccount account=context.getBean("bankAccount",BankAccount.class);
		account.setName("SBI");
		account.setAddress("CTA");
		account.setIfsc("SBI7410");
		
		Employee employee=context.getBean("employee",Employee.class);
		employee.setName("Rajath");
		employee.setAddress("BLR");
		employee.setPhone(963852741l);
		employee.setAccount(account);
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(EMConfig.class);
		EmployeeDao dao=applicationContext.getBean("employeeDao",EmployeeDao.class);
		dao.saveEmployee(employee);
	}

}
