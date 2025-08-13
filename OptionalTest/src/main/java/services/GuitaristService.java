package services;

import java.util.Optional;

import models.Guitarist;

public class GuitaristService {
	
	public Optional<Guitarist> findByLastName(String lastName) {
		if (lastName.equalsIgnoreCase("Hendrix")) {
			return Optional.of(new Guitarist("Jimi", "Hendrix", "Purple Haze"));
		}
		
		return Optional.empty();
	}
}
