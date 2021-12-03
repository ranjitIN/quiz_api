package com.ranjit.quiz_api.service;

import java.util.List;

import com.ranjit.quiz_api.model.User;
import com.ranjit.quiz_api.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserRepository userrepo;
    @Override
    public List<User> findAllUsers() {
        // TODO Auto-generated method stub
        return userrepo.findAll();
    }

    @Override
    public User registeraUser(User newuser) {
        // TODO Auto-generated method stub
        return userrepo.save(newuser);
    }

    @Override
    public User getUserbyUserId(String userId) {
        // TODO Auto-generated method stub
        return userrepo.findById(userId).orElse(null);
    }

    @Override
    public User updateUser(User updateUser) {
        // TODO Auto-generated method stub
        return userrepo.save(updateUser);
    }

    @Override
    public void deleteaUser(String userId) {
        // TODO Auto-generated method stub
        userrepo.deleteById(userId);
    }
        
}
