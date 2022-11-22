package ru.javarush.quest.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Quest {
    private final long id;
    private final String text;
    private final List<Question> questionList;

    public Quest(long id, String text, List<Question> questionList) {
        this.id = id;
        this.text = text;
        this.questionList = questionList;
    }
}
