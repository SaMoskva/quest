package ru.javarush.november.moksvitina.quest.quest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Question implements Entity{
    private Long id;

    private Long questId;

    private String text;

    private GameStatus gameState;

    private final Collection<Answer> answers = new ArrayList<>();

    public String getImage() {
        return "question-" + id;
    }
}
