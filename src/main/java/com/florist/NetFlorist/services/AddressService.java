package com.florist.NetFlorist.services;

import com.florist.NetFlorist.model.Address;
import com.florist.NetFlorist.repositories.AddressRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Katlego Mafafo
 */

@Service
public class AddressService {
  
    @Autowired
    private AddressRepository addressRepository;
  
     public Address saveAddress(Address address)
    {
        return addressRepository.save(address);
    }  
    public ArrayList<Address> findAddressByOrderNo(int orderNo)
    {
        return addressRepository.findAddressByOrderNo(orderNo);
    } 
    public int deleteDelivary(int orderNo)
    {
        return addressRepository.deleteAddress(orderNo);
    }
} // end of code
