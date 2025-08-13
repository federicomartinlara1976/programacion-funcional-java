package services;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import models.Employee;

public class EmployeeService {

	public static List<Employee> getEmployeesFromDB() {
		return Arrays.asList(
			new Employee("romina@email.com", "Romina", "Martínez", "Dirección conocida", "Programadora"),
			new Employee("claudia@email.com", "Claudia", "Iturri", "Dirección conocida", "Programadora"),
			new Employee("javier@email.com", "Javier", "Vázquez", "Dirección conocida", "Programador"),
			new Employee("itzel@email.com", "Itzel", "Ceballos", "Dirección conocida", "Infraestructura"),
			new Employee("alonso@email.com", "Alonso", "Zamora", "Dirección conocida", "Product Manager"),
			new Employee("mara@email.com", "Mara", "González", "Dirección conocida", "Scrum Master"),
			new Employee("juan.carlos@email.com", "Juan Carlos", "Dorantes", "Dirección conocida", "QA"),
			new Employee("sofia@email.com", "Sofía", "Velez", "Dirección conocida", "QA")
		);
	}
	
	public Optional<Employee> findEmployeeByEmail(String email) {
		return getEmployeesFromDB()
			.stream()
			.filter(employee -> employee.getEmail().equals(email))
			.findFirst();
		
//		List<Employee> employees = getEmployeesFromDB()
//			.stream()
//			.filter(employee -> employee.getEmail().equals(email))
//			.collect(Collectors.toList());
//		
//		Employee employee = employees.get(0);
//		
//		return (employee != null) ? Optional.of(employee) : Optional.empty();
	}

	public static Employee defaultEmployee() {
		return new Employee("default@email.com", "Default", "Default", "Dirección conocida", "Programadora");
	}
}
