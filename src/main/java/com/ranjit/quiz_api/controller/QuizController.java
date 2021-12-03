package com.ranjit.quiz_api.controller;

import java.util.List;

import javax.validation.Valid;

import com.ranjit.quiz_api.model.Quiz;
import com.ranjit.quiz_api.service.QuizService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class QuizController {
    @Autowired
    QuizService quizService;
    
    @GetMapping("/quizes")
    public List<Quiz> getAllQuizes()
    {
        return quizService.findAllQuizes();
    }

    @PostMapping("/createQuiz")
    public Quiz createaQuiz(@Valid @RequestBody Quiz newquiz)
    {
        return quizService.createaQuiz(newquiz);
    }
    @GetMapping("quiz/{quizId}")
    public Quiz getQuizById(@PathVariable(value = "quizId")int quizId)
    {
        return quizService.findQuizByQuizId(quizId);
    }

    @PutMapping("quiz/{quizId}")
    public Quiz updateQuiz(@PathVariable(value="quizId")int quizId,@Valid @RequestBody Quiz updateQuiz)
    {
        Quiz quiz = quizService.findQuizByQuizId(quizId);
        quiz.setQuizId(updateQuiz.getQuizId());
        quiz.setQuizName(updateQuiz.getQuizName());
        quiz.setQuestion(updateQuiz.getQuestion());
        return quizService.updateQuizById(quiz);
    }
    
    @DeleteMapping("quiz/{quizId}")
    public String deleteQuiz(@PathVariable(value="quizId")int quizId)
    {
        return quizService.deleteQuizById(quizId);
    }
}
