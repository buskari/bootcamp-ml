package br.com.meli.StarWarsCharacters.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
}
