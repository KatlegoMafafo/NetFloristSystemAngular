package com.florist.NetFlorist.repositories;

import com.florist.NetFlorist.model.Orderstatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

/**
 *
 * @author Katlego Mafafo
 */
@RepositoryRestController
public interface OrderStatusRepository extends CrudRepository<Orderstatus, Integer>{
    
} //end of code
