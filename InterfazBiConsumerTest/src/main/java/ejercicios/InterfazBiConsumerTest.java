package ejercicios;

import java.util.function.BiConsumer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InterfazBiConsumerTest {
    public static void main(String[] args) {
        BiConsumer<Double, Double> biConsumer = (num1, num2) -> {
            double mult = num1 * num2;
            log.info("La multiplicación de {} y {} es {}", num1, num2, mult);
        };
        biConsumer.accept(15.2, 52.25);
    }
}