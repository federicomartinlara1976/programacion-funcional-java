import java.util.function.BinaryOperator;

public class BinaryOperatorTest {
    public static void main(String[] args) {
        BinaryOperator<Integer> bOperator = (num1, num2) -> num1 * num2;
        
        //Aplicando el metodo apply.
        int resultado = bOperator.apply(10, 20);
        System.out.println("El resultado es: " + resultado);

        //Uso del metodo minBy.
        BinaryOperator<Integer> bOperatorMin = BinaryOperator.minBy((Integer t1, Integer t2) -> t1.compareTo(t2));
        resultado = bOperatorMin.apply(10, 20);
        System.out.println("El número menor de 10 y 20 es: " + resultado);

        //uso de maxBy.
        BinaryOperator<Integer> bOperatorMax = BinaryOperator.maxBy((Integer t1, Integer t2) -> t1.compareTo(t2));
        resultado = bOperatorMax.apply(10, 20);
        System.out.println("El número mayor de 10 y 20 es: " + resultado);
    }
}