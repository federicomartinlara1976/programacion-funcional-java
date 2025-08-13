package clients;

import java.util.Optional;

import controllers.GuitaristsController;
import lombok.extern.slf4j.Slf4j;
import models.Guitarist;

@Slf4j
public class GuitaristClient {

	public static void main(String[] args) {
		GuitaristsController controller = new GuitaristsController();
		
		Optional<Guitarist> guitarist = controller.getGuitarist("Hendrixxxx");
		
		guitarist.ifPresent(g -> log.info("{}", g));
	}
}
