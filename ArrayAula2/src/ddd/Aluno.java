package ddd;

public class Aluno {
	private int matricula;
	private String nome;
	private String turma;
	private double media;
	
	// construtor
	public Aluno(int matricula, String nome, String turma, double media) {
		this.matricula = matricula;
		this.nome = nome;
		this.turma = turma;
		this.media = media;
	}
	
	
	//getters and setters
	public int getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public double getMedia() {
		return media;
	}


	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", turma=" + turma + ", media=" + media + "]";
	}
	
	
	
}
