package com.mynd.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mynd.userservice.model.User;

@Repository
public interface UserServiceRepository extends JpaRepository<User, Integer>{


}
