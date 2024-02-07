package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Question;
import com.example.demo.dao.UserAnswer;
import com.example.demo.repository.QuestionRepository;
import com.example.demo.repository.UserAnswerRepository;

@Service
public class QuestionService implements IQuestionService {

    @Autowired
    private UserAnswerRepository userAnswerRepository;

    @Autowired
    private QuestionRepository questionRepository;
    
    @Override
    public void addAnswer(UserAnswer userAnswer) {
        userAnswerRepository.save(userAnswer);
     
    }

    @Override
    public void addQuestion(Question question) {
        questionRepository.save(question); 
    }

    @Override
    public List<UserAnswer> getUserAnswers(String email) {
      return userAnswerRepository.findByUserAnswerIdUserEmail(email);
    }

    @Override
    public List<UserAnswer> getUserTrueAnswer(String email) {
         List<UserAnswer> answers = userAnswerRepository.findByUserAnswerIdUserEmail(email);
         List<UserAnswer> correctAnswer =   answers.stream().filter(a -> a.getAbility() ==1).collect(Collectors.toList());
         return correctAnswer;
    }

   
    
}
