package com.florist.NetFlorist.services;

import com.florist.NetFlorist.repositories.OrderStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Katlego Mafafo
 */
@Service
public class OrderStatusService {
    
    @Autowired
    private OrderStatusRepository orderStatusRepository;
    
    public Object findAllOrderStatus()
    {
        return orderStatusRepository.findAll();
    }  
} // end of code
