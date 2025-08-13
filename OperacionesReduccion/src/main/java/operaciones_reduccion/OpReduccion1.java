package operaciones_reduccion;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

import datos.Empleado;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OpReduccion1 {
	public static void main(String[] args) {
		// Lista de empleados
		List<Empleado> empleados = Empleado.empleados();
		
		// Lista de nombres
		List<String> nombres = empleados.stream()
				.map(Empleado::getNombre)
				.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		
		nombres.forEach(nombre -> log.info("{}", nombre));
		
		// Lista de nombres usando Collectors.toList
		log.info("Con Collectors.toList()");
		nombres = empleados.stream()
				.map(Empleado::getNombre)
				.collect(Collectors.toList());
		
		nombres.forEach(nombre -> log.info("{}", nombre));
		
		// Conjunto de nombres usando Collectors.toSet
		log.info("Con Collectors.toSet()");
		Set<String> setNombres = empleados.stream()
				.map(Empleado::getNombre)
				.collect(Collectors.toSet());
		
		setNombres.forEach(nombre -> log.info("{}", nombre));
		
		// Conjunto de nombres usando Collectors.toSet
		log.info("Con Collectors.toCollection(), ordenados");
		SortedSet<String> setNombresOrdenados = empleados.stream()
				.map(Empleado::getNombre)
				.collect(Collectors.toCollection(TreeSet::new));
		
		setNombresOrdenados.forEach(nombre -> log.info("{}", nombre));
	}
}