package ejercicios;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.function.DoubleSupplier;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SupplierTest2 {
	
	@Test
    void test() {
        DoubleSupplier randomSupplier = Math::random;
        
        Double value1 = randomSupplier.getAsDouble();
        Double value2 = randomSupplier.getAsDouble();
        
        log.info("{} == {}: {}", value1, value2, value1 == value2);
        
        assertNotEquals(value1, value2);
    }
}