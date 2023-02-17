package springs_hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import springs_hibernate.dto.Employee;

@Component
public class EmployeeDao {

	@Autowired
	private EntityManager entityManager;

	public void saveEmployee(Employee employee) {
		EntityTransaction transaction = entityManager.getTransaction();

		transaction.begin();
		entityManager.persist(employee);
		transaction.commit();
		
		System.out.println("Employee Saved successfully");
	}

	public void updateEmployee(int id, Employee employee) {
		EntityTransaction transaction = entityManager.getTransaction();

		Employee receivedEmployee = entityManager.find(Employee.class, id);
		if (receivedEmployee != null) {
			employee.setId(id);
			transaction.begin();
			entityManager.merge(employee);
			transaction.commit();
			System.out.println("Employee Updated successfully");
		} else {
			System.out.println("Employee doesn't exists");
		}
	}

	public void deleteEmployee(int id) {
		Employee employee = entityManager.find(Employee.class, id);

		entityManager.getTransaction().begin();
		entityManager.remove(employee);
		entityManager.getTransaction().commit();
		
		System.out.println("Employee Deleted successfully");
	}

	public void getEmployeeById(int id) {
		Employee employee = entityManager.find(Employee.class, id);
		System.out.println(employee);
	}

	public void getAllEmployee() {
		Query query = entityManager.createQuery("SELECT e FROM Employee e");
		List<Employee> employees = query.getResultList();
		System.out.println(employees);
	}

}
