package com.ranjit.quiz_api.repository;

import com.ranjit.quiz_api.model.Quiz;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends JpaRepository<Quiz,Integer>{
    
}
