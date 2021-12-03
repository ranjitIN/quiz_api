package com.ranjit.quiz_api.service;

import java.util.List;

import com.ranjit.quiz_api.model.User;

public interface UserService {
    List<User> findAllUsers();
    User registeraUser(User newuser);
    User getUserbyUserId(String userId);
    User updateUser(User updateUser);
    void deleteaUser(String userId);
}
