package ejercicio;

import java.util.function.Consumer;

public class TestConsumer {
    public static void main(String[] args) {
        Consumer<String> consumer = x -> log.info(x);
        consumer.accept("Javier"); 
    }
}