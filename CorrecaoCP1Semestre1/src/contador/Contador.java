package contador;

public class Contador {
	private int valor;
	
	public Contador (int valorInicial) {
		this.valor = valorInicial;
	}
	
	public void zerar() {
		this.valor = 0;
	}
	
	public void incrementar() {
		this.valor++;
	}
	
	public void decrementar() {
		this.valor--;
	}
	
	public int getValor() {
		return this.valor;
	}
	
}
