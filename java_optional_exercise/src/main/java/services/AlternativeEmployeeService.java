package services;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import models.Employee;

public class AlternativeEmployeeService {

	public static List<Employee> getEmployeesFromDB() {
		return Arrays.asList(
			new Employee("fabiola@email.com", "Romina", "Martínez", "Dirección conocida", "Programador"),
			new Employee("sofia@email.com", "Claudia", "Iturri", "Dirección conocida", "Programador"),
			new Employee("gabriel@email.com", "Javier", "Vázquez", "Dirección conocida", "Programador"),
			new Employee("miriam@email.com", "Itzel", "Ceballos", "Dirección conocida", "Infraestructura"),
			new Employee("juan@email.com", "Alonso", "Zamora", "Dirección conocida", "Product Manager"),
			new Employee("alonso@email.com", "Mara", "González", "Dirección conocida", "Scrum Master"),
			new Employee("juan.alberto@email.com", "Juan Carlos", "Dorantes", "Dirección conocida", "QA"),
			new Employee("marisa@email.com", "Sofía", "Velez", "Dirección conocida", "QA")
		);
	}
	
	public Optional<Employee> findEmployeeByEmail(String email) {
		return getEmployeesFromDB()
			.stream()
			.filter(employee -> employee.getEmail().equals(email))
			.findFirst();
	}
}
