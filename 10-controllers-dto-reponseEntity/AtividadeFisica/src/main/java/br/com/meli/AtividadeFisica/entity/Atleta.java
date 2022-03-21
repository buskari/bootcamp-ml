package br.com.meli.AtividadeFisica.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Atleta {

    private Pessoa pessoa;
    private Esporte esporte;
}
