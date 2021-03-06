package com.ranjit.quiz_api.controller;

import java.util.List;

import javax.validation.Valid;

import com.ranjit.quiz_api.model.User;
import com.ranjit.quiz_api.service.UserService;

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
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getAllNotes() {
    return userService.findAllUsers();
    }

    @PostMapping("/register")
    public User registeraUser(@Valid @RequestBody User newuser)
    {
        return userService.registeraUser(newuser);
    }

    @GetMapping("/user/{userId}")
    public User getuserbyUserId(@PathVariable(value="userId") String userId)
    {
        return userService.getUserbyUserId(userId);
    }

    @PutMapping("user/{userId}")
    public User updateUser(@PathVariable(value="userId")String userId,@Valid @RequestBody User updateUser)
    {
        User user = userService.getUserbyUserId(userId);
        user.setUserId(updateUser.getUserId());
        user.setUserName(updateUser.getUserName());
        user.setQuizattended(updateUser.getQuizattended());
        return userService.updateUser(user);
    }

    @DeleteMapping("user/{userId}")
    public String deleteUser(@PathVariable(value="userId")String userId)
    {
        return userService.deleteaUserById(userId);
    }
}
