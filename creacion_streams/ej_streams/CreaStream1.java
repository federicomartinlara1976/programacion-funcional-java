package ej_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import pojos.Estudiante;

public class CreaStream1 {
    public static void main(String[] args) {
        // Creacion de stream a partir de un String
        Stream<String> stream1 = Stream.of("Curso de programacion");
        stream1.forEach(System.out::println);

        Stream<String> stream2 = Stream.of("curso1", "curso2", "curso3", "curso4");
        stream2.forEach(System.out::println);

        // Stream a partir de un array
        String[] array = {"java", "c++", "c#", "ruby"};
        Stream<String> stream3 = Stream.of(array);
        stream3.forEach(System.out::println);

        // Stream a partir de una lista de estudiantes
        Stream<Estudiante> streamEstudiantes = Stream.<Estudiante>builder()
            .add(new Estudiante("n01", 17, 1.70, 9.5))
            .add(new Estudiante("n02", 21, 1.70, 9.5))
            .build();
        streamEstudiantes.forEach(estudiante -> System.out.println(estudiante.getIdentificacion()));

        // Crearion de streams de objetos int
        //IntStream unoAVeinte = IntStream.range(1, 21);
        IntStream unoAVeinte = IntStream.rangeClosed(1, 21);
        unoAVeinte.forEach(System.out::println);
    }
}