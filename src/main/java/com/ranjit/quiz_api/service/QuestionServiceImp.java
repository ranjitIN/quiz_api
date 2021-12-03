package com.ranjit.quiz_api.service;

import java.util.List;

import com.ranjit.quiz_api.model.Question;
import com.ranjit.quiz_api.repository.QuestionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class QuestionServiceImp implements QuestionService {

    @Autowired
    QuestionRepository questionrepo;

    @Override
    public List<Question> findAllQuestion() {
        // TODO Auto-generated method stub
        return questionrepo.findAll();
    }

    @Override
    public Question createaQuestion(Question question) {
        // TODO Auto-generated method stub
        return questionrepo.save(question);
    }

    @Override
    public void deleteQuestion(int qid) {
        // TODO Auto-generated method stub
        questionrepo.deleteById(qid);
    }

    @Override
    public Question updateQuestion(Question udateQuestion) {
        // TODO Auto-generated method stub
        return questionrepo.save(udateQuestion);
    }

    @Override
    public Question findQuestionById(int qid) {
        // TODO Auto-generated method stub
        return questionrepo.findById(qid).orElse(null);
    }

    @Override
    public String deleteQuestionById(int qid) {
        // TODO Auto-generated method stub
        questionrepo.deleteById(qid); //deleting the question
        return "Question Deleted Successfully";
    }
    
}
