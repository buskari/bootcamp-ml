import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Client> clientes = new ArrayList<>();
        ArrayList<Item> itens = new ArrayList<>();
        String id;

        Client fulano = new Client("1001", "fulano", "da silva");
        Client ciclano = new Client("1002", "ciclano", "pereira");
        Client beltrano = new Client("1003", "beltrano", "gonçalves");

        itens.add(
                new Item("2000", "caderno", 1, BigDecimal.valueOf(29.90))
        );
        itens.add(
                new Item("2001", "caneta", 3, BigDecimal.valueOf(9.90))
        );
        itens.add(
                new Item("2002", "laptop", 1, BigDecimal.valueOf(3999.00))
        );
        itens.add(
                new Item("2003", "laptop", 1, BigDecimal.valueOf(3999.00))
        );
        itens.add(
                new Item("2004", "laptop", 1, BigDecimal.valueOf(3999.00))
        );

        Invoice fatura = new Invoice(fulano, itens);

        clientes.add(fulano);
        clientes.add(ciclano);
        clientes.add(beltrano);

        clientes.forEach(System.out::println);
        clientes.remove(fulano);
        System.out.println("-----------------------------------------------------");
        clientes.forEach(System.out::println);

        System.out.println("Entre com o ID do cliente: ");
        id = scanner.next();

        for (Client cliente : clientes) {
            if (cliente.getId().equals(id)) {
                System.out.println(cliente);
                return;
            }
        }

//        System.out.println("Não existe um cliente com este ID");

        System.out.println(fatura);
    }
}
