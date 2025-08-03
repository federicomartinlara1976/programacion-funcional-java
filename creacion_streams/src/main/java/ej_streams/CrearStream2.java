package ej_streams;

import java.util.Random;
import java.util.stream.Stream;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CrearStream2 {
    public static void main(String[] args) {
        // Crearion de streams de objetos long
        Stream<Long> primerosDiez = Stream.iterate(1L, n -> n + 1)
            .limit(10);

        primerosDiez.forEach(num -> log.info("{}", num));

        Stream.iterate(1L, n -> n + 1)
            .filter(n -> n % 2 == 0)
            .limit(20)
            .forEach(num -> log.info("{}", num));

        log.info("\nDespues de 100");
        Stream.iterate(1L, n -> n + 1)
            .filter(n -> n % 2 == 0)
            .skip(100)
            .limit(5)
            .forEach(num -> log.info("{}", num));

        // Generar un stream de 5 números aleatorios
        log.info("\nNumeros aleatorios");
        Stream.generate(Math::random)
            .limit(5)
            .forEach(num -> log.info("{}", num));

        Stream.generate(Math::random)
            .filter(n -> n > 0.5)
            .limit(5)
            .forEach(num -> log.info("{}", num));  

        // Generar un stream de 5 números aleatorios
        log.info("\nEnteros aleatorios");
        new Random().ints()
            .limit(5)
            .forEach(num -> log.info("{}", num));
    }
}