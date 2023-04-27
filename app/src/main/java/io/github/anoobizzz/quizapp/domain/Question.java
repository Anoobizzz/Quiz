package io.github.anoobizzz.quizapp.domain;

import lombok.Data;

import java.util.List;

@Data
public class Question {
    private List<String> options;
}
