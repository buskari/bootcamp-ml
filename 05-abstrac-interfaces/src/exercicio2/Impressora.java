package exercicio2;

public interface Impressora {

    static void imprimir(String type) {
        switch (type) {
            case "Currículo":
                System.out.println("Imprimindo currículo...");
                break;
            case "PDF":
                System.out.println("Imprimindo PDF...");
                break;
            case "Report":
                System.out.println("Imprimindo relatório...");
                break;
            default:
                System.out.println("Este tipo de documento não existe!");
        }
    }
}
