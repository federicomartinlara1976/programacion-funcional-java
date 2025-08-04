package ejercicioBiFunction.ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Calculadora2 {
    public List<Double> calc(BiFunction<Double, Double, Double> bi, List<Empleado> listaEmpleados, Double incremento) {
        
        List<Double> listaSalarios = new ArrayList<>();

        for (Empleado empleado : listaEmpleados) {
            listaSalarios.add(bi.apply(empleado.getSalario(), incremento));
        }

        return listaSalarios;
    }
}