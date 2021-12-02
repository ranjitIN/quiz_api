package com.ranjit.quiz_api.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
public class User {
    @Id
    private String userId;
    @NotBlank
    private String userName;
    @NotBlank
    private String userPassword;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="user_fId",referencedColumnName = "userid")
    private List<QuizAttended> quizattended = new ArrayList<QuizAttended>();

    public User() {
    }
    
    public User(String userId, @NotBlank String userName, @NotBlank String userPassword,
            List<QuizAttended> quizattended) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.quizattended = quizattended;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public List<QuizAttended> getQuizattended() {
        return quizattended;
    }

    public void setQuizattended(List<QuizAttended> quizattended) {
        this.quizattended = quizattended;
    }

    
}
