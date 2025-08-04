package lambda_con_devolucion.ejercicio4;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

	public static void main(String[] args) {
		log.info("{}", create().calcular(2L, 0L));
	}
	
	private static CalculadorLong create() {
		return (x, y) -> x + y;
	}
}
