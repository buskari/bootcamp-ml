package br.com.meli.StarWarsCharacters.repository;

import java.util.List;

public interface Crud<T> {
    void create(List<T> type);
    void create(T type);
    List<T> read();
}
