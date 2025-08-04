package ejercicios;

import java.util.function.BiConsumer;

public class InterfazBiConsumerTest {
    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = (num1, num2) -> {
            double mult = num1 * num2;
            System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + mult);
        };
        biConsumer.accept(15.2, 52.25);
    }
}