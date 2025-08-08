package operacionesmap;

import java.util.List;

import datos.Empleado;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class OperacionesMap {
    public static void main(String[] args) {
        /*IntStream.rangeClosed(1, 5)
            .map(new IntUnaryOperator() {
                @Override
                public int applyAsInt(int numero) {
                    return numero * numero;
                }
            })
            .forEach(System.out::println); //1 4 9 16 25

        IntStream.rangeClosed(1, 10)
            .map(n -> n * 2)
            .forEach(System.out::println); //2 4 6 8 10 12 14 16 18 20
        */
        List<Empleado> empleados = Empleado.empleados();

        log.info("Promedio de ingresos de personal femenino mayor de 25 años: ");
        double suma = empleados.stream()
                .filter(emp -> emp.esMujer())
                .filter(emp -> emp.getEdad() > 25)
                .mapToDouble(emp -> emp.getIngresos())
                .sum();

        double promedio = suma / empleados.stream()
                .filter(emp -> emp.esMujer())
                .filter(emp -> emp.getEdad() > 25)
                .count();

        log.info("El promedio es: " + promedio);
    }
}