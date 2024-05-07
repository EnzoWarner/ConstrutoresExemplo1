public class Pessoa {
    // Atributos
    private String nome;
    private int idade;

    // Construtor padrão
    public Pessoa() {
        this.nome = "Nome padrão";
        this.idade = 0;
    }

    // Construtor com parâmetros
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
