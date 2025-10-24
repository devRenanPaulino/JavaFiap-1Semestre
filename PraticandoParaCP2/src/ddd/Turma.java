package ddd;

import java.util.Arrays;
import java.util.Scanner;

public class Turma {
	private String[] nomes;
	private double[] notas;
	
	public String cadastrarAluno(int quantidade) {
		nomes = new String[quantidade];
		notas = new double[quantidade];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < quantidade; i++ ) {
			System.out.println("Digite o nome do aluno: ");
			nomes[i] = sc.nextLine();
			System.out.println("Digite a nota: ");
			notas[i] = sc.nextDouble();
			sc.nextLine();
			
			while(notas[i] < 0 || notas[i] > 10) {
				System.out.println("Nota Inválida. Digite a nota de 0 a 10: ");
				notas[i] = sc.nextDouble();
			}
		}
		
		return "Cadastro de Turma Realizado com Sucesso";
	}
	
	public void listarAluno() {
		for(int i=0; i < nomes.length; i++) {
			System.out.println("Aluno: " + nomes[i] + " / Nota: " + notas[i]);
		}
	}
	
	public void mediaTurma() {
		double soma = 0;
		int qtde = 0;
		
		for(int i = 0; i < notas.length; i++) {
			soma += notas[i];
			qtde += 1;
		}
		
		double media = soma / qtde;
		System.out.println("A média da Turma é: " + media);
	}

	
	
}
