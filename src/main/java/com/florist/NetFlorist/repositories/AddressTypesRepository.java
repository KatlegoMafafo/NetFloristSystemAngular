package com.florist.NetFlorist.repositories;

import com.florist.NetFlorist.model.Addresstypes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

/**
 *
 * @author Katlego Mafafo
 */
@RepositoryRestController
public interface AddressTypesRepository extends CrudRepository<Addresstypes, Integer>{
    
} //end of code
