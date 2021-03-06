package com.florist.NetFlorist.services;

import com.florist.NetFlorist.model.Users;
import com.florist.NetFlorist.repositories.UsersRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author Katlego Mafafo
 */

@Service
public class UsersService {
    
    @Autowired
    private UsersRepository usersRepository;
    
    public Users saveUser(Users users)
    {
      PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(); 
      String hashedPassword = passwordEncoder.encode(users.getPassword());
      users.setPassword(hashedPassword);
      return usersRepository.save(users);
    }
    
    public Users findUserByUserId(int userId)
    {
        return usersRepository.findOne(userId);
    } 
    public void deleteUser(int userId)
    {
        usersRepository.delete(userId);
    }
    public Users userLogin(String email)
    {
        return usersRepository.login(email);
    }  
    public Users findUserByEmail(String email)
    {
        return usersRepository.forgotPassword(email);
    }
    
    //Updates password with BCrpterEncoder
    public int updatePassword(String password, String email)
    {  
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(); 
        String hashedPassword = passwordEncoder.encode(password);
        System.out.println("password: " + hashedPassword);
        return usersRepository.updatePassword(hashedPassword, email);
    }  
} // end of code
