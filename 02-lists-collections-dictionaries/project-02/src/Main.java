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
            int id
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
        boolean isAdult = Integer.parseInt(participante.get("idade")) >= 18;

        chooseCategory(
                scanner,
                inscricoesCircuitoPequeno,
                inscricoesCircuitoMedio,
                inscricoesCircuitoAvancado,
                id,
                isAdult
        );
    }

    public static void chooseCategory(
            Scanner scanner,
            ArrayList<Integer> inscricoesCircuitoPequeno,
            ArrayList<Integer> inscricoesCircuitoMedio,
            ArrayList<Integer> inscricoesCircuitoAvancado,
            int id,
            boolean isAdult
    ) {
        int categoria;

        do {
            System.out.println();
            System.out.println("1 - Circuito pequeno");
            System.out.println("2 - Circuito medio");
            System.out.println("3 - Circuito avançado");
            System.out.println();
            System.out.print("Escolha uma categoria: ");
            categoria = scanner.nextInt();

            switch (categoria) {
                case 1:
                    inscricoesCircuitoPequeno.add(id);
                    break;
                case 2:
                    inscricoesCircuitoMedio.add(id);
                    break;
                case 3:
                    if (isAdult) {
                        inscricoesCircuitoAvancado.add(id);
                    } else {
                        System.out.println("\n\nDeve ter 18 ou mais para participar deste circuito.");
                    }
                    break;
                default:
                    System.out.println("Entre com uma opção válida");
            }
        } while (!isAdult && categoria == 3);

    }

    public static void showSubscriptionsByCategory(
            ArrayList<Integer> circuito,
            ArrayList<HashMap<String, String>> inscricoes
    ) {
        int id;

        for (int i = 0; i < inscricoes.size(); i++) {
            id = i + 1;
            if (circuito.contains(id)) {
                System.out.println("ID: " + id);
                for (HashMap<String, String> participante : inscricoes) {
                    for (String key : participante.keySet()) {
                        String value = participante.get(key);
                        System.out.println(key + ": " + value);
                    }
                }
            }
        }
    }

    public static void cancelSubscription(
            ArrayList<Integer> circuito,
            ArrayList<HashMap<String, String>> inscricoes,
            int id
    ) {

    }

    public static void main(String[] args) {
        HashMap<String, String> participante = new HashMap<String, String>();
        ArrayList<HashMap<String, String>> inscricoes = new ArrayList<HashMap<String, String>>();
        ArrayList<Integer> inscricoesCircuitoPequeno = new ArrayList<Integer>();
        ArrayList<Integer> inscricoesCircuitoMedio = new ArrayList<Integer>();
        ArrayList<Integer> inscricoesCircuitoAvancado = new ArrayList<Integer>();
        int id = 1;
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
                                id
                        );
                        id++;
                        System.out.println("0 - Não");
                        System.out.println("1 - Sim");
                        System.out.print("Deseja realizar outro cadastro? ");
                        answer = scanner.nextInt();
                    } while(answer == 1);
                    break;
                case 2:
                    int category;
                    do {
                        System.out.println("1 - Pequeno");
                        System.out.println("2 - Medio");
                        System.out.println("3 - Avançado");
                        System.out.println("0 - Voltar");
                        category = scanner.nextInt();

                        switch (category) {
                            case 1:
                                showSubscriptionsByCategory(inscricoesCircuitoPequeno, inscricoes);
                                break;
                            case 2:
                                showSubscriptionsByCategory(inscricoesCircuitoMedio, inscricoes);
                                break;
                            case 3:
                                showSubscriptionsByCategory(inscricoesCircuitoAvancado, inscricoes);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Insira uma opção válida");

                        }

                        System.out.println();
                        System.out.println("0 - NAO");
                        System.out.println("1 - SIM");
                        System.out.println("Deseja realizar outra pesquisa?");
                        answer = scanner.nextInt();
                        if (answer == 0) {
                            category = 0;
                        }

                    } while (category != 0);
                    break;
                case 3:
                    do {
                        System.out.print("Entre com o id da inscricao a ser cancelada: ");
                        id = scanner.nextInt();
                        --id;
                        System.out.println(inscricoes.get(id));
                        System.out.println(inscricoes.indexOf(id));
                        if (!inscricoes.contains(id)) {
                            System.out.println("Não existe uma inscrição com este id");
                        }
                    } while(!inscricoes.contains(id));
                    inscricoes.remove(id);
                    if (inscricoesCircuitoAvancado.contains(id)) {
                        inscricoesCircuitoAvancado.remove(id);
                    } else if (inscricoesCircuitoMedio.contains(id)) {
                        inscricoesCircuitoMedio.remove(id);
                    } else {
                        inscricoesCircuitoPequeno.remove(id);
                    }
                    System.out.println("\nInscrição cancelada");
                    break;
                case 4:
                    break;
                case 0:
                    System.out.println("Finalizado!");
                    break;
                default:
                    System.out.println("Digite uma opção válida");
            }
        } while (option != 0);
    }
}
