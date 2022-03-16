import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Veiculo {
    private int velocidade;
    private int aceleracao;
    private int angulaGiro;
    private String placa;
    private int peso;
    private int rodas;

    public Veiculo(int peso, int rodas) {
        this.peso = peso;
        this.rodas = rodas;
    }

    public double formulaCorrida() {
        return velocidade * 0.5 * aceleracao / (angulaGiro * (peso - rodas * 100));
    }
}
