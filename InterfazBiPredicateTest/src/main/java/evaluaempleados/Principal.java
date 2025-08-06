package evaluaempleados;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

import lombok.extern.slf4j.Slf4j;

/**
 * Se requiere obtener un reporte con todos los empleados que cumplan
 * con alguno de estos dos conjuntos de criterios:
 * 1) 25 años en adelante y que estén en el departamento de Ventas o
 * 2) 25 años en adelante y que estén en mostrador.
 */
@Slf4j
public class Principal {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = Arrays.asList(
            new Empleado("Rodrigo", 25, 1500, "Cobranzas"),
            new Empleado("Alicia", 25, 1500, "Ventas"),
            new Empleado("Manolo", 30, 1500, "Ventas"),
            new Empleado("Cinthia", 20, 2500, "Mostrador"),
            new Empleado("Esteban", 25, 7000, "Ventas"),
            new Empleado("Dámaris", 20, 600, "Telemarketing"),
            new Empleado("Lina", 36, 2500, "Mostrador"),
            new Empleado("Nayeli", 41, 10000, "Ventas"),
            new Empleado("Flor", 52, 7000, "Compras"),
            new Empleado("German", 41, 1500, "Facturación"),
            new Empleado("Lidia", 21, 600, "Telemarketing"),
            new Empleado("Eleazar", 52, 600, "Cobranzas"),
            new Empleado("Javier", 62, 600, "Cobranzas"),
            new Empleado("Paola", 19, 1500, "Compras"),
            new Empleado("Ignacio", 21, 500, "Recursos Humanos"),
            new Empleado("Rodrigo", 21, 500, "Recursos Humanos"),
            new Empleado("Yolanda", 21, 1000, "Ventas"),
            new Empleado("Arturo", 54, 1500, "Cobranzas"),
            new Empleado("Olivia", 28, 562, "Mostrador"),
            new Empleado("Gerardo", 19, 5222, "Mostrador"),
            new Empleado("Richard", 34, 6500, "Mostrador"),
            new Empleado("Manuel", 40, 2000, "Facturación"),
            new Empleado("Jocabed", 21, 4666, "Mostrador"),
            new Empleado("Noe", 43, 1500, "Cobranzas"),
            new Empleado("Salvia", 33, 1500, "Cobranzas"),
            new Empleado("Pablo", 33, 1500, "Cobranzas"),
            new Empleado("Pedro", 55, 1500, "Compras"),
            new Empleado("Adamaris", 44, 10000, "Recursos Humanos")
        );

        Evaluador evaluador = new Evaluador();

        BiPredicate<Integer, String> primerCriterio = (edad, departamento) -> (edad > 25) && (departamento.equals("Ventas"));

        BiPredicate<Integer, String> segundoCriterio = (edad, departamento) -> (edad > 25) && (departamento.equals("Mostrador"));

        BiPredicate<Integer, String> criterio = primerCriterio.or(segundoCriterio);

        log.info("Empleados de mostrador o ventas mayores de 25 años:");

        List<Empleado> listaActualizada = evaluador.evaluar(listaEmpleados, criterio);

        for (Empleado empleado : listaActualizada) {
            log.info("Nombre: " + empleado.getNombre() + " - Edad: " + empleado.getEdad() + " - Departamento: " + empleado.getDepartamento());
        }
    }
}