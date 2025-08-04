package ejerciciobifunction.ejercicio2;

import java.util.List;
import java.util.function.DoubleBinaryOperator;

public class Calculadora2 {
    public List<Double> calc(DoubleBinaryOperator operador, List<Empleado> listaEmpleados, Double incremento) {
        
    	return listaEmpleados.stream()
                .mapToDouble(Empleado::getSalario)
                .map(salario -> operador.applyAsDouble(salario, incremento))
                .boxed()
                .toList();
    }
}