package com.ranjit.quiz_api.service;

import java.util.List;

import com.ranjit.quiz_api.model.Quiz;
import com.ranjit.quiz_api.repository.QuizRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class QuizServiceImp implements QuizService{

    @Autowired
    QuizRepository quizrepo;

    @Override
    public List<Quiz> findAllQuizes() {
        // TODO Auto-generated method stub
        return quizrepo.findAll();
    }

    @Override
    public Quiz createaQuiz(Quiz newquiz) {
        // TODO Auto-generated method stub
        return quizrepo.save(newquiz);
    }

    @Override
    public Quiz updateQuizById(Quiz updateQuiz) {
        // TODO Auto-generated method stub
        return quizrepo.save(updateQuiz);
    }

    @Override
    public Quiz findQuizByQuizId(int quizId) {
        // TODO Auto-generated method stub
        return quizrepo.findById(quizId).orElse(null);
    }

    @Override
    public String deleteQuizById(int quizId) {
        // TODO Auto-generated method stub
        quizrepo.deleteById(quizId);

        return "Quiz Deleted Sucessfully";
    }
    
}
