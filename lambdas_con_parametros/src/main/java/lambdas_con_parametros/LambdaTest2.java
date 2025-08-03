package lambdas_con_parametros;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LambdaTest2 {
    public static void main(String[] args) {
        Operaciones op = (num1, num2) -> log.info("{}", num1 + num2);
        op.imprimeOperacion(15, 30);
        
        LambdaTest2 lambdaTest2 = new LambdaTest2();
        lambdaTest2.miMetodo((num1, num2) -> log.info("{}", num1 * num2), 15, 30);
    }

    public void miMetodo(Operaciones operaciones, int num1, int num2) {
        operaciones.imprimeOperacion(num1, num2);
    }
}