package ejerciciobifunction.test;

import java.util.Objects;
import java.util.function.DoubleFunction;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestSecante {

	private static final Integer ITERACIONES = 10;
	
	private static final Double TOLERANCIA = 0.0001;

	public static void main(String[] args) {
		DoubleFunction<Double> f = x -> Math.pow(x, 3) - 5*Math.pow(x, 2) + 7*x - 3;
		
        Double puntoInicial = 2.5;
        Double aproximacionPrimera = 2.6;
        Double solucion = null;
        Integer ni = 0;
        
        Double[] x = new Double[100];
        x[0] = puntoInicial;
        x[1] = aproximacionPrimera;
        
        for (int i = 2; i <= ITERACIONES && Objects.isNull(solucion); i++) {
        	x[i] = x[i-1] - (f.apply(x[i-1]) * (x[i-1] - x[i-2]) / (f.apply(x[i-1]) - f.apply(x[i-2])));
        	
        	if (Math.abs(x[i] - x[i-1]) < TOLERANCIA) {
        		solucion = x[i];
        	}
        	
        	ni = i;
        }
        
        if (ni == ITERACIONES) {
        	log.error("Convergencia no lograda tras {} iteraciones", ni);
        }
        else {
        	log.info("Solución: {}", solucion);
        }
    }
}
