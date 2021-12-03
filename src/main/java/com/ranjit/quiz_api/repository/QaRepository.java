package com.ranjit.quiz_api.repository;

import java.util.List;

import com.ranjit.quiz_api.model.QuizAttended;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface QaRepository extends JpaRepository<QuizAttended,String>{
    @Query(value="SELECT * FROM quiz_attended WHERE user_f_id=?1", nativeQuery = true)
    List<QuizAttended> findQuizAttedndedByUser(String userId);
}
