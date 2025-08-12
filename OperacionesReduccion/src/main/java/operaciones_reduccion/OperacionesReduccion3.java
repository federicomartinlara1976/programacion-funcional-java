package operaciones_reduccion;

import java.util.stream.IntStream;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OperacionesReduccion3 {
	public static void main(String[] args) {
		log.info("{}", IntStream.range(1, 20).summaryStatistics());
		
		log.info("Suma: {}", IntStream.range(1, 20).summaryStatistics().getSum());
		
		log.info("Promedio {}", IntStream.range(1, 20).summaryStatistics().getAverage());
	}
}