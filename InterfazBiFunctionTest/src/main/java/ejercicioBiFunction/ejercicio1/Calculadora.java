package ejercicioBiFunction.ejercicio1;

import java.util.function.BiFunction;

public class Calculadora {
    public String calc(BiFunction<Integer, Integer, String> bi, Integer i1, Integer i2) {
        return bi.apply(i1, i2);
    }
}