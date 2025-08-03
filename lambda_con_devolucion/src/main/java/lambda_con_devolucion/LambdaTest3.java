package lambda_con_devolucion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LambdaTest3 {
    public static void main(String[] args) {
        engine((x, y) -> x + y);
        engine((x, y) -> x * y);
        engine((x, y) -> x - y); // resta
        engine((x, y) -> x / y); // division
        engine((x, y) -> x % y); // modulo
    }

    private static void engine(Calculadora calc) {
        int x = 2, y = 4;
        int resultado = calc.calcular(x, y);
        log.info("El resultado de la operacion es: {}", resultado);
    }
}