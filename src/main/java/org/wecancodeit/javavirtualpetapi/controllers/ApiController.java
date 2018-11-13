package org.wecancodeit.javavirtualpetapi.controllers;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.javavirtualpetapi.models.Pet;
import org.wecancodeit.javavirtualpetapi.repositories.PetRepository;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ApiController {
	
	@Autowired
	PetRepository repo;

	@GetMapping({"", "/", "/index"})
	public String foo() {
		return "Hello API";
	}
	
	@GetMapping("/pets")
	public Collection<Pet> getPets() {
		return (Collection<Pet>) repo.findAll();
	}
	
	@GetMapping("/pets/{id}")
	public Object getPet(@PathVariable(value = "id") Long id) {
		Optional<Pet> pet = repo.findById(id);
		if (pet.isPresent()) {
			return pet.get();
		} else {
			return "redirect:/pets";
		}
	}
}
