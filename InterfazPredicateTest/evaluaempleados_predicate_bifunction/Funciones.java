import java.util.function.BiFunction;

public class Funciones {
    public double incrementoSalario(Empleado emp, double incremento, BiFunction<Double, Double, Double> bi) {
        return bi.apply(emp.getSalario(), incremento);
    }
}