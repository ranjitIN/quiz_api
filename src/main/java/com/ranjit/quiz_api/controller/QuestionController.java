package com.ranjit.quiz_api.controller;

import java.util.List;

import javax.validation.Valid;

import com.ranjit.quiz_api.model.Question;
import com.ranjit.quiz_api.service.QuestionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping("/questions")
    public List<Question> getAllQuestions()
    {
        return questionService.findAllQuestion();
    }

    @PostMapping("/addQuestion")
    public Question addaQuestion(@Valid @RequestBody Question question)
    {
        return questionService.createaQuestion(question);
    }

}
