package com.ranjit.quiz_api.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="quizes")
@EntityListeners(AuditingEntityListener.class)
public class Quiz {
    @Id
    private int quizId;
    @NotBlank
    private String quizName;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "question_fid" , referencedColumnName = "quizId")
    private List<Question> question = new ArrayList<Question>();
    
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "quiz")
    private QuizAttended quizAttended;
   
   
    public Quiz() {
    }
    public Quiz(@NotBlank String quizName, List<Question> question) {
        this.quizName = quizName;
        this.question = question;
    }
    public Quiz(int quizId, @NotBlank String quizName, List<Question> question) {
        this.quizId = quizId;
        this.quizName = quizName;
        this.question = question;
    }
    public int getQuizId() {
        return quizId;
    }
    public void setQuizId(int quizId) {
        this.quizId = quizId;
    }
    public String getQuizName() {
        return quizName;
    }
    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }
    public List<Question> getQuestion() {
        return question;
    }
    public void setQuestion(List<Question> question) {
        this.question = question;
    }

}
