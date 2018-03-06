package com.florist.NetFlorist.repositories;

import com.florist.NetFlorist.model.Category;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.webmvc.RepositoryRestController;

/**
 *
 * @author Katlego Mafafo
 */
@RepositoryRestController
public interface CatagoryRepository extends CrudRepository<Category, Integer>{
   
    @Transactional
    @Modifying
    @Query("Delete FROM Category c WHERE c.name = :name")
    public int deleteCategory(@Param("name") String name);
} //end of code
