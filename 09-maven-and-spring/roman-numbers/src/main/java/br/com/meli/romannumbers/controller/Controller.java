package br.com.meli.romannumbers.controller;

import br.com.meli.romannumbers.service.DecimalToRoman;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    @ResponseBody
    public String decimalToRoman(@RequestParam int decimalNumber) {
        return DecimalToRoman.convertDecimalToRoman(decimalNumber);
    }


}
