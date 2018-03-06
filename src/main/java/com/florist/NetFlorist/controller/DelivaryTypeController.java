package com.florist.NetFlorist.controller;

import com.florist.NetFlorist.exceptions.DataNotFoundException;
import com.florist.NetFlorist.services.DelivaryTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Katlego Mafafo
 */

@Controller
@RequestMapping(value = "/delivaryType")
public class DelivaryTypeController {
    
    @Autowired
    private DelivaryTypeService deliveryTypeService;
    
     //Get dilivery type
    @RequestMapping(value="/findAllDelivaryTypes", method = RequestMethod.GET)
    @ResponseBody
    public Object findAllDeliveryTypes()
    {
        Object object = deliveryTypeService.findAllDeliveryTypes();
        if(object == null)
        {
            throw new DataNotFoundException("Address Types doesn't exit in the database...");
        }  
        return object;
    }  
} //end of code
