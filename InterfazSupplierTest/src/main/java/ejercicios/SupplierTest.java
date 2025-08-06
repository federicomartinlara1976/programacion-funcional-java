package ejercicios;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> i = () -> "Javier";
        log.info("El valor pasado es: " + i.get());
    }
}