package ejercicio;

import java.util.function.Consumer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestConsumer {
    public static void main(String[] args) {
        Consumer<String> consumer = x -> log.info(x);
        consumer.accept("Javier"); 
    }
}