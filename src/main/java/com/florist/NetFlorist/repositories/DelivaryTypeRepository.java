package com.florist.NetFlorist.repositories;

import com.florist.NetFlorist.model.Delivarytpes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author Katlego Mafafo
 */
@RepositoryRestResource
public interface DelivaryTypeRepository  extends CrudRepository<Delivarytpes, Integer>{
    
} //end of code
