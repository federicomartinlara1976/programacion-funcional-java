package ejerciciofunction;

import java.util.function.Function;
import java.util.function.IntFunction;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestFunction {
    public static void main(String[] args) {
    	log.info("Con interfaz Function");
    	Function<Integer, String> convertidor = x -> Integer.toString(x);
        
        log.info("{}", convertidor.apply(3).length());
        log.info("{}", convertidor.apply(30).length());
        log.info("{}", convertidor.apply(300).length());
        
        log.info("Con interfaz IntFunction");
    	IntFunction<String> convertidor2 = x -> Integer.toString(x);
        
        log.info("{}", convertidor2.apply(3).length());
        log.info("{}", convertidor2.apply(30).length());
        log.info("{}", convertidor2.apply(300).length());
    }
}
