package br.com.meli.StarWarsCharacters.repository;

import br.com.meli.StarWarsCharacters.entity.Character;
import ch.qos.logback.core.UnsynchronizedAppenderBase;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CharacterRepository implements Crud<Character> {
    private List<Character> characterList = new ArrayList<>();

    public void create(List<Character> characters) {
        characterList = characters;
    }

    public void create(Character character) { characterList.add(character); }

    public List<Character> read() {
        return  characterList;
    }
}
