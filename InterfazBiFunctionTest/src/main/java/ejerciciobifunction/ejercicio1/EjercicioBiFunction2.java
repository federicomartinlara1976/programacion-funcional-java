package ejerciciobifunction.ejercicio1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EjercicioBiFunction2 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        String resultado = calc.calc((x, y) -> ": " + (x * y), 60, 10);
        
        log.info("El resultado de la multiplicacion es: {}", resultado);
    }
}