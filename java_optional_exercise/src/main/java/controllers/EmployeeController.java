package controllers;

import java.util.Scanner;

import lombok.extern.slf4j.Slf4j;
import models.Employee;

@Slf4j
public class EmployeeController {

	public Employee findEmployeeByEmail(String email) {
		return null;
	}
	
	public static void main(String[] args) {
		EmployeeController controller = new EmployeeController();
		
		Scanner scanner = new Scanner(System.in);
		
		log.info("Ingrese el email del empleado: ");
		
		String email = scanner.next();
		
		controller.findEmployeeByEmail(email);
	}
}
