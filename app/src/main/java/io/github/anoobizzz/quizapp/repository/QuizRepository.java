package io.github.anoobizzz.quizapp.repository;

import io.github.anoobizzz.quizapp.domain.Quiz;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface QuizRepository extends MongoRepository<Quiz, String> {

    @Query("{title:'?0'}")
    Quiz findByTitle(final String title);
}
