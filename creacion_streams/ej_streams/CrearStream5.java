package ej_streams;

public class CrearStream5 {
    public static void main(String[] args) {
        Path path1 = Paths.get("path_a_tu_archivo.txt");

        try (Stream<String> lineas = Files.lines(path1)) {
            lineas.forEach(
                linea -> {
                    System.out.println("Linea...");
                    System.out.println(linea);
                }
            );
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n");
        Path dir = Paths.get(".");
        System.out.printf("%nEl arbol de archivos del proyecto para: %s es %n", dir.toAbsolutePath());

        try (Stream<Path> paths = Files.walk(dir)) {
            paths.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}