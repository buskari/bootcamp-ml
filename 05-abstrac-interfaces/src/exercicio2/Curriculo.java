package exercicio2;

public class Curriculo extends Document {
    private DadosPessoais dadosPessoais;
    private ListaHabilidades habilidades;

    public Curriculo(DadosPessoais dadosPessoais, ListaHabilidades habilidades) {
        super(DocType.CURRICULO);
        this.dadosPessoais = dadosPessoais;
        this.habilidades = habilidades;
    }
}
