package com.exam.repo;

import com.exam.entities.exam.Category;
import com.exam.entities.exam.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
    public List<Quiz> findByCategory(Category category);

    public List<Quiz> findByActive(Boolean b);
    public List<Quiz> findByCategoryAndActive(Category c, Boolean b);
}
