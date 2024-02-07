package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.Question;
import com.example.demo.dao.User;
import com.example.demo.dao.UserAnswer;
import com.example.demo.repository.QuestionRepository;
import com.example.demo.repository.UserAnswerRepository;
import com.example.demo.repository.UserRepoistory;
import com.example.demo.service.IUserService;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController("/user")
public class UserController {
    
        
    @Autowired
    private IUserService iUserService;


    @PostMapping("/insert")
    public void posttUser(@RequestBody User user) {
    iUserService.saveUser(user);
}

   

}
