package operaciones_reduccion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OperacionesReduccion2 {
	public static void main(String[] args) {
		// Array de números
		int[] numeros = { 4, 6, 10, 12, 15, 55, 7, 8, 9, 10, 2, 5, 8, 9, 10, 45, 6, 9, 33, 66, 85, 97, 81, 24, 99 };

		int suma = IntStream.of(numeros).reduce(0, (num1, num2) -> Integer.sum(num1, num2));
		
		log.info("La suma es {}", suma);
		
		Path path1 = Paths.get("Parrafo.txt");
		String texto = "";
		
		try (Stream<String> lineas = Files.lines(path1)) {
			texto = lineas
				.map(linea -> linea.replace(", ", ""))
				.reduce("", (linea1, linea2) -> linea1.concat("\n").concat(linea2));
		} catch (IOException e) {
			log.error("ERROR", e);
		}
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("Parrafo2.txt"))) {
			bw.write(texto);
		} catch (IOException e) {
			log.error("ERROR", e);
		}
	}
}