package com.Assignment2.Eventease.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Assignment2.Eventease.entity.User;

public interface UserRepository
extends JpaRepository<User,Long>{

}