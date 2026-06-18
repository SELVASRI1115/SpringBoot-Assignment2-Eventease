package com.Assignment2.Eventease.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Assignment2.Eventease.entity.User;
import com.Assignment2.Eventease.repository.UserRepository;
import com.Assignment2.Eventease.service.UserService;

@Service
public class UserServiceImpl
implements UserService{

    @Autowired
    private UserRepository userRepo;

    @Override
    public User createUser(User user){

        return userRepo.save(user);

    }

}