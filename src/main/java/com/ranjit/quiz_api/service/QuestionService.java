package com.ranjit.quiz_api.service;

import java.util.List;

import com.ranjit.quiz_api.model.Question;

public interface QuestionService {

    List<Question> findAllQuestion();
    Question createaQuestion(Question question);
    void deleteQuestion(int qid);
    Question findQuestionById(int qid);
    Question updateQuestion(Question udateQuestion);
    String deleteQuestionById(int qid);
}
