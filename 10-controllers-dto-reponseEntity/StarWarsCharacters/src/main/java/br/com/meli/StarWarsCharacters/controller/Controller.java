package br.com.meli.StarWarsCharacters.controller;

import br.com.meli.StarWarsCharacters.controller.advice.CharacterNotFound;
import br.com.meli.StarWarsCharacters.dto.CharacterDTO;
import br.com.meli.StarWarsCharacters.entity.Character;
import br.com.meli.StarWarsCharacters.repository.CharacterRepository;
import br.com.meli.StarWarsCharacters.service.CharacterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class Controller {

    @PostMapping("/addCharacter")
    public ResponseEntity<String> saveCharacter(@RequestBody ArrayList<Character> characters) {
        CharacterService.save(characters);
        return new ResponseEntity<>("Characters saved successfully", HttpStatus.CREATED);
    }

    @GetMapping("/{charName}")
    public ResponseEntity<CharacterDTO> getCharacter(@PathVariable String charName) {
        Optional<Character> characterOptional = CharacterService.getCharacterList()
                .stream()
                .filter(
                        character1 -> character1.getName().contains(charName)
                ).findFirst();

        if (characterOptional.isPresent()) {
            Character character = characterOptional.get();
            return new ResponseEntity<>(CharacterDTO.convert(character), HttpStatus.OK);
        }

        throw new CharacterNotFound("Character not found!");
    }
}
