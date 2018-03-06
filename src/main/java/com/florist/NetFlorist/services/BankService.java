package com.florist.NetFlorist.services;

import com.florist.NetFlorist.model.Bank;
import com.florist.NetFlorist.repositories.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Katlego Mafafo
 */

@Service
public class BankService{
    
    @Autowired
    private BankRepository bankRepository;
    
    //gets bank account details
    public Bank findBankAccount(int cardNo, String cardHolder, String bankName)
    {
        return bankRepository.findBankAccount(cardNo, cardHolder, bankName);
    }
    //updates Bank Balance
    public int updateBankBalance(int cardNo, double balance)
    {
        return bankRepository.updateBankBalance(cardNo, balance);
    }
} // end of code
