package exercicio2;

import java.time.LocalDate;

public class DadosPessoais {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String celular;
    private String email;

    public DadosPessoais(
            String nome,
            String cpf,
            LocalDate dataNascimento,
            String celular,
            String email
    ) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.celular = celular;
        this.email = email;
    }
}
