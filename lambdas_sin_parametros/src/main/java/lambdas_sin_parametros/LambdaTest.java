package lambdas_sin_parametros;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LambdaTest {
    public static void main(String[] args) {
        // Lambda sin parametros
        FunctionTest functionTest = () -> log.info("Hola, mundo!");
        functionTest.saludar();

        LambdaTest lambdaTest = new LambdaTest();
        lambdaTest.miMetodo(functionTest);
    }

    public void miMetodo(FunctionTest functionTest) {
        functionTest.saludar();
    }
}