package ejercicio2;

import java.util.function.IntFunction;
import java.util.function.IntPredicate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestCollatz {

	public static void main(String[] args) {
		IntFunction<Integer> fPar = n -> n / 2;
		IntFunction<Integer> fImpar = n -> n * 3 + 1;
		IntPredicate predicate = n -> n % 2 == 0;
		
        Integer numero = 7;
        StringBuilder sb = new StringBuilder(String.format("%d ", numero));
        
        while (numero != 1) {
        	
        	if (predicate.test(numero)) {
        		numero = fPar.apply(numero);
        	}
        	else {
        		numero = fImpar.apply(numero);
        	}
        	
        	sb.append(String.format("-> %d ", numero));
        }
        
        log.info("{}", sb.toString());
    }
}
