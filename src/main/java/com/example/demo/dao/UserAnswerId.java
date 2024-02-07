package com.example.demo.dao;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

@Embeddable 
@Data
public class UserAnswerId {
    

   @ManyToOne
    @JoinColumn(name = "email")
    private User user;

   @ManyToOne
    @JoinColumn(name = "questionId")
    private Question question;
}
