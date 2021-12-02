package com.ranjit.quiz_api.service;

import java.util.List;

import com.ranjit.quiz_api.model.QuizAttended;

public interface QuizAttendService {
    List<QuizAttended> findAllQuizesAttendByUsers();
    QuizAttended QuizAttendedByUser(QuizAttended quizattended);
}
