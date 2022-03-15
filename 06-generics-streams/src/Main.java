import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> listaVeiculos = Arrays.asList(
                new Veiculo("Ford", "Fiesta", BigDecimal.valueOf(1000)),
                new Veiculo("Ford", "Fiesta", BigDecimal.valueOf(1200)),
                new Veiculo("Ford", "Explorer", BigDecimal.valueOf(2500)),
                new Veiculo("Fiat", "Uno", BigDecimal.valueOf(500)),
                new Veiculo("Fiat", "Cronos", BigDecimal.valueOf(1000)),
                new Veiculo("Fiat", "Torino", BigDecimal.valueOf(1250)),
                    new Veiculo("Chevrolet", "Aveo", BigDecimal.valueOf(1250)),
                    new Veiculo("Chevrolet", "Spin", BigDecimal.valueOf(2500)),
                    new Veiculo("Toyota", "Corola", BigDecimal.valueOf(1200)),
                    new Veiculo("Toyota", "Fortuner", BigDecimal.valueOf(3000)),
                    new Veiculo("Renault", "Logan", BigDecimal.valueOf(950))
            );

        Garagem garagem = new Garagem(1, listaVeiculos);

        System.out.println("-----------------------------------------------");
        // este metodo de comparacao NAO altera a lista original
        listaVeiculos
                .stream()
                .sorted((v1, v2) -> v1.getPreco().compareTo(v2.getPreco()))
                .forEach(System.out::println);

        System.out.println("-----------------------------------------------");
        // este metodo de comparacao ALTERA a lista original
        listaVeiculos
                .stream()
                .sorted(Comparator.comparing(Veiculo::getMarca))
                .forEach(System.out::println);


        System.out.println("-----------------------------------------------");
        listaVeiculos
                .stream()
                .filter(veiculo -> veiculo.getPreco().intValue() > 1000)
                .forEach(System.out::println);

        System.out.println("-----------------------------------------------");
        listaVeiculos
                    .stream()
                    .filter(veiculo -> veiculo.getPreco().intValue() <= 1000)
                .forEach(System.out::println);

        List<BigDecimal> priceList = listaVeiculos.stream().map(Veiculo::getPreco).collect(Collectors.toList());

        BigDecimal avgPrice = priceList
                .stream()
                .reduce(BigDecimal.ZERO, BigDecimal::add);


        System.out.println("-----------------------------------------------");
        System.out.println(avgPrice.divide(BigDecimal.valueOf(listaVeiculos.size()), 2, RoundingMode.UP));
    }
}
