package evaluaempleados_predicate_bifunction;

import java.util.Arrays;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Principal {

	public static void main(String[] args) {
		List<Empleado> listaEmpleados = Arrays.asList(
				new Empleado("Rodrigo", 25, 1500, "Cobranzas"),
				new Empleado("Alicia", 25, 1500, "Ventas"), 
				new Empleado("Manolo", 30, 1500, "Ventas"),
				new Empleado("Cinthia", 20, 2500, "Mostrador"), 
				new Empleado("Esteban", 19, 7000, "Ventas"),
				new Empleado("Dámaris", 32, 600, "Telemarketing"), 
				new Empleado("Lina", 25, 2500, "Mostrador"),
				new Empleado("Nayeli", 44, 10000, "Ventas"), 
				new Empleado("Flor", 35, 7000, "Compras"),
				new Empleado("German", 20, 1500, "Facturación"), 
				new Empleado("Lidia", 21, 600, "Telemarketing"),
				new Empleado("Eleazar", 33, 600, "Cobranzas"), 
				new Empleado("Javier", 35, 600, "Cobranzas"),
				new Empleado("Paola", 50, 1500, "Compras"), 
				new Empleado("Ignacio", 41, 1500, "Compras"),
				new Empleado("Rodrigo", 40, 7000, "Recursos Humanos"));

		Evaluador evaluador = new Evaluador();

		log.info("Empleados con salario mayor a 5000:");
		List<Empleado> empleadosSalariosAltos = evaluador.evaluar(listaEmpleados,
				empleado -> empleado.getSalario() > 5000);
		empleadosSalariosAltos.forEach(empleado -> log.info(empleado.getNombre()));

		log.info("Empleados que su nombre inicia con 'J':");
		List<Empleado> empInicianConJ = evaluador.evaluar(listaEmpleados,
				empleado -> empleado.getNombre().startsWith("J"));
		empInicianConJ.forEach(empleado -> log.info(empleado.getNombre()));

		log.info("\nEmpleados jóvenes:");
		List<Empleado> empleadosJovenes = evaluador.evaluar(listaEmpleados, empleado -> empleado.getEdad() < 25);
		empleadosJovenes.forEach(empleado -> log.info(empleado.getNombre()));

		Funciones func = new Funciones();

		for (Empleado empleado : empleadosJovenes) {
			double nuevoSalario = func.incrementoSalario(empleado, 10,
					(salario, incremento) -> salario + (salario * (incremento / 100)));
			empleado.setSalario(nuevoSalario);
		}

		log.info("\nSalarios actualizados en los jóvenes:");
		empleadosJovenes.forEach(
				empleado -> log.info("Nombre: {} - Nuevo salario: {}", empleado.getNombre(), empleado.getSalario()));

		log.info("\nEmpleados mayores de 25 años:");
		List<Empleado> empleadosMayores = evaluador.evaluarAlContrario(listaEmpleados,
				empleado -> empleado.getEdad() > 25);
		empleadosMayores.forEach(empleado -> log.info(empleado.getNombre()));
	}
}