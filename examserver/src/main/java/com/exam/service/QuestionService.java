package com.exam.service;

import com.exam.entities.exam.Question;
import com.exam.entities.exam.Quiz;

import java.util.Set;

public interface QuestionService {

    public Question addQuestion(Question question);
    public Question updateQuestion(Question question);
    public Set<Question> getQuestions();
    public Question getQuestion(Long questionId);
    public Set<Question> getQuestionsOfQuiz(Quiz quiz);

    public void deleteQuestion(Long questionId);

//    public Question getQuestions(Long questionsId);
}
