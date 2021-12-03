package com.ranjit.quiz_api.controller;

import java.util.List;

import javax.validation.Valid;

import com.ranjit.quiz_api.model.QuizAttended;
import com.ranjit.quiz_api.service.QuizAttendService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class QuizAttendController {
    @Autowired
    QuizAttendService quizattendService;

    @GetMapping("/quizAttendedByAllUsers")
    public List<QuizAttended> getAllQuizAttended()
    {
        return quizattendService.findAllQuizesAttendByUsers();
    }

    // @PostMapping("/QuizAttendedByUser")
    // public QuizAttended quizattendedByUser(@Valid @RequestBody QuizAttended quizattended)
    // {
    //     return quizattendService.QuizAttendedByUser(quizattended);
    // }

    @PostMapping("/QuizAttended/{userId}")
    public List<QuizAttended> findquizesAttendedByUser(@PathVariable(value="userId") String userId)
    {
        return quizattendService.findQuizAttedndedByUser(userId);
    }
}
