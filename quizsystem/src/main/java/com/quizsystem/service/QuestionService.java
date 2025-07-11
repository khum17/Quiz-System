
package com.quizsystem.service;

import java.util.List;
import com.quizsystem.model.Question;

public interface QuestionService {
    List<Question> getAllQuestions();
    Question addQuestion(Question question);
}
