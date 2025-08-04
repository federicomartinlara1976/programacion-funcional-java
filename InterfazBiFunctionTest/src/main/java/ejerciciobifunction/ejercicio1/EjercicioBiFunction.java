package ejerciciobifunction.ejercicio1;

import java.util.function.BiFunction;


public class EjercicioBiFunction {
    public static void main(String[] args) {
        BiFunction<String, String, String> bi = (x, y) -> x + y;

        System.out.println(bi.apply("Hola", "Mundo"));
    }
}