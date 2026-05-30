package clients;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;
import models.Guitarist;

@Slf4j
public class TestOptionalNull {

	@Test
	public void testNull() {
		assertThrows(NullPointerException.class,() -> Optional.of(null));

		Optional<Guitarist> guitarist2 = Optional.ofNullable(null);
		assertTrue(guitarist2.isEmpty());
	}
}
