package com.florist.NetFlorist.services;

import com.florist.NetFlorist.repositories.BankNamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Katlego Mafafo
 */

@Service
public class BankNamesService{
   
    @Autowired
    private BankNamesRepository bankNameRepository;
    
    public Object findAllBankNames()
    {
        return bankNameRepository.findAll();
    }
} // end of code
