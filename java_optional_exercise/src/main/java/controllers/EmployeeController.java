package controllers;

import java.util.Optional;
import java.util.Scanner;

import lombok.extern.slf4j.Slf4j;
import models.Employee;
import services.EmployeeService;

@Slf4j
public class EmployeeController {

	public Optional<Employee> findEmployeeByEmail(String email) {
		return new EmployeeService().findEmployeeByEmail(email);
	}
	
	public static void main(String[] args) {
		EmployeeController controller = new EmployeeController();
		
		Scanner scanner = new Scanner(System.in);
		
		log.info("Ingrese el email del empleado: ");
		
		String email = scanner.next();
		
		Optional<Employee> oEmployee = controller.findEmployeeByEmail(email);
		
		// Se imprime el empleado encontrado, en caso contrario no hace nada
		oEmployee.ifPresent(employee -> log.info("{}", employee));

		// Se imprime el empleado encontrado, en caso contrario imprime el mensaje que no se encontró
		oEmployee.ifPresentOrElse(
				employee -> log.info("{}", employee), 
				() -> log.info("No se encontró el empleado"));
		
		// Devuelve el empleado encontrado, en caso contrario devuelve uno puesto por defecto
		Employee employee = oEmployee.orElse(EmployeeService.defaultEmployee());
		log.info("{}", employee);
	}
}
