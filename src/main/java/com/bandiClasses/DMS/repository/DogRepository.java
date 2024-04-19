package com.bandiClasses.DMS.repository;
/**
* @author S562894
*/
import java.util.List;

/**
 * @author S567645
 */

import org.springframework.data.repository.CrudRepository;

import com.bandiClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	
	List<Dog> findByName(String name);
	

}
