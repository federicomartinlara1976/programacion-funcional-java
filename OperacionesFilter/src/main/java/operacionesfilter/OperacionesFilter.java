package operacionesfilter;

import java.util.List;
import java.util.function.Predicate;

import datos.Empleado;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OperacionesFilter {
    public static void main(String[] args) {
        List<Empleado> empleados = Empleado.empleados();

        log.info("Empleados hombres: ");
        empleados.stream()
            .filter(new Predicate<Empleado>() {
                @Override
                public boolean test(Empleado empleado) {
                    return empleado.esHombre();
                }
            })
            .forEach(
                emp -> log.info(emp.getNombre() + " " + emp.getGenero())
            );

        log.info("Empleados que son mujeres: ");
        empleados.stream()
            .filter(Empleado::esMujer)
            .forEach(
                emp -> log.info("{} {}", emp.getNombre(), emp.getGenero())
            );

        log.info("Empleados mayores de 25 años: ");
        empleados.stream()
            .filter(emp -> emp.getEdad() > 25)
            .forEach(
                emp -> log.info("{} {}", emp.getNombre(), emp.getEdad())
            );

        log.info("Empleados masculinos y su nombre empiece con la letra 'a': ");
        empleados.stream()
            .filter(Empleado::esHombre)
            .filter(emp -> emp.getNombre().startsWith("A"))
            .forEach(emp -> log.info(emp.getNombre()));

        log.info("Personal masculino que gana más de 500: ");
        empleados.stream()
            .filter(emp -> emp.esHombre() && emp.getIngresos() > 500)
            .forEach(emp -> log.info("{} {}", emp.getNombre(), emp.getIngresos()));

        log.info("Personal femenino mayor de 25 años con ingresos por encima de los 300: ");
        Predicate<Empleado> empFemenino = emp -> emp.esMujer();
        Predicate<Empleado> empMayorDe25 = emp -> emp.getEdad() > 25;
        Predicate<Empleado> empMayor300 = emp -> emp.getIngresos() > 300;
        Predicate<Empleado> fem25300 = empFemenino.and(empMayorDe25).and(empMayor300);

        empleados.stream()
            .filter(fem25300)
            .forEach(emp -> log.info("{} {} {}", emp.getNombre(), emp.getGenero(), emp.getIngresos()));

        log.info("Cantidad total de empleados: " + empleados.stream().filter(fem25300).count());            
    }
}