package lambdas_con_parametros;

public class LambdaTest2 {
    public static void main(String[] args) {
        // Operaciones operaciones = (num1, num2) -> System.out.println(num1 + num2);
        
        LambdaTest2 lambdaTest2 = new LambdaTest2();
        lambdaTest2.miMetodo((num1, num2) -> System.out.println(num1 + num2), 15, 30);
    }

    public void miMetodo(Operaciones operaciones, int num1, int num2) {
        operaciones.imprimeOperacion(num1, num2);
    }
}