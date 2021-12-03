package com.ranjit.quiz_api.controller;

import java.util.List;

import javax.validation.Valid;

import com.ranjit.quiz_api.model.Question;
import com.ranjit.quiz_api.service.QuestionService;

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

    @GetMapping("question/{qid}")
    public Question getQuestionById(@PathVariable(value="qid") int qid)
    {
        return questionService.findQuestionById(qid);
    }

    @PutMapping("question/{qid}")
    public Question updatQuestion(@PathVariable(value="qid") int qid,@Valid @RequestBody Question updatequestion)
    {
        Question question = questionService.findQuestionById(qid);
            question.setQuestion(updatequestion.getQuestion());
            question.setOption1(updatequestion.getOption1());
            question.setOption2(updatequestion.getOption2());
            question.setOption3(updatequestion.getOption3());
            question.setOption4(updatequestion.getOption4());
            question.setCorrectAns(updatequestion.getCorrectAns());
            return questionService.updateQuestion(question);
    }

    @DeleteMapping("question/{qid}")
    public String deleteQuestion(@PathVariable(value="qid") int qid)
    {
        return questionService.deleteQuestionById(qid);
    }
}
