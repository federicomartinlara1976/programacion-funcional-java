package controllers;

import java.util.Optional;

import models.Guitarist;
import services.GuitaristService;

public class GuitaristsController {

	public Optional<Guitarist> getGuitarist(String lastName) {
		return new GuitaristService().findByLastName(lastName);
	}
}
