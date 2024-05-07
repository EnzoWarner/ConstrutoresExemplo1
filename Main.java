/*
Os construtores em Java são essenciais para a inicialização de objetos. São métodos especiais que têm o mesmo nome da classe e são utilizados para criar e inicializar instâncias dessa classe. Quando um novo objeto é criado com o operador new, o construtor correspondente da classe é invocado automaticamente para realizar a inicialização do objeto. Esses construtores permitem que os objetos sejam configurados com valores iniciais específicos e executem qualquer lógica necessária para garantir que o objeto seja válido e esteja em um estado coerente. Em suma, os construtores são responsáveis por preparar os objetos para serem utilizados de forma adequada em um programa Java.

Para definir um construtor em uma classe em Java, você cria um método com o mesmo nome da classe e sem tipo de retorno. Isso permite que você inicialize os atributos da classe ou realize outras operações necessárias quando um objeto dessa classe é criado. 
 */
public class Main {
    public static void main(String[] args) {
        // Criando objetos da classe Pessoa usando os construtores
        Pessoa pessoa1 = new Pessoa(); // Construtor padrão
        Pessoa pessoa2 = new Pessoa("Alice", 30); // Construtor com parâmetros

        // Exibindo informações sobre as pessoas criadas
        System.out.println("Pessoa 1: Nome = " + pessoa1.getNome() + ", Idade = " + pessoa1.getIdade());
        System.out.println("Pessoa 2: Nome = " + pessoa2.getNome() + ", Idade = " + pessoa2.getIdade());
    }
}