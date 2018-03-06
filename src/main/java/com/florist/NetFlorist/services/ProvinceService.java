package com.florist.NetFlorist.services;

import com.florist.NetFlorist.repositories.ProvinceRepositiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Katlego Mafafo
 */
@Service
public class ProvinceService{
    @Autowired
    private ProvinceRepositiory provinceRepository;
    public Object findAllProvinces()
    {
        return provinceRepository.findAll();
    }    
} // end of code
