package ddd;

import java.util.Scanner;

public class CadastroNomes {
	
	public int tamanhoLista() {
		System.out.println("===Tamanho da Lista===");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da lista: ");
		int tamanho = sc.nextInt();
		return tamanho;
	}
	
	public String[] listaNomes(int tamanho) {
		System.out.println("===Criando Array===");
		
		Scanner sc = new Scanner(System.in);
		
		String[] array = new String[tamanho];
		
		for (int i = 0; i < tamanho; i++) {
			System.out.printf("Digite o %d° nome: ", i);
			array[i] = sc.nextLine();
		}
		
		return array;
	}
	
	public void imprimirLista(String[] array) {
		System.out.println("===Imprimindo a Lista===");
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d° Nome: %s \n", i, array[i]);
		}
	}
	
}
