package com.florist.NetFlorist.services;

import com.florist.NetFlorist.model.Category;
import com.florist.NetFlorist.repositories.CatagoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Katlego Mafafo
 */
@Service
public class CategoryService{
    
    @Autowired
    private CatagoryRepository categoryRepository;
    
    public int deleteCategory(String name)
    {
        return categoryRepository.deleteCategory(name);
    }
    public Object findAllCategories()
    {
        return categoryRepository.findAll();
    }
    public Category saveCategory(Category category)
    {
        return categoryRepository.save(category);
    }
} // end of code
