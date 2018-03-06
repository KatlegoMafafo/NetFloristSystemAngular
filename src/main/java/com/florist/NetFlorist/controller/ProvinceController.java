package com.florist.NetFlorist.controller;

import com.florist.NetFlorist.exceptions.DataNotFoundException;
import com.florist.NetFlorist.services.ProvinceService;
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
@RequestMapping(value = "/province")
public class ProvinceController {
    
    @Autowired
    private ProvinceService provinceService;
    
    //View Provinces
    @RequestMapping(value="/findAllProvinces", method = RequestMethod.GET)
    @ResponseBody
    public Object findAllProvinces()
    {
        Object object =  provinceService.findAllProvinces();
        
        if(object == null)
        {
            throw new DataNotFoundException("Provinces not found!");
        }
         return object;   
    }
} // end of code
