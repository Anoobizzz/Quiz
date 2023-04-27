package io.github.anoobizzz.quizapp.controller;

import io.github.anoobizzz.quizapp.domain.Quiz;
import io.github.anoobizzz.quizapp.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
@RequiredArgsConstructor
public class QuizController {

    private final QuizService service;

    @GetMapping(value = "/quiz/{title}", produces = "application/json")
    public Quiz getQuiz(@PathVariable("title") final String title) {
        return service.getQuizByTitle(title);
    }

    @PostMapping(value = "/quiz", consumes = "application/json")
    public void postQuiz(@RequestBody final Quiz quiz) {
        service.createQuiz(quiz);
    }
}
