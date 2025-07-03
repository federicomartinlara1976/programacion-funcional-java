package evaluaempleados;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Evaluador {
    public List<Empleado> evaluar(List<Empleado> listEmp, Predicate<Empleado> eval) {
        List<Empleado> listaNueva = new ArrayList<>();
        for (Empleado empleado : listEmp) {
            if (eval.test(empleado)) {
                listaNueva.add(empleado);
            }
        }
        return listaNueva;
    }

    public List<Empleado> evaluarAlContrario(List<Empleado> listEmp, Predicate<Empleado> eval) {
        List<Empleado> listaNueva = new ArrayList<>();
        for (Empleado empleado : listEmp) {
            if (eval.negate().test(empleado)) {
                listaNueva.add(empleado);
            }
        }
        return listaNueva;
    }
}