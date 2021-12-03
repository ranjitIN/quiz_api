package com.ranjit.quiz_api.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="quizes")
@EntityListeners(AuditingEntityListener.class)
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int quizId;
    @NotBlank
    private String quizName;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "question_fid" , referencedColumnName = "quizId")
    private List<Question> questions;
      
    public Quiz() {
    }
    public Quiz(@NotBlank String quizName, List<Question> questions) {
        this.quizName = quizName;
        this.questions = questions;
    }
    public Quiz(int quizId, @NotBlank String quizName, List<Question> questions) {
        this.quizId = quizId;
        this.quizName = quizName;
        this.questions = questions;
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
        return questions;
    }
    public void setQuestion(List<Question> questions) {
        this.questions = questions;
    }

}
