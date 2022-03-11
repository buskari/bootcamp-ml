/*
* CATEGORIAS
*   circuito pequeno: 2 km
*   circuito medio: 5 km
*   circuito avançado: 10 km
*
* DADOS PARA INSCRICAO
*   rg
*   nome
*   sobrenome
*   idade
*   celular
*   numero emergencia
*   tipo sanguineo
*   atribui-se um numero de participante
*
* CALCULO DE VALORES
*   inscricao circuito pequeno:
*       menores de 18: 1300
*       maiores de 18: 1500
*   inscricao circuito medio:
*       menores de 18: 2000
*       maiores de 18: 2300
*   inscricao circuito avancado:
*       menores de 18: nao permitida
*       maiores de 18: 2800
*
* OBJETIVOS
*   1) inscrever participante em uma categoria
*   2) mostrar na tela todos os cadastros em uma determinada categoria com:
*           dados
*           numero de registro
*   3) cancelar uma inscricao
*   4) determinar o valor da inscricao
* */

import java.util.*;

public class Main {
    public static void createSubscription(
            Scanner scanner,
            HashMap<String, String> participante,
            ArrayList<HashMap<String, String>> inscricoes,
            ArrayList<Integer> inscricoesCircuitoPequeno,
            ArrayList<Integer> inscricoesCircuitoMedio,
            ArrayList<Integer> inscricoesCircuitoAvancado,
            int index
    ) {
        participante.put("rg", "");
        participante.put("nome", "");
        participante.put("sobrenome", "");
        participante.put("idade", "");
        participante.put("celular", "");
        participante.put("contatoEmergencia", "");
        participante.put("tipoSanguineo", "");

        for (String key : participante.keySet()) {
            System.out.print("Entre com " + key + ": ");
            participante.put(key, scanner.next());
        }

        inscricoes.add(participante);
        index = inscricoes.indexOf(inscricoes.get(inscricoes.size() - 1));
        boolean isAdult = Integer.parseInt(participante.get("idade")) >= 18;

        chooseCategorie(
                scanner,
                inscricoesCircuitoPequeno,
                inscricoesCircuitoMedio,
                inscricoesCircuitoAvancado,
                index,
                isAdult
        );
    }

    public static void chooseCategorie(
            Scanner scanner,
            ArrayList<Integer> inscricoesCircuitoPequeno,
            ArrayList<Integer> inscricoesCircuitoMedio,
            ArrayList<Integer> inscricoesCircuitoAvancado,
            int index,
            boolean isAdult
    ) {
        System.out.println();
        System.out.println("1 - Circuito pequeno");
        System.out.println("2 - Circuito medio");
        System.out.println("3 - Circuito avançado");
        System.out.println();
        System.out.print("Escolha uma categoria: ");
        String categoria = scanner.next();

        switch (categoria) {
            case "pequeno":
                inscricoesCircuitoPequeno.add(index);
                break;
            case "medio":
                inscricoesCircuitoMedio.add(index);
                break;
            case "avancado":
                if (isAdult) {
                    inscricoesCircuitoAvancado.add(index);
                } else {
                    System.out.println("Deve ter 18 ou mais para participar deste circuito.");
                }
                break;
        }

    }

    public static void main(String[] args) {
        HashMap<String, String> participante = new HashMap<String, String>();
        ArrayList<HashMap<String, String>> inscricoes = new ArrayList<HashMap<String, String>>();
        ArrayList<Integer> inscricoesCircuitoPequeno = new ArrayList<Integer>();
        ArrayList<Integer> inscricoesCircuitoMedio = new ArrayList<Integer>();
        ArrayList<Integer> inscricoesCircuitoAvancado = new ArrayList<Integer>();
        int index = 0;
        int answer;
        int option;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("1 - Inscrever participante");
            System.out.println("2 - Mostrar cadastros de acordo com a categoria");
            System.out.println("3 - Cancelar uma inscricao");
            System.out.println("4 - Determinar o valor de uma inscricao");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    do {
                        createSubscription(
                                scanner,
                                participante,
                                inscricoes,
                                inscricoesCircuitoPequeno,
                                inscricoesCircuitoMedio,
                                inscricoesCircuitoAvancado,
                                index
                        );
                        index++;
                        System.out.print("\nDeseja realizar outro cadastro? (0 - Nao, 1 - Sim)");
                        answer = scanner.nextInt();
                    } while(answer == 1);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Digite uma opção válida");
            }
        } while (option != 0);
    }
}
