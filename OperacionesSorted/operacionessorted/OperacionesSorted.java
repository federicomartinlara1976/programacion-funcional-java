package operacionessorted;

import java.util.List;
import datos.Empleado;

public class OperacionesSorted {
    public static void main(String[] args) {
        /*System.out.println("Nombres ordenados: ");
        Arrays.asList("Alfredo", "Maria", "Daniel", "Brenda")
            .stream()
            .sorted()
            .forEach(System.out::println);

        System.out.println("Números ordenados: ");
        Arrays.asList(1, 2, 7, 8, 9, 1, 5, 2, 1, 5, 3, 5)
            .stream()
            .sorted()
            .forEach(System.out::println);
        */
        
        List<Empleado> empleados = Empleado.empleados();

        System.out.println("Empleados ordenados por nombre alfabeticamente: ");
        empleados.stream()
            .sorted()
            .forEach(emp -> System.out.println(emp.getNombre() + " " + emp.getGenero()));

        System.out.println("Empleados ordenados por edad: ");
        empleados.stream()
            .sorted(new Comparator<Empleado>() {
                @Override
                public int compare(Empleado emp1, Empleado emp2) {
                    return emp1.getEdad() - emp2.getEdad();
                }
            })
            .forEach(emp -> System.out.println(emp.getNombre() + " " + emp.getEdad()));

        System.out.println("Empleados ordenados por salario: ");
        empleados.stream()
            .filter(emp -> emp.getEdad() > 25)
            .sorted((emp1, emp2) -> 
                     (int) (emp1.getIngresos() - emp2.getIngresos()))
            .forEach(emp -> System.out.println(emp.getNombre() + " " + emp.getIngresos()));

        System.out.println("Empleados ordenados por salario de forma descendente: ");
        empleados.stream()
            .filter(emp -> emp.getEdad() > 25)
            .sorted((emp1, emp2) -> 
                     (int) (emp2.getIngresos() - emp1.getIngresos()))
            .forEach(emp -> System.out.println(emp.getNombre() + " " + emp.getIngresos()));
        
    }
}