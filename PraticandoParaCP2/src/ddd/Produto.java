package ddd;

import java.util.Scanner;

public class Produto {
	private String[] nomes;
	private double[] precos;
	private int tamanho;
	
	
	public int tamanhoLista() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a qtde de produtos que você gostaria de cadastrar");
		int tamanho = sc.nextInt();
		
		return tamanho;
		
	}
	
	public void cadastrarProdutos(int tamanho) {
		
		Scanner sc = new Scanner(System.in);
		
		nomes = new String[tamanho];
		precos = new double[tamanho];
		
		for (int i = 0; i < tamanho; i++) {
		    System.out.println("Digite o nome do produto:");
		    nomes[i] = sc.nextLine(); // lê o nome completo

		    System.out.println("Digite o preço do produto:");
		    precos[i] = sc.nextDouble();
		    sc.nextLine(); // limpa o Enter depois de ler o número
		}
	}
	
	public void listarProdutos() {
		System.out.println("=============================================================");
		for (int i = 0; i < nomes.length; i++) {
		    System.out.println("Produto: " + nomes[i] + " - Preço: R$" + precos[i]);
		}
		System.out.println("=============================================================");
	}
	
	
	public void valorEstoque() {
		double totalEstoque = 0;
		
		for (int i = 0; i < precos.length; i++) {
			totalEstoque += precos[i];
		}
		
		System.out.print("Valor total estoque: R$: " + totalEstoque);
	}
	
	
}
	

