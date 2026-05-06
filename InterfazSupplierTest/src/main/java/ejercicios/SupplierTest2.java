package ejercicios;
import java.util.function.DoubleSupplier;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SupplierTest2 {
    public static void main(String[] args) {
        DoubleSupplier randomSupplier = Math::random;
        double value1 = randomSupplier.getAsDouble();
        double value2 = randomSupplier.getAsDouble();
        log.info("{} == {}: {}", value1, value2, value1 == value2);
    }
}