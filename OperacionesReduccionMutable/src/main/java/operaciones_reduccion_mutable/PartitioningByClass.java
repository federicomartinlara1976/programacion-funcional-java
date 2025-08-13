package operaciones_reduccion_mutable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import datos.Student;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PartitioningByClass {
	
	public static List<Student> getStudents() {
		return Arrays.asList(
			new Student("John", "Smith", "Miami", 7.38, 19),
			new Student("Jane", "Miles", "New York", 8.4, 21),
			new Student("Michael", "Peterson", "New York", 7.5, 20),
			new Student("Gabriella", "Robertson", "Miami", 9.1, 20),
			new Student("Kyle", "Miller", "Miami", 9.83, 20)
		);
	}
	
	public static void main(String[] args) {
		List<String> nombres = Arrays.asList("Andrés", "Jaime", "Sara", "César", "Javier", "Rosa", "María");
		
		Map<Boolean, List<String>> nombresMapa = nombres.stream()
			.collect(Collectors.partitioningBy(nombre -> nombre.length() > 4));
		
		nombresMapa.forEach((clave, valor) -> log.info("nombresMapa[{}] = {}", clave, valor));
		
		List<Student> estudiantes = getStudents();
		Map<Boolean, List<Student>> estudiantesMapa = estudiantes.stream()
			.collect(Collectors.partitioningBy(student -> student.getName().length() > 4));
		
		estudiantesMapa.forEach((clave, valor) -> log.info("estudiantesMapa[{}] = {}", clave, valor));
		
		Map<Boolean, List<Student>> estudiantesSobresalientes = estudiantes.stream()
				.collect(Collectors.partitioningBy(Student::calificacionExcelente));
		
		estudiantesSobresalientes.forEach((clave, valor) -> log.info("estudiantesSobresalientes[{}] = {}", clave, valor));
	}
}
