package ejerciciofunction;

import java.util.function.Function;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestFunction {
    public static void main(String[] args) {
        Function<Integer, String> convertidor = x -> Integer.toString(x);
        
        log.info("{}", convertidor.apply(3).length());
        log.info("{}", convertidor.apply(30).length());
        log.info("{}", convertidor.apply(300).length());
    }
}
