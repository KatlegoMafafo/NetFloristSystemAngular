package com.florist.NetFlorist.services;

import com.florist.NetFlorist.repositories.AddressTypesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Katlego Mafafo
 */

@Service
public class AddressTypesService {
    
    @Autowired
    private AddressTypesRepository addressTypeRepepository;
    
    public Object findAllAddressTypes()
    {
        return addressTypeRepepository.findAll();
    }
} // end of code
