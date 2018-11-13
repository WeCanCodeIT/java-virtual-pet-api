package org.wecancodeit.javavirtualpetapi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pet {

	@Id @GeneratedValue private Long id;
	private String name;
	private String type;
	
	public Pet() {
	}
	
	public Pet(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	public static Pet cat(String name) {
		return new Pet(name, "cat");
	}
	
	public static Pet dog(String name) {
		return new Pet(name, "dog");
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}
	
	
}
