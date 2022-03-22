package br.com.meli.StarWarsCharacters.service;

import br.com.meli.StarWarsCharacters.repository.CharacterRepository;
import br.com.meli.StarWarsCharacters.entity.Character;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CharacterService {
    static CharacterRepository characterRepository = new CharacterRepository();

    public static void save(ArrayList<Character> character) {
        characterRepository.create(character);
    }

    public static List<Character> getCharacterList() {
        return characterRepository.read();
    }
}
