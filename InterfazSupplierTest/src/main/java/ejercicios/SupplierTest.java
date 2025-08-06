package ejercicios;
import java.util.function.Supplier;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> i = () -> "Javier";
        log.info("El valor pasado es: " + i.get());
    }
}