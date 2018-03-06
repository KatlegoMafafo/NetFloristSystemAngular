package com.florist.NetFlorist.services;

import com.florist.NetFlorist.repositories.DelivaryTypeRepository;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Katlego Mafafo
 */

@Service
public class DelivaryTypeService {
    
    @Autowired
    private DelivaryTypeRepository delivaryTypeRepepository;
    
    public Object findAllDeliveryTypes()
    {
        return delivaryTypeRepepository.findAll();
    }
} // end of code
