package com.pranav.quiz_service.dao;
import com.pranav.quiz_service.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDoa extends JpaRepository<Quiz,Integer> {
}
