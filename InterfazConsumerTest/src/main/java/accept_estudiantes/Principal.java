package accept_estudiantes;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = Arrays.asList(
            new Estudiante("John", 6),
            new Estudiante("Mark", 5),
            new Estudiante("Felix", 5),
            new Estudiante("Patrick", 6),
            new Estudiante("James", 3),
            new Estudiante("Peter", 10),
            new Estudiante("Mathew", 10),
            new Estudiante("Paul", 9),
            new Estudiante("James", 5),
            new Estudiante("Judas", 4),
            new Estudiante("Tomas", 8),
            new Estudiante("Felipe", 7),
            new Estudiante("Tom", 6),
            new Estudiante("María", 7),
            new Estudiante("Magdala", 7),
            new Estudiante("Javier", 7),
            new Estudiante("Amanda", 8),
            new Estudiante("Amanda", 6),
            new Estudiante("Olivia", 9),
            new Estudiante("Cinthia", 9),
            new Estudiante("Felicias", 10),
            new Estudiante("Mancera", 5),
            new Estudiante("Arturo", 2),
            new Estudiante("Abdías", 10)
        );

        OperacionEstudiantes op = new OperacionEstudiantes();

        /** 
        // Consumer que imprime nombre y calificación del estudiante
        Consumer<Estudiante> cons1 = e -> log.info("Nombre: " + e.getNombre() + " - Calificación: " + e.getCalificacion());

        // Imprime lista original de estudiantes
        log.info("Estudiantes sin calificación actualizada:");
        op.aceptaTodos(estudiantes, cons1);

        // Consumer que incrementa la calificación en 15%
        Consumer<Estudiante> cons2 = e -> e.setCalificacion(e.getCalificacion() * 1.15);

        // Aplica el incremento a todos los estudiantes
        op.aceptaTodos(estudiantes, cons2);

        log.info("Estudiantes con calificación actualizada:");
        op.aceptaTodos(estudiantes, cons1);
        */

        Consumer<Estudiante> cons1 = e -> log.info("Nombre: " + e.getNombre() + " - Calificación: " + e.getCalificacion());

        log.info("Estudiantes sin calificación actualizada:");
        op.aceptaTodos(estudiantes, cons1);

        Consumer<Estudiante> cons2 = e -> e.setCalificacion(e.getCalificacion() * 1.15);
        
        // Consumer que imprime nombre y calificación del estudiante después de incrementar la calificación
        // Uso de andThen para aplicar el incremento de calificación y luego imprimir el resultado
        Consumer<Estudiante> cons3 = cons2.andThen(cons1);

        log.info("Estudiantes con calificación actualizada:");
        op.aceptaTodos(estudiantes, cons3);
    }
}