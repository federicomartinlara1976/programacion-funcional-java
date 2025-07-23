package operacionesfilter;

import java.util.List;
import datos.Empleado;
import java.util.function.Predicate;

public class OperacionesFilter {
    public static void main(String[] args) {
        List<Empleado> empleados = Empleado.empleados();

        System.out.println("Empleados hombres: ");
        empleados.stream()
            .filter(new Predicate<Empleado>() {
                @Override
                public boolean test(Empleado empleado) {
                    return empleado.esHombre();
                }
            })
            .forEach(
                emp -> System.out.println(emp.getNombre() + " " + emp.getGenero())
            );

        System.out.println("Empleados que son mujeres: ");
        empleados.stream()
            .filter(Empleado::esMujer)
            .forEach(
                emp -> System.out.println(emp.getNombre() + " " + emp.getGenero())
            )

        System.out.println("Empleados mayores de 25 años: ");
        empleados.stream()
            .filter(emp -> emp.getEdad() > 25)
            .forEach(
                emp -> System.out.println(emp.getNombre() + " " + emp.getEdad())
            );

        System.out.println("Empleados masculinos y su nombre empiece con la letra 'a': ");
        empleados.stream()
            .filter(Empleado::esHombre)
            .filter(emp -> emp.getNombre().startsWith("A"))
            .forEach(emp -> System.out.println(emp.getNombre()));

        System.out.println("Personal masculino que gana más de 500: ");
        empleados.stream()
            .filter(Empleado::esHombre && emp.getIngresos() > 500)
            .forEach(emp -> System.out.println(emp.getNombre() + " " + emp.getIngresos()));

        System.out.println("Personal femenino mayor de 25 años con ingresos por encima de los 300: ");
        Predicate<Empleado> empFemenino = emp -> emp.esMujer();
        Predicate<Empleado> empMayorDe25 = emp -> emp.getEdad() > 25;
        Predicate<Empleado> empMayor300 = emp -> emp.getIngresos() > 300;
        Predicate<Empleado> fem25300 = empFemenino.and(empMayorDe25).and(empMayor300);

        empleados.stream()
            .filter(fem25300)
            .forEach(emp -> System.out.println(emp.getNombre() + " " + emp.getGenero() + " "
                + emp.getIngresos()));

        System.out.println("Cantidad total de empleados: " + empleados.stream().filter(fem25300).count());            
    }
}