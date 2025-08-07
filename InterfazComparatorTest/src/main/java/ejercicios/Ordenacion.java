package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import modelos.Persona;

@Slf4j
public class Ordenacion {
    
	public static void main(String[] args) {
        // Ordenación natural de Strings con Comparable.
        List<String> nombres = Arrays.asList("Carlos", "Ana", "Abías", "Germán");

        log.info("Lista antes de ordenarse: {}", nombres);

        Collections.sort(nombres);

        log.info("Lista después de ordenarse: {}", nombres);

        // Ordenacion de personas con Comparable.
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1, "Mario"));
        personas.add(new Persona(2, "Fernando"));
        personas.add(new Persona(3, "Omar"));
        personas.add(new Persona(4, "Juana"));

        log.info("Lista de personas antes de ordenarse: {}", personas);

        Collections.sort(personas);

        log.info("Lista de personas ordenadas por nombre: {}", personas);

        log.info("Lista de personas ordenadas por id:");
    
        Collections.sort(personas, new OrdenarPersonaPorId());
        log.info("Usando el comparator OrdenarPersonaPorId: {}", personas);
        
        Collections.sort(personas, new Comparator<Persona>() {
             @Override
             public int compare(Persona o1, Persona o2) {
                 return o1.getIdPersona() - o2.getIdPersona();
             }
        });
        log.info("Usando el comparator anónimo: {}", personas);
                
        Collections.sort(personas, (p1, p2) -> p1.getIdPersona() - p2.getIdPersona());
        log.info("Usando el comparator anónimo con lambda: {}", personas);
    }
}