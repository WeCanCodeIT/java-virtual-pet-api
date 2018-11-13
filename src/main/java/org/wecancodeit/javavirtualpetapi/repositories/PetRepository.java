package org.wecancodeit.javavirtualpetapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.javavirtualpetapi.models.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
