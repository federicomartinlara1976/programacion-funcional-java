package ejercicios;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MapTest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		String[][] arreglo = { { "Chris", "USA" }, { "Raju", "India" }, { "Lynda", "Canada" } };

		// Crear mapa usando el array
		for (int i = 0; i < arreglo.length; i++) {
			map.put(arreglo[i][0], arreglo[i][1]);
		}

		// Imprimir mapa forma tradicional
		log.info("Usando la forma tradicional de imprimir clave y valor de un mapa:");
		Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
		if (iter != null) {
			while (iter.hasNext()) {
				Map.Entry<String, String> entry = iter.next();
				log.info("Clave: {} - Valor: {}", entry.getKey(), entry.getValue());
			}
		}

		// Imprimir mapa usando la forma moderna de imprimir clave y valor de un mapa
		log.info("Usando BiConsumer y expresion lambda:");
		map.forEach((key, value) -> log.info("Clave: {} - Valor: {}", key, value));
	}
}