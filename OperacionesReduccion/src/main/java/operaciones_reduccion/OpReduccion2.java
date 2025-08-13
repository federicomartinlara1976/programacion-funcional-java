package operaciones_reduccion;

import java.util.Map;
import java.util.stream.Collectors;

import datos.Empleado;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OpReduccion2 {
	public static void main(String[] args) {

		log.info("Mapa id, nombre");
		Map<Long, String> idANombreMapa = Empleado.empleados().stream()
				.collect(Collectors.toMap(Empleado::getId, Empleado::getNombre));

		idANombreMapa.forEach((clave, valor) -> log.info("idANombreMapa[{}] = {}", clave, valor));

		log.info("Mapa genero, nombre");
		Map<Empleado.Genero, String> generoANombreMapa = Empleado.empleados().stream().collect(Collectors
				.toMap(Empleado::getGenero, Empleado::getNombre, (nom1, nom2) -> String.join(", ", nom1, nom2)));

		generoANombreMapa.forEach((clave, valor) -> log.info("generoANombreMapa[{}] = {}", clave, valor));
	}
}