package evaluaempleados;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class Evaluador {
    public List<Empleado> evaluar(List<Empleado> listaEmp, BiPredicate<Integer, String> eval) {
    	return listaEmp.stream()
                .filter(emp -> eval.test(emp.getEdad(), emp.getDepartamento()))
                .collect(Collectors.toList()); // Mutable
    }
}