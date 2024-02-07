package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.User;
import com.example.demo.repository.UserRepoistory;

@Service
public class UserService implements IUserService{

    @Autowired
    UserRepoistory userRepoistory;
    
    @Override
    public void saveUser(User user) {
       
        userRepoistory.save(user);
    }


    
    
}
