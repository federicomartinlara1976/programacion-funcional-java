package operaciones_reduccion;

import java.util.ArrayList;
import java.util.List;

import datos.Empleado;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OperacionesCollect {
	public static void main(String[] args) {
		// Lista de empleados
		List<Empleado> empleados = Empleado.empleados();
		
		// Lista de nombres
		List<String> nombres = empleados.stream()
				.map(Empleado::getNombre)
				.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		
		nombres.forEach(nombre -> log.info("{}", nombre));
	}
}