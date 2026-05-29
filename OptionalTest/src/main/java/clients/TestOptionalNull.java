package clients;

import java.util.Optional;

import lombok.extern.slf4j.Slf4j;
import models.Guitarist;

@Slf4j
public class TestOptionalNull {

	public static void main(String[] args) {
		try {
			Optional<Guitarist> guitarist = Optional.of(null);
			guitarist.ifPresent(g -> log.info("{}", g));
		} catch (NullPointerException e) {
			log.error("Optional.of() no puede tener valores nulos");
		}
		
		Optional<Guitarist> guitarist = Optional.ofNullable(null);
		guitarist.ifPresentOrElse(g -> log.info("{}", g), () -> log.info("Optional no tiene ningún valor"));
	}
}
