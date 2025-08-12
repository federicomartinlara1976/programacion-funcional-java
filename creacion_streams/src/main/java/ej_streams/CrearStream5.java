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
        Path path1 = Paths.get("/home/federico/.init/.bash_aliases");

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

        Path dir = Paths.get(".");
        log.info("El arbol de archivos del proyecto para {} es:", dir.toAbsolutePath());

        try (Stream<Path> paths = Files.walk(dir)) {
            paths.forEach(cadena -> log.info("{}", cadena));
        } catch (IOException e) {
        	log.error("ERROR", e);
        }
    }
}