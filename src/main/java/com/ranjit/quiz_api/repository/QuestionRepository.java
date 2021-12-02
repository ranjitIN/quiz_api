package com.ranjit.quiz_api.repository;

import com.ranjit.quiz_api.model.Question;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface QuestionRepository extends JpaRepository<Question,String> {
    
}
