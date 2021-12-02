package com.ranjit.quiz_api.service;

import java.util.List;
import java.util.Optional;

import com.ranjit.quiz_api.model.User;

public interface UserService {
    List<User> findAllUsers();
    User registeraUser(User newuser);
    User getUserbyUserId(String userId);
}
