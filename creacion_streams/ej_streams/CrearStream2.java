package ej_streams;

import java.util.Random;
import java.util.stream.Stream;

public class CrearStream2 {
    public static void main(String[] args) {
        // Crearion de streams de objetos long
        Stream<Long> primerosDiez = Stream.iterate(1L, n -> n + 1)
            .limit(10);

        primerosDiez.forEach(System.out::println);

        Stream.iterate(1L, n -> n + 1)
            .filter(n -> n % 2 == 0)
            .limit(20)
            .forEach(System.out::println);

        System.out.println("\nDespues de 100");
        Stream.iterate(1L, n -> n + 1)
            .filter(n -> n % 2 == 0)
            .skip(100)
            .limit(5)
            .forEach(System.out::println);

        // Generar un stream de 5 números aleatorios
        System.out.println("\nNumeros aleatorios");
        Stream.generate(Math::random)
            .limit(5)
            .forEach(System.out::println);

        Stream.generate(Math::random)
            .filter(n -> n > 0.5)
            .limit(5)
            .forEach(System.out::println);  

        // Generar un stream de 5 números aleatorios
        System.out.println("\nEnteros aleatorios");
        new Random().ints()
            .limit(5)
            .forEach(System.out::println);
    }
}