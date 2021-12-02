package com.ranjit.quiz_api.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
    
    @OneToOne(fetch = FetchType.LAZY, optional=false)
    @JoinColumn(name = "quiz_fId", nullable = false)
    private Quiz quiz;

    @NotBlank
    private String markSecured;

    public QuizAttended() {
    }

    public QuizAttended(Quiz quiz, @NotBlank String markSecured) {
        this.quiz = quiz;
        this.markSecured = markSecured;
    }

    public QuizAttended(int qaId, Quiz quiz, @NotBlank String markSecured) {
        this.qaId = qaId;
        this.quiz = quiz;
        this.markSecured = markSecured;
    }

    public int getQaId() {
        return qaId;
    }

    public void setQaId(int qaId) {
        this.qaId = qaId;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public String getMarkSecured() {
        return markSecured;
    }

    public void setMarkSecured(String markSecured) {
        this.markSecured = markSecured;
    }
}
