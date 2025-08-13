package controllers;

import java.util.Optional;
import java.util.Scanner;

import exceptions.EmployeeNotFoundException;
import lombok.extern.slf4j.Slf4j;
import models.Employee;
import services.AlternativeEmployeeService;
import services.EmployeeService;

@Slf4j
public class EmployeeController {

	public Optional<Employee> findEmployeeByEmail(String email) {
		Optional<Employee> oEmployeeService = new EmployeeService().findEmployeeByEmail(email);
		Optional<Employee> oEmployeeAlternativeService = new AlternativeEmployeeService().findEmployeeByEmail(email);
		return oEmployeeService.or(() -> oEmployeeAlternativeService);
	}
	
	public Optional<Employee> isDeveloperOptional(String email) {
		return findEmployeeByEmail(email)
			.filter(employee -> employee.getPuesto().equals("Programador"));
	}
	
	public static void main(String[] args) {
		try {
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
	//		Employee employee = oEmployee.orElse(EmployeeService.defaultEmployee());
	//		log.info("{}", employee);
			
			// Devuelve el empleado encontrado, en caso contrario 
			// devuelve uno puesto por defecto especificado en el consumer
	//		employee = oEmployee.orElseGet(() -> EmployeeService.defaultEmployee());
	//		log.info("{}", employee);
			
			Employee employee = oEmployee.orElseThrow(() -> new EmployeeNotFoundException(email));
			log.info("{}", employee);
			
			controller.isDeveloperOptional(email).ifPresentOrElse(
					emp -> log.info("{} es un programador", emp), 
					() -> log.info("El emmpleado no existe o no es programador"));
			
			oEmployee
				.map(emp -> emp.getEmail())
				.ifPresent(correo -> log.info("{}", correo));
		} catch (EmployeeNotFoundException e) {
			log.error("ERROR: ", e);
		}
	}
}
