public class Main {
    public static void main(String[] args) {
        Pessoa generica = new Pessoa();
        Pessoa andris = new Pessoa("Andris", "33", "1", 66, 1.71);

        System.out.println(andris.calculaIMC());
        System.out.println(andris.ehMaioridade());
        andris.infos();
    }
}
