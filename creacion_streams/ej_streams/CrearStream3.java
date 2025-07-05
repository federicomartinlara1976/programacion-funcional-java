package ej_streams;

public class CrearStream3 {
    public static void main(String[] args) {
        // Crear un stream de arrays
        IntStream numStream = Arrays.stream(new int[] {1, 2, 3, 4, 5, 6});
        numStream.forEach(System.out::println);

        Stream<String> nombres = Arrays.stream(new String[] {"Juan", "Maria", "Pedro", "Ana", "Luis"});
        nombres.forEach(System.out::println);

        Set<String> lenguajesSet = new HashSet<>();
        lenguajesSet.add("Java");
        lenguajesSet.add("C++");
        lenguajesSet.add("C#");

        Stream<String> lenguajesStream = lenguajesSet.stream();
        lenguajesStream.forEach(System.out::println);

        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Juan", 20));
        estudiantes.add(new Estudiante("Maria", 21));
        estudiantes.add(new Estudiante("Pedro", 22));
        estudiantes.add(new Estudiante("Ana", 23));
        estudiantes.add(new Estudiante("Luis", 24));
        estudiantes.add(new Estudiante("Ramiro", 24));
        estudiantes.add(new Estudiante("Leonardo", 24));

        // Crear un stream de estudiantes
        System.out.println("\nStream de estudiantes");
        Stream<Estudiante> estudiantesStream = estudiantes.parallelStream();
        estudiantesStream.forEach(estudiante -> System.out.println(estudiante.getNombre()));
    }
}