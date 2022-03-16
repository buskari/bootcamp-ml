import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.NoSuchElementException;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Corrida {
    private int distancia;
    private BigDecimal premiacao;
    private String nome;
    private int totalVeiculos;
    private ArrayList<Veiculo> veiculoList = new ArrayList();
    private SalvaVidasAuto salvaVidasAuto = new SalvaVidasAuto();
    private SalvaVidasMoto salvaVidasMoto = new SalvaVidasMoto();

    public void addCarro(int velocidade, int aceleracao, int anguloGiro, String placa) {
        veiculoList.add(new Carro(velocidade, aceleracao, anguloGiro, placa));
    }

    public void addMoto(int velocidade, int aceleracao, int anguloGiro, String placa) {
        veiculoList.add(new Motocicleta(velocidade, aceleracao, anguloGiro, placa));
    }

    public void deleteVeiculo(Veiculo veiculo) {
        veiculoList.remove(veiculo);
    }

    public void deleteVeiculoComPlaca(String placa) {
        veiculoList.removeIf(veiculo -> veiculo.getPlaca().equals(placa));
    }

    public Veiculo calculaVencedor() {
        return veiculoList
                .stream()
                .max(Comparator.comparing(Veiculo::formulaCorrida))
                .orElseThrow(NoSuchElementException::new);
    }

    public void socorrerAuto(String placa) {
        System.out.println("Carro resgatado " + placa);
    }

    public void socorrerMoto(String placa) {
        System.out.println("Moto resgatada " + placa);
    }
}
