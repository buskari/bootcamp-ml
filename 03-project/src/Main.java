public class Main {
    public static void main(String[] args) {
        Pessoa generica = new Pessoa();
        Pessoa andris = new Pessoa("Andris", "33", "1", 66, 1.71);

        if (andris.calculaIMC() == -1) {
            System.out.println("Abaixo do peso");
        } else if (andris.calculaIMC() == 0) {
            System.out.println("Peso saudável");
        } else {
            System.out.println("Sobrepeso");
        }

        System.out.println();

        if (andris.ehMaioridade()) {
            System.out.println("É maior de idade.");
        } else {
            System.out.println("É MENOR de idade");
        }

        System.out.println();
        
        andris.infos();
    }
}
