package exercicio2;

public interface Impressora {

    static void imprimir(Document doc) {
        switch (doc.getType()) {
            case CURRICULO:
                System.out.println("Imprimindo currículo...");
                break;
            case PDF:
                System.out.println("Imprimindo PDF...");
                break;
            case REPORT:
                System.out.println("Imprimindo relatório...");
                break;
            default:
                System.out.println("Este tipo de documento não existe!");
        }
    }
}
