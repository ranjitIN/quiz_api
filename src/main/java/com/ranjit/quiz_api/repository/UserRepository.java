package com.ranjit.quiz_api.repository;

import com.ranjit.quiz_api.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String>{
    
}
