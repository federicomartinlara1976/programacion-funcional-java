package ejercicios;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.Supplier;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SupplierTest {
    
	@Test
	void test() {
        Supplier<String> i = () -> "Javier";
        
        log.info("El valor pasado es: {}", i.get());
        
        assertEquals("Javier", i.get());
    }
}