package aula;

import java.util.Scanner;

public class Exemplo1_Arrays {
	
	// método para definir o tamanho do array
	public int tamanhoLista() {
		System.out.println("-----Tamanho do Array-----");
		System.out.println("==========================");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho da lista: ");
		int tamanho = sc.nextInt();
		return tamanho;
	}
	
	public int[] criarArray(int tamanho) {
		System.out.println("-----Criando o Array-----");
		System.out.println("=========================");
		
		Scanner sc = new Scanner(System.in);
		//instanciando um array de inteiros
		int[] array = new int[tamanho];
		
		for(int i = 0; i < tamanho; i++) {
			System.out.printf("array [%d]", i);
			array[i] = sc.nextInt();
		}
		
		return array;
	}
	
	public void imprimirVetor(int[] array) {
		System.out.println("-----Imprimindo os items do Array-----");
		System.out.println("======================================");
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("valor (" + i + " :" + array[i]);
		}
	}
}
