package ej_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import lombok.extern.slf4j.Slf4j;
import pojos.Estudiante;

@Slf4j
public class CrearStream3 {
    public static void main(String[] args) {
        // Crear un stream de arrays
        IntStream numStream = Arrays.stream(new int[] {1, 2, 3, 4, 5, 6});
        numStream.forEach(num -> log.info("{}", num));

        Stream<String> nombres = Arrays.stream(new String[] {"Juan", "Maria", "Pedro", "Ana", "Luis"});
        nombres.forEach(nombre -> log.info("{}", nombre));

        Set<String> lenguajesSet = new HashSet<>();
        lenguajesSet.add("Java");
        lenguajesSet.add("C++");
        lenguajesSet.add("C#");

        Stream<String> lenguajesStream = lenguajesSet.stream();
        lenguajesStream.forEach(lenguaje -> log.info("{}", lenguaje));

        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Juan", 20, 0.0, 0.0));
        estudiantes.add(new Estudiante("Maria", 21, 0.0, 0.0));
        estudiantes.add(new Estudiante("Pedro", 22, 0.0, 0.0));
        estudiantes.add(new Estudiante("Ana", 23, 0.0, 0.0));
        estudiantes.add(new Estudiante("Luis", 24, 0.0, 0.0));
        estudiantes.add(new Estudiante("Ramiro", 24, 0.0, 0.0));
        estudiantes.add(new Estudiante("Leonardo", 24, 0.0, 0.0));

        // Crear un stream de estudiantes
        log.info("Stream de estudiantes");
        Stream<Estudiante> estudiantesStream = estudiantes.parallelStream();
        estudiantesStream.forEach(estudiante -> log.info("{}", estudiante.getIdentificacion()));
    }
}