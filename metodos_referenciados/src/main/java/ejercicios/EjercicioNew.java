package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EjercicioNew {
	public static void main(String[] args) {
		List<String> numeros = Arrays.asList("10", "10", "15", "15", "25", "30", "40", "6", "30");

		getResults(numeros, Integer::valueOf).forEach(EjercicioNew::multiplicaPor10);

	}

	public static List<Integer> getResults(List<String> datos, ToIntFunction<String> func) {

		List<Integer> resultados = new ArrayList<>();

		datos.forEach(strNum -> resultados.add(func.applyAsInt(strNum)));

		return resultados;
	}

	public static void multiplicaPor10(int numero) {
		log.info("El nuevo valor del dato {} es {}", numero, (numero * 10));
	}
}