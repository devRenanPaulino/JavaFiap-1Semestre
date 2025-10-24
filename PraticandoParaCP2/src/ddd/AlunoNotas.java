package ddd;

import java.util.Scanner;

public class AlunoNotas {
	private String nome;
	
	//construtor obrigando o nome do aluno como instãncia
	public AlunoNotas(String nome) {
		this.setNome(nome);
	}
	
	
	public double[] notasAluno() {
		Scanner sc = new Scanner(System.in);
		
		double[] notas = new double[3];
		
		for (int i = 0; i < 3; i++) {
				System.out.println("Digite a nota do aluno: ");
				notas[i] = sc.nextDouble();
				
			while (notas[i] < 0 || notas[i] > 10){
				System.out.println("Valor Inválido. Digite a nota do aluno entre 0 - 10: ");
				notas[i] = sc.nextDouble();
			}
		}
		
		return notas;
	}
	
	public void resultadoAluno(double[] notas) {
		double somaNotas = 0;
		
		for (int i = 0; i < notas.length; i++) {
			somaNotas += notas[i];
		}
		
		double media = somaNotas / notas.length;
		
		if (media >= 6) {
			System.out.println("Nome do Aluno: " + getNome());
			System.out.println("Notas: " + notas[0] + "/" + notas[1] + "/" + notas[2]);
			System.out.println("Média: " + media);
			System.out.println("APROVADO");
		} else {
			System.out.println("Nome do Aluno: " + getNome());
			System.out.println("Notas: " + notas[0] + "/" + notas[1] + "/" + notas[2]);
			System.out.println("Média: " + media);
			System.out.println("Reprovado");
		}
	}
	
	
	// getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
