import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Carro extends Veiculo {
    public Carro(
        int velocidade,
        int aceleracao,
        int anguloGiro,
        String placa
    ) {
        super(velocidade, aceleracao, anguloGiro, placa, 1000, 4);
    }
}
