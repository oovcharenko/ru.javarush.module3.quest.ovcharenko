package ru.javarush.quest.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Question {
    private final long id;
    private final String text;

    public Question(long id, String text) {
        this.id = id;
        this.text = text;
    }
}
