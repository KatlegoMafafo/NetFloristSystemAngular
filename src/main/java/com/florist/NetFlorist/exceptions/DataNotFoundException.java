package com.florist.NetFlorist.exceptions;


/**
 *
 * @author Katlego Mafafo
 */

public class DataNotFoundException extends RuntimeException{
   
    private static final long serialVersionUID = 1L;
    
    public DataNotFoundException(String message)
    {
        super(message);
    }
} // end of code
