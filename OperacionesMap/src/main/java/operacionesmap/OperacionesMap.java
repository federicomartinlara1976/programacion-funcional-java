package operacionesmap;

import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.stream.IntStream;

import datos.Empleado;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class OperacionesMap {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 5)
            .map(new IntUnaryOperator() {
                @Override
                public int applyAsInt(int numero) {
                    return numero * numero;
                }
            })
            .forEach(n -> log.info("{}", n)); //1 4 9 16 25

        IntStream.rangeClosed(1, 10)
            .map(n -> n * 2)
            .forEach(n -> log.info("{}", n)); //2 4 6 8 10 12 14 16 18 20
        
        List<Empleado> empleados = Empleado.empleados();

        log.info("Promedio de ingresos de personal femenino mayor de 25 años: ");
        Predicate<Empleado> empFemenino = emp -> emp.esMujer();
        Predicate<Empleado> empMayorDe25 = emp -> emp.getEdad() > 25;
        Predicate<Empleado> fem25 = empFemenino.and(empMayorDe25);
        
        double suma = empleados.stream()
                .filter(fem25)
                .mapToDouble(emp -> emp.getIngresos())
                .sum();

        double promedio = suma / empleados.stream()
                .filter(fem25)
                .count();

        log.info("El promedio es: {}", promedio);
    }
}