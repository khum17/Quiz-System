
package com.quizsystem.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.quizsystem.model.Question;
import com.quizsystem.repository.QuestionRepository;
import com.quizsystem.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepository questionRepo;

    public QuestionServiceImpl(QuestionRepository questionRepo) {
        this.questionRepo = questionRepo;
    }

    public List<Question> getAllQuestions() {
        return questionRepo.findAll();
    }

    public Question addQuestion(Question question) {
        return questionRepo.save(question);
    }
}
