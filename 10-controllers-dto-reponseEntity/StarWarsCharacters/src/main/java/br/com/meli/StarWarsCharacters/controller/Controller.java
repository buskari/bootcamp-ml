package br.com.meli.StarWarsCharacters.controller;

import br.com.meli.StarWarsCharacters.entity.Character;
import br.com.meli.StarWarsCharacters.repository.CreateCharacter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controller {

    @PostMapping("/addCharacter")
    public ResponseEntity<String> saveCharacter(@RequestBody ArrayList<Character> characters) {
        CreateCharacter.save(characters);
        return new ResponseEntity<>("Characters saved successfully", HttpStatus.CREATED);
    }
}
