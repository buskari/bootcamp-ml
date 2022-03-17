package br.com.meli.morsecode.controller;

import br.com.meli.morsecode.service.GFG;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/morseCodeTranslator")
    @ResponseBody
    public String morseCodeTranslator(@RequestParam String morseCode) {
        
        return GFG.englishToMorse(morseCode);
    }
}
