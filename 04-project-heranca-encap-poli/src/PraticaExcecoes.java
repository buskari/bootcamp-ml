public class PraticaExcecoes {
    private final int a = 0;
    private final int b = 300;

    public int calculaRazao() {
        try {
            return this.a / this.b;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Nao pode ser divido por zero");
        } finally {
            System.out.println("Programa finalizada");
        }
    }
}
