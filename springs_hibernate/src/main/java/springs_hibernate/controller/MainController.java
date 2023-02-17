package springs_hibernate.controller;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springs_hibernate.dao.EMConfig;
import springs_hibernate.dao.EmployeeDao;
import springs_hibernate.dto.BankAccount;
import springs_hibernate.dto.Config;
import springs_hibernate.dto.Employee;

public class MainController {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		BankAccount account = context.getBean("bankAccount", BankAccount.class);
		Employee employee = context.getBean("employee", Employee.class);

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(EMConfig.class);
		EmployeeDao dao = applicationContext.getBean("employeeDao", EmployeeDao.class);
		boolean flag = true;
		do {
			System.out.println(
					"Enter the choice \n 1.Save Employee \n 2.Update Employee \n 3.Delete Employee based on Id \n 4.Get Employee By Id \n 5.Get All Employees \n 6.Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter the Bank Name");
				String bname = scanner.next();
				System.out.println("Enter the Bank Address");
				String baddress = scanner.next();
				System.out.println("Enter the Bank Ifsc");
				String ifsc = scanner.next();

				account.setName(bname);
				account.setAddress(baddress);
				account.setIfsc(ifsc);

				System.out.println("Enter the Employee Name");
				String name = scanner.next();
				System.out.println("Enter the Employee Address");
				String address = scanner.next();
				System.out.println("Enter the Employee Phone");
				long phone = scanner.nextLong();

				employee.setName(name);
				employee.setAddress(address);
				employee.setPhone(phone);
				employee.setAccount(account);

				dao.saveEmployee(employee);
			}
				break;
			case 2: {
				System.out.println("Enter the Bank id");
				int bid = scanner.nextInt();
				System.out.println("Enter the Bank Name");
				String bname = scanner.next();
				System.out.println("Enter the Bank Address");
				String baddress = scanner.next();
				System.out.println("Enter the Bank Ifsc");
				String ifsc = scanner.next();

				account.setId(bid);
				account.setName(bname);
				account.setAddress(baddress);
				account.setIfsc(ifsc);

				System.out.println("Enter the Employee id");
				int id = scanner.nextInt();
				System.out.println("Enter the Employee Name");
				String name = scanner.next();
				System.out.println("Enter the Employee Address");
				String address = scanner.next();
				System.out.println("Enter the Employee Phone");
				long phone = scanner.nextLong();

				employee.setName(name);
				employee.setAddress(address);
				employee.setPhone(phone);
				employee.setAccount(account);

				dao.updateEmployee(id, employee);
			}
				break;
			case 3: {
				System.out.println("Enter the Employee id");
				int id = scanner.nextInt();

				dao.deleteEmployee(id);
			}
				break;
			case 4: {
				System.out.println("Enter the Employee id");
				int id = scanner.nextInt();

				dao.getEmployeeById(id);
			}
				break;
			case 5: {
				dao.getAllEmployee();
			}
				break;
			default:
				flag = false;
			}

		} while (flag);

	}
}
