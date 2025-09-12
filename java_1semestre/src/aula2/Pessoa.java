package aula2;

/**
 * Conceitos abordados
 *  - Classe - modelo para criar objetos.
 *  - Objeto - instância de uma classe
 *  - Encaosulamento - modificadores de acesso (public, private) para proteger os dados
 *  - Métodos - comportamento da classe (funções).
 *  - Método Constructor - Método especial para inicializar objetos.
 *  
 *  
 *  */

public class Pessoa {
	
	//atributos
	private String nome;
	private byte idade;
	
	//método de teste (main)
	public static void main(String[] args) {
		System.out.println("Minha classe pessoa");
		
		//criando um objeto da classe pessoa
		//<Classe> <objeto> = new <Classe>;
		Pessoa marcos = new Pessoa(); //instanciar um objeto da classe pessoa
		marcos.nome = "Marcos Vinicius";
		marcos.idade = 21;
		
		System.out.println("Nome: " + marcos.nome);
		System.out.println("Idade: " + marcos.idade);
		System.out.println("Objeto: " + marcos); // Hexadecimal onde o objeto está alocado (endereço de memória);
		System.out.println("---------------------------");
		
		Pessoa alisson = new Pessoa();
		alisson.nome = "Alisson";
		alisson.idade = 19;
		
		System.out.println("Nome: " + alisson.nome);
		System.out.println("Idade: " + alisson.idade);
		System.out.println("Objeto: " + alisson);
		
		Pessoa sergio = new Pessoa();
		sergio.nome = "Sergio Cloud";
		sergio.idade = 36;
		
		System.out.println("Nome: " + sergio.nome);
		System.out.println("Idade: " + sergio.idade);
		System.out.println("Objeto: " + sergio);
	}
	
}
