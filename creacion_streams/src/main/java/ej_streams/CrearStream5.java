package ej_streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CrearStream5 {
    
	public static void main(String[] args) {
        Path path1 = Paths.get("path_a_tu_archivo.txt");

        try (Stream<String> lineas = Files.lines(path1)) {
            lineas.forEach(
                linea -> {
                    log.info("Linea...");
                    log.info(linea);
                }
            );
        } catch (IOException e) {
            log.error("ERROR", e);
        }

        log.info("\n");
        Path dir = Paths.get(".");
        log.info("\nEl arbol de archivos del proyecto para {} es: \n", dir.toAbsolutePath());

        try (Stream<Path> paths = Files.walk(dir)) {
            paths.forEach(cadena -> log.info("{}", cadena));
        } catch (IOException e) {
        	log.error("ERROR", e);
        }
    }
}