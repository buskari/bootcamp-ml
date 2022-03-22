package br.com.meli.StarWarsCharacters.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import br.com.meli.StarWarsCharacters.entity.Character;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class CharacterDTO {
    private String name;
    private int height;
    private int mass;
    private String gender;
    private String homeworld;
    private String species;

    public static CharacterDTO convert(Character character) {
        return new CharacterDTO(
                character.getName(),
                character.getHeight(),
                character.getMass(),
                character.getGender(),
                character.getHomeworld(),
                character.getSpecies()
        );
    }
}
