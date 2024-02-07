package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dao.UserAnswer;
import com.example.demo.dao.UserAnswerId;

public interface UserAnswerRepository extends JpaRepository<UserAnswer,UserAnswerId> {
    

    List<UserAnswer> findByUserAnswerIdUserEmail(String email);
}
