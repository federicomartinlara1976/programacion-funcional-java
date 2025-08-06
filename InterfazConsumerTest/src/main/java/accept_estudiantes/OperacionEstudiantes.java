package accept_estudiantes;

import java.util.List;
import java.util.function.Consumer;

public class OperacionEstudiantes {
    public void aceptaTodos(List<Estudiante> estudiantes, Consumer<Estudiante> consumer) {
        estudiantes.forEach(consumer);
    }
}