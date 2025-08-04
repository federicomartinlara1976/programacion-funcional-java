package ejerciciobifunction.ejercicio1;

import java.util.function.BinaryOperator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EjercicioBiFunction {
    
	public static void main(String[] args) {
        BinaryOperator<String> bi = (x, y) -> x + y;

        log.info(bi.apply("Hola", "Mundo"));
    }
}