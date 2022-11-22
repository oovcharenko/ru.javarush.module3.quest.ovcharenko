package ru.javarush.quest.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Answer {
    private final long id;
    private final String text;
    private final Question question;

    public Answer(long id, String text, Question question) {
        this.id = id;
        this.text = text;
        this.question = question;
    }
}
