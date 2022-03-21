package br.com.meli.StarWarsCharacters.repository;

import br.com.meli.StarWarsCharacters.entity.Character;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
@Data
public class CreateCharacter {
    private static ArrayList<Character> characterList = new ArrayList<>();

    public static void save(ArrayList<Character> characters) {
        characterList = characters;
    }

    public static void save(Character character) {
        characterList.add(character);
    }
}
