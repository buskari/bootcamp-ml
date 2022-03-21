package br.com.meli.AtividadeFisica.controller;

import br.com.meli.AtividadeFisica.entity.Atleta;
import br.com.meli.AtividadeFisica.entity.Esporte;
import br.com.meli.AtividadeFisica.entity.Pessoa;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class Controller {

    private static ArrayList<Esporte> esportes = new ArrayList<>();
    private static ArrayList<Pessoa> pessoas = new ArrayList<>();
    private static ArrayList<Atleta> atletas = new ArrayList<>();
    public static ArrayList<DTO> dtoList = new ArrayList<>();

    static {
        esportes.addAll(Arrays.asList(
                new Esporte("Futebol", "Iniciante"),
                new Esporte("Natação", "Intermediário"),
                new Esporte("Jiu Jitsu", "Avançado")
        ));

        pessoas.addAll(Arrays.asList(
                new Pessoa("pessoa0", "sobrenome0",  30),
                new Pessoa("pessoa1", "sobrenome1",  31),
                new Pessoa("pessoa2", "sobrenome2",  32),
                new Pessoa("pessoa3", "sobrenome3",  33),
                new Pessoa("pessoa4", "sobrenome4",  34),
                new Pessoa("pessoa5", "sobrenome5",  35),
                new Pessoa("pessoa6", "sobrenome6",  36),
                new Pessoa("pessoa7", "sobrenome7",  37),
                new Pessoa("pessoa8", "sobrenome8",  38),
                new Pessoa("pessoa9", "sobrenome9",  39)
        ));

        atletas.addAll(Arrays.asList(
                new Atleta(
                        pessoas.get(0),
                        esportes.get(0)
                ),
                new Atleta(
                        pessoas.get(5),
                        esportes.get(1)
                ),
                new Atleta(
                        pessoas.get(8),
                        esportes.get(2)
                )
        ));

        for (Atleta atleta : atletas) {
            dtoList.add(
                    new DTO(
                            atleta.getPessoa().getNome(),
                            atleta.getPessoa().getSobrenome(),
                            atleta.getEsporte().getNome()
                    )
            );
        }
    }

    @GetMapping("/findSport")
    public ArrayList<Esporte> mostrarEsportes() {
        return esportes;
    }

    @GetMapping("/findSport/{nome}")
    public ResponseEntity<String> mostrarUmEsporte(@PathVariable String nome) {
        for (Esporte esporte : esportes) {
            if (esporte.getNome().equalsIgnoreCase(nome)) {
                return new ResponseEntity<>(esporte.getNome(), HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("Não existe um registro para este esporte!", HttpStatus.OK);
    }

    @GetMapping("/findSportPerson")
    public ResponseEntity<ArrayList<DTO>> mostrarAtletas() {
        return new ResponseEntity<>(dtoList, HttpStatus.OK);
     }

}
