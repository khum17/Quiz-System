
package com.quizsystem.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.quizsystem.model.Question;
import com.quizsystem.service.QuestionService;

@RestController
@RequestMapping("/api/questions")
public class QuizController {

    private final QuestionService questionService;

    public QuizController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping
    public List<Question> getQuestions() {
        return questionService.getAllQuestions();
    }

    @PostMapping
    public Question addQuestion(@RequestBody Question question) {
        return questionService.addQuestion(question);
    }
}
