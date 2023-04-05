package ru.javarush.november.moksvitina.quest.quest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User implements Entity{
    private Long id;
    private String login;
    private String password;
    private Role role;
    public String getImage() { //TODO move to DTO
        return "user-" + id;
    }
}
