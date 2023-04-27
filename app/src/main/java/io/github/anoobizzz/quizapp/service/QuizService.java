package io.github.anoobizzz.quizapp.service;

import io.github.anoobizzz.quizapp.domain.Quiz;
import io.github.anoobizzz.quizapp.repository.QuizRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class QuizService {
    private final QuizRepository repository;

    public Quiz getQuizByTitle(final String title) {
        try {
            return repository.findByTitle(title);
        } catch (final Exception e) {
            log.error("Failed to find quiz by title", e);
            throw new RuntimeException("Error", e);
        }
    }

    public void createQuiz(final Quiz quiz) {
        try {
            repository.save(quiz);
        } catch (final Exception e) {
            log.error("Failed to save quiz", e);
            throw new RuntimeException("Error", e);
        }
    }
}
