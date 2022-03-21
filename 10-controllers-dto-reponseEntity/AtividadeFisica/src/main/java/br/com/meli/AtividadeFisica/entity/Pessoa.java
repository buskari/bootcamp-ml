package br.com.meli.AtividadeFisica.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pessoa {

    private String nome;
    private String sobrenome;
    private int idade;
}
