package com.example.demo.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.Question;
import com.example.demo.dao.UserAnswer;
import com.example.demo.service.IQuestionService;

@RestController("/question")
public class QuestionController {
    
    @Autowired
    private IQuestionService iQuestionService;

    @PostMapping("/addAnswer")
    public void postAnswer(@RequestBody UserAnswer answer){
        iQuestionService.addAnswer(answer);
    }   


    @PostMapping("/addQuestion")
    public void postQuestion(@RequestBody Question question){
        iQuestionService.addQuestion(question);
    }   


     @GetMapping("/answers/{email}")
    public List<UserAnswer> getAnswers(@PathVariable String email){
        return iQuestionService.getUserAnswers(email);
    }

      @GetMapping("/trueAnswers/{email}")
    public List<UserAnswer> getTrueAnswers(@PathVariable String email) {
        return iQuestionService.getUserTrueAnswer(email);
       
    }
}
