package com.ranjit.quiz_api.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "quiz_attended")
@EntityListeners(AuditingEntityListener.class)
public class QuizAttended {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int qaId;
    
    @NotBlank
    private String quizId;

    @NotBlank
    private String markSecured;

    public QuizAttended() {
    }

    public QuizAttended(@NotBlank String quizId, @NotBlank String markSecured) {
        this.quizId = quizId;
        this.markSecured = markSecured;
    }

    public QuizAttended(int qaId, @NotBlank String quizId, @NotBlank String markSecured) {
        this.qaId = qaId;
        this.quizId = quizId;
        this.markSecured = markSecured;
    }

    public int getQaId() {
        return qaId;
    }

    public void setQaId(int qaId) {
        this.qaId = qaId;
    }

    public String getQuizId() {
        return quizId;
    }

    public void setQuizId(String quizId) {
        this.quizId = quizId;
    }

    public String getMarkSecured() {
        return markSecured;
    }

    public void setMarkSecured(String markSecured) {
        this.markSecured = markSecured;
    }

   
}
