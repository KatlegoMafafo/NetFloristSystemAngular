package com.florist.NetFlorist.repositories;

import com.florist.NetFlorist.model.Provinces;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author Katlego Mafafo
 */
@RepositoryRestResource
public interface ProvinceRepositiory extends CrudRepository<Provinces, Integer> {
    
}
