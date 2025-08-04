public class EjercicioBiFunction2 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        String resultado = calculadora.calc((x, y) -> ": " + (x * y), 60, 10);
        
        System.out.println("El resultado de la multiplicacion es: " + resultado);
    }
}