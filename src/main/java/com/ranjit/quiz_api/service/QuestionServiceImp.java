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
    
}
