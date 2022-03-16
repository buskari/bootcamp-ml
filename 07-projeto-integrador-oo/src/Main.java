import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        String id;

        Cliente fulano = new Cliente("1001", "fulano", "da silva");
        Cliente ciclano = new Cliente("1002", "ciclano", "pereira");
        Cliente beltrano = new Cliente("1003", "beltrano", "gonçalves");

        listaClientes.add(fulano);
        listaClientes.add(ciclano);
        listaClientes.add(beltrano);

        listaClientes.forEach(System.out::println);
        listaClientes.remove(fulano);
        System.out.println("-----------------------------------------------------");
        listaClientes.forEach(System.out::println);

        System.out.println("Entre com o ID do cliente: ");
        id = scanner.next();

        for (Cliente cliente : listaClientes) {
            if (cliente.getId().equals(id)) {
                System.out.println(cliente);
                return;
            }
        }

        System.out.println("Não existe um cliente com este ID");
    }
}
