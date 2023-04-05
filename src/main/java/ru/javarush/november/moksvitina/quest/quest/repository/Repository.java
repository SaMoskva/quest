package ru.javarush.november.moksvitina.quest.quest.repository;

import java.util.Collection;
import java.util.stream.Stream;

public interface Repository<T> {
    Collection<T> getAll();
    Stream<T> find(T pattern);
    T get(Long id);
    void create(T entity);

    void update(T entity);

    void delete(T entity);
}
