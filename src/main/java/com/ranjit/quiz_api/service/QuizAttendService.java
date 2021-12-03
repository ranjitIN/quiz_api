package com.ranjit.quiz_api.service;

import java.util.List;

import com.ranjit.quiz_api.model.QuizAttended;

import org.springframework.data.jpa.repository.Query;

public interface QuizAttendService {
    List<QuizAttended> findAllQuizesAttendByUsers();
    QuizAttended QuizAttendedByUser(QuizAttended quizattended);
    List<QuizAttended> findQuizAttedndedByUser(String userId);
}
