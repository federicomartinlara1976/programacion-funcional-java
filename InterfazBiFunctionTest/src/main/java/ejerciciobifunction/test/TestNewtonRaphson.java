package ejerciciobifunction.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.DoubleFunction;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestNewtonRaphson {

	private static final Integer ITERACIONES = 100;
	
	private static final Double TOLERANCIA = 0.0000000000001;

	public static void main(String[] args) {
		DoubleFunction<Double> f = x -> Math.pow(x, 3) - 5*Math.pow(x, 2) + 7*x - 3;
		DoubleFunction<Double> df = x -> 3*Math.pow(x, 2) - 10*x + 7;
		
        Double puntoInicial = 2.5;
        Double solucion = null;
        Integer ni = 0;
        
        List<Double> x = new ArrayList<>();
        x.add(puntoInicial);
        
        for (int i = 1; i <= ITERACIONES && Objects.isNull(solucion); i++) {
        	x.add(x.get(i-1) - (f.apply(x.get(i-1))/df.apply(x.get(i-1))));
        	
        	if (Math.abs(x.get(i) - x.get(i-1)) < TOLERANCIA) {
        		solucion = x.get(i);
        	}
        	
        	ni = i;
        }
        
        if (ni == ITERACIONES) {
        	log.error("Convergencia no lograda tras {} iteraciones", ni);
        }
        else {
        	log.info("Solución: {}, iteraciones: {}", solucion, ni);
        }
    }
}
