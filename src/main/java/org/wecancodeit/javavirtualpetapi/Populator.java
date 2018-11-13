package org.wecancodeit.javavirtualpetapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.javavirtualpetapi.models.Pet;
import org.wecancodeit.javavirtualpetapi.repositories.PetRepository;

@Service
public class Populator implements CommandLineRunner {
	
	@Autowired
	PetRepository repo;

	@Override
	public void run(String... args) throws Exception {
		buildCat("Wallace");
		buildDog("Spaceman");
	}

	private void buildCat(String name) {
		repo.save(Pet.cat(name));
	}

	private void buildDog(String name) {
		repo.save(Pet.dog(name));
	}

	
}
