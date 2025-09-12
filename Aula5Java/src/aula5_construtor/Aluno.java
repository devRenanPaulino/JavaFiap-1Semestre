package aula5_construtor;

public class Aluno {
	//atributos
	private int matricula;
	private String nome;
	private String curso;
	private boolean status;
	private float mediaFinal;
	
	//O construtor vazio é uma forma de sobrecarga, permitindo que você tenha várias maneiras de criar objetos.
	public Aluno() {
		System.out.println("Objeto Criado!");
	}
	
	//Construtor
	public Aluno(int matricula, String nome, String curso, boolean status) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.status = status;
	}
	
	
	//getter
	public int getMatricula() { return matricula; }
    public String getNome() { return nome; }
    public String getCurso() { return curso; }
    public boolean getStatus() { return status; }
    public float getMediaGeral() { return mediaFinal; }
    
    //setter
    public void setNome(String nome) { this.nome = nome;}
    public void setCurso(String curso) { this.curso = curso; }
    public void setStatus(boolean status) { this.status = status; }
	
    //método
	public void calcularMedia(float n1, float n2, float n3) {
		this.mediaFinal = (n1 + n2 + n3) / 3;
	}
	
}
