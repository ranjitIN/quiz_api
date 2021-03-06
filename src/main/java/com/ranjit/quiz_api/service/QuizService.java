package com.ranjit.quiz_api.service;

import java.util.List;

import com.ranjit.quiz_api.model.Quiz;

public interface QuizService {
    List<Quiz> findAllQuizes();
    Quiz createaQuiz(Quiz newquiz);
    Quiz updateQuizById(Quiz updateQuiz);
    Quiz findQuizByQuizId(int quizId);
    String deleteQuizById(int quizId);
}
