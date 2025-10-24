package ddd;

//Super Classe - Classe Base
public class Veiculo {
	private String marca;
	private String modelo;
	private int anoFabricacao;
	private int velocidadeMaxima;
	private String cor;
	
	//construtor
	public Veiculo(String marca, String modelo, int anoFabricacao, int velocidadeMaxima, String cor) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.velocidadeMaxima = velocidadeMaxima;
		this.cor = cor;
		System.out.println("Um novo veículo " + marca + " foi criado!");
	}
	
	
	//getters and setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	//Métodos comuns (herdados)
	public void acelerar() {
		System.out.println("O veículo está acelerando...");
	}
	
	public void parar(){
		System.out.println("O veículo está parando...");
	}
}
