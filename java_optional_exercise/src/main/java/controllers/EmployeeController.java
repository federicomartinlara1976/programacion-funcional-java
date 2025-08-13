package controllers;

import java.util.Optional;
import java.util.Scanner;

import lombok.extern.slf4j.Slf4j;
import models.Employee;
import services.EmployeeService;

@Slf4j
public class EmployeeController {

	public Employee findEmployeeByEmail(String email) {
		Optional<Employee> oEmployee = new EmployeeService().findEmployeeByEmail(email);
		
		return oEmployee.isPresent() ? oEmployee.get() : null;
	}
	
	public static void main(String[] args) {
		EmployeeController controller = new EmployeeController();
		
		Scanner scanner = new Scanner(System.in);
		
		log.info("Ingrese el email del empleado: ");
		
		String email = scanner.next();
		
		Employee employee = controller.findEmployeeByEmail(email);
		
		log.info("{}", employee);
	}
}
