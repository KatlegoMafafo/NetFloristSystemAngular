package com.florist.NetFlorist.repositories;

import com.florist.NetFlorist.model.Banknames;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

/**
 *
 * @author Katlego Mafafo
 */
@RepositoryRestController
public interface BankNamesRepository  extends CrudRepository<Banknames, Integer>{
    
} //end of code
