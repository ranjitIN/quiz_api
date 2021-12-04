package com.ranjit.quiz_api.service;

import java.util.List;

import com.ranjit.quiz_api.model.QuizAttended;
import com.ranjit.quiz_api.repository.QaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class QuizAttendServiceImp implements QuizAttendService {
    @Autowired
    QaRepository qarepo;
    @Override
    public List<QuizAttended> findAllQuizesAttendByUsers() {
        // TODO Auto-generated method stub
        return qarepo.findAll();
    }

    @Override
    public QuizAttended QuizAttendedByUser(QuizAttended quizattended) {
        // TODO Auto-generated method stub
        return qarepo.save(quizattended);
    }

    @Override
    public List<QuizAttended> findQuizAttedndedByUser(String userId) {
        // TODO Auto-generated method stub
        return qarepo.findQuizAttedndedByUser(userId);
    }
    @Override
    public String deleteQuizAttendedById(int qaId)
    {
        qarepo.deleteById(qaId);
        return "Attendence deleted Sucessfully";
    }
}
