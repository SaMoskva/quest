package ru.javarush.november.moksvitina.quest.quest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Quest implements Entity{
    private Long id;
    private String name;
    private String text;
    private Long firstQuestionId;
    private final Collection<Question> questions = new ArrayList<>();
}
