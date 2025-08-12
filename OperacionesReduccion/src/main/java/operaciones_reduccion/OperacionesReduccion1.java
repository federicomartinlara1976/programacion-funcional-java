package operaciones_reduccion;

import java.util.List;
import java.util.stream.IntStream;

import datos.Empleado;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OperacionesReduccion1 {
	public static void main(String[] args) {
		// Ejemplos sin programación funcional

		// Array de números
		int[] numeros = { 4, 6, 10, 12, 15, 55, 7, 8, 9, 10, 2, 5, 8, 9, 10, 45, 6, 9, 33, 66, 85, 97, 81, 24, 99 };

		// Lista de empleados
		List<Empleado> empleados = Empleado.empleados();

		// Suma de elementos
		int suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}

		log.info("La suma es {}", suma);

		double promedio = suma / numeros.length;
		log.info("El promedio es {}", promedio);

		int maximo = numeros[0];
		for (int numero : numeros) {
			if (numero > maximo) {
				maximo = numero;
			}
		}

		log.info("El maximo es {}", maximo);

		int minimo = numeros[0];
		for (int numero : numeros) {
			if (numero < minimo) {
				minimo = numero;
			}
		}

		log.info("El minimo es {}", minimo);

		log.info("Operaciones con empleados");

		// Suma de elementos
		double sumaSalarios = 0.0;
		for (Empleado empleado : empleados) {
			sumaSalarios += empleado.getIngresos();
		}

		log.info("La suma de los salarios es {}", sumaSalarios);
		log.info("La cantidad de empleados es {}", empleados.size());

		Empleado empMaximo = empleados.get(0);
		for (Empleado empleado : empleados) {
			if (empleado.getIngresos() > empMaximo.getIngresos()) {
				empMaximo = empleado;
			}
		}

		log.info("El empleado con el salario maximo es {} {}", empMaximo.getNombre(), empMaximo.getIngresos());

		Empleado empMinimo = empleados.get(0);
		for (Empleado empleado : empleados) {
			if (empleado.getIngresos() < empMinimo.getIngresos()) {
				empMinimo = empleado;
			}
		}

		log.info("El empleado con el salario minimo es {} {}", empMinimo.getNombre(), empMinimo.getIngresos());

		// Ejemplos con programación funcional
		// suma de los elementos
		log.info("La suma es {}", IntStream.of(numeros).sum());

		// promedio de los elementos
		log.info("El promedio es {}", IntStream.of(numeros).average().getAsDouble());

		// máximo de los elementos
		log.info("El máximo de los elementos es {}", IntStream.of(numeros).max().getAsInt());

		// mínimo de los elementos
		log.info("Cantidad de elementos: {}", IntStream.of(numeros).count());

		// cantidad de elementos
		log.info("El mínimo de los elementos es {}", IntStream.of(numeros).min().getAsInt());

		log.info("Operaciones con empleados");
		log.info("La suma de los salarios es {}", empleados.stream().mapToDouble(Empleado::getIngresos).sum());

		// Obtener el empleado con salario máximo
		Empleado empMax = empleados.stream().max((emp1, emp2) -> (int) (emp1.getIngresos() - emp2.getIngresos())).get();
		log.info("El empleado con el salario maximo es {} {}", empMax.getNombre(), empMax.getIngresos());
		
		// Obtener el empleado con salario mínimo
		Empleado empMin = empleados.stream().min((emp1, emp2) -> (int) (emp1.getIngresos() - emp2.getIngresos())).get();
		log.info("El empleado con el salario maximo es {} {}", empMin.getNombre(), empMin.getIngresos());
	}
}