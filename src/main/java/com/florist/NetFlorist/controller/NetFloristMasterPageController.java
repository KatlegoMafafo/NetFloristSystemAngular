package com.florist.NetFlorist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Katlego Mafafo
 */

@Controller
public class NetFloristMasterPageController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homePage()
    {
        return "home";
    }
    
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerPage()
    {
        return "register";
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage()
    {
        return "login";
    }
    
    @RequestMapping(value = "/forgotPassword", method = RequestMethod.GET)
    public String forgotPassword()
    {
        return "forgotPassword";
    }
    
    @RequestMapping(value = "/newPassword", method = RequestMethod.GET)
    public String newPassword()
    {
        return "newPassword";
    }
    
    @RequestMapping(value = "/adminHomePage", method = RequestMethod.GET)
    public String adminPage()
    {
        return "adminHomePage";
    }
    
    @RequestMapping(value = "/SupplierHomePage", method = RequestMethod.GET)
    public String SupplierPage()
    {
        return "SupplierHomePage";
    }
    
    @RequestMapping(value = "/addCategory", method = RequestMethod.GET)
    public String addCategory()
    {
        return "addCategory";
    }
    
    @RequestMapping(value = "/addProduct", method = RequestMethod.GET)
    public String addProduct()
    {
        return "addProduct";
    }
    
    @RequestMapping(value = "/updateProduct", method = RequestMethod.GET)
    public String updateProduct()
    {
        return "updateProduct";
    }
    
    @RequestMapping(value = "/registerAdmin", method = RequestMethod.GET)
    public String registerAdmin()
    {
        return "registerAdmin";
    }
    
    @RequestMapping(value = "/viewOrders", method = RequestMethod.GET)
    public String viewOrders()
    {
        return "viewOrders";
    }
    
    //Customer Pages
    @RequestMapping(value = "/customerHomePage", method = RequestMethod.GET)
    public String customerHomePage()
    {
        return "customerHomePage";
    }
    
    @RequestMapping(value = "/customerOrders", method = RequestMethod.GET)
    public String customerOrders()
    {
        return "customerOrders";
    }
} //end of code
