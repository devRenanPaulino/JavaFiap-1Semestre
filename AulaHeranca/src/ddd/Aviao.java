package ddd;

public class Aviao extends Veiculo{
	
	private int numeroMotores;

	public Aviao(String marca, String modelo, int anoFabricacao, int velocidadeMaxima, String cor, int numeroMotores) {
		super(marca, modelo, anoFabricacao, velocidadeMaxima, cor);
		this.numeroMotores = numeroMotores;
	}
	
	public int getNumeroMotores() {
		return numeroMotores;
	}
	
	public void setNumeroMotores(int numeroMotores) {
		this.numeroMotores = numeroMotores;
	}
	
	public void decolar() {
		System.out.println("O avião está decolando...");
	}
	
	//Exemplo de reescrita (override) de um método da superclasse - polimorfismo
	
	@Override
	public void acelerar() {
		System.out.println("O avião está acelerando...");
	}
}
