package lambdas_sin_parametros;

public class LambdaTest {
    public static void main(String[] args) {
        // Lambda sin parametros
        FunctionTest functionTest = () -> System.out.println("Hola, mundo!");
        functionTest.saludar();

        LambdaTest lambdaTest = new LambdaTest();
        lambdaTest.miMetodo(functionTest);
    }

    public void miMetodo(FunctionTest functionTest) {
        functionTest.saludar();
    }
}