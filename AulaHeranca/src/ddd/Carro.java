package ddd;

public class Carro extends Veiculo {
	
	private int numeroPortas;
	
	//Construtor da classe deve chamar o construtor da superclasse - SUPER
	public Carro(String marca, String modelo, int anoFabricacao, int velocidadeMaxima, String cor, int numeroPortas) {
		super(marca, modelo, anoFabricacao, velocidadeMaxima, cor);
		this.numeroPortas = numeroPortas;
	}
	
	//métodoEspecifico
	public void ligarLimpadorParabrisa() {
		System.out.println("Carro ligou o limpador de parabrisa...");
	}

	public int getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}
	
}
