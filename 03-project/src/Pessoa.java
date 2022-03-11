public class Pessoa {
    public Pessoa() {}
    public Pessoa(String nome, String idade, String id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }
    public Pessoa(String nome, String idade, String id, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }

    private String nome;
    private String idade;
    private String id;
    private double peso;
    private double altura;

    public int calculaIMC() {
        double imc = this.peso / (this.altura * this.altura);

        if (imc < 20) {
            return -1;
        } else if (imc > 25) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean ehMaioridade() {
        return Integer.parseInt(this.idade) >= 18;
    }

    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return idade;
    }

    public String getId() {
        return id;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void infos() {
        System.out.println(getNome());
        System.out.println(getIdade());
        System.out.println(getId());
        System.out.println(getPeso());
        System.out.println(getAltura());
    }
}
