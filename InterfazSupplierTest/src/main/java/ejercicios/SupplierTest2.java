package ejercicios;
import java.util.function.Supplier;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SupplierTest2 {
    public static void main(String[] args) {
        Supplier<Double> randomSupplier = () -> Math.random();
        double value1 = randomSupplier.get();
        double value2 = randomSupplier.get();
        log.info("{} == {}: {}", value1, value2, value1 == value2);
    }
}