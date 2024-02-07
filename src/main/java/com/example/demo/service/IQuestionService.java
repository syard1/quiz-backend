package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.Question;
import com.example.demo.dao.User;
import com.example.demo.dao.UserAnswer;

public interface IQuestionService {

   public void addAnswer(UserAnswer userAnswer);
   public void addQuestion(Question question);
   public List<UserAnswer> getUserAnswers(String email);
   public List<UserAnswer> getUserTrueAnswer(String email);
}
