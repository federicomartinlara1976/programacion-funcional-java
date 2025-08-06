package evaluaempleados_predicate_bifunction;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Evaluador {
    
	public List<Empleado> evaluar(List<Empleado> listEmp, Predicate<Empleado> eval) {
        return listEmp.stream().filter(eval).collect(Collectors.toList());
    }

    public List<Empleado> evaluarAlContrario(List<Empleado> listEmp, Predicate<Empleado> eval) {
        return listEmp.stream().filter(eval.negate()).collect(Collectors.toList());
    }
}