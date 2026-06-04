package ejerciciobifunction.test;

import java.util.List;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        	numero = predicate.test(numero) ? fPar.apply(numero) : fImpar.apply(numero);
        	sb.append(String.format("-> %d ", numero));
        }
        log.info("{}", sb);
        
        log.info("Con programación funcional");
        numero = 7;
        List<Integer> secuencia = Stream.iterate(numero, n -> n != 1, 
                n -> n % 2 == 0 ? n / 2 : n * 3 + 1)
        		.toList();
        
        String resultado = secuencia.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" -> "));
        
        log.info("{}", resultado);
    }
}
