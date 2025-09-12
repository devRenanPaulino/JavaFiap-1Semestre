package aula;

/**
 * construtor (sempre publico, não necessariamente precisa de parâmetro).
 * Por padrão o java cria automaticamente um construtor.
 * 
 * Estamos criando um contrutor com parãmetros prontos para quando o objeto for criado ser apenas definido o combustivel.
 * */

public class Carro {
	//atributos
	private boolean ligado;
	private float velocidade;
	private int combustivel; //em litros
	
	public Carro() {
		this.combustivel = 100;
		this.ligado = false;
		this.velocidade = (float) 0.0;
	}
	
	public Carro(int combustivel) {
		this.ligado = false;
		this.velocidade = 0.0f;
		this.combustivel = combustivel;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	public int getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(int combustivel) {
		this.combustivel = combustivel;
	}
	
	//métodos operacionais (define o comportamento do objeto)
	public void ligar() {
		if(this.ligado == false) {
			this.ligado = true;
			System.out.println("O carro foi ligado.");
		} else {
			System.out.println("O carro já está ligado.");
		}
	}
	
	public void desligar() {
		if (velocidade <= 0 && this.ligado == true) {
			this.ligado = false;
			System.out.println("Carro Desligado.");
		} else if (this.ligado == false) {
			System.out.println("o carro já está delisgado.");
		} else {
			System.out.println("Não é possivel desligar o carro em movimento! Abaixe a velocidade!");
			System.out.println("Velocidade atual: " + getVelocidade());
		}
	}
	
	public void acelerar(float valor) {
		if (this.ligado == false) {
			System.out.println("O carro está desligado. Não é possível acelerar.");
		} else if(this.combustivel == 0) {
			System.out.println("O carro está sem combustível.");
		} else {
			this.velocidade += valor;
			this.combustivel -= 1;
			System.out.println("Acelerou o carro. Velocidade atual: " + getVelocidade());
		}
	}
	
	public void exibirDetalhes() {
		System.out.println("---Status do Carro---");
		System.out.println("O carro está ligado? " + isLigado());
		System.out.println("A velocidade atual: " + getVelocidade());
		
		if(this.combustivel > 80) {
			System.out.println("Tanque CHEIO!");
			System.out.println("Tanque: " + getCombustivel() + "L");
		} else if (this.combustivel >= 40 && this.combustivel < 60) {
			System.out.println("Tanque pela METADE!");
			System.out.println("Tanque: " + getCombustivel() + "L");
		} else if (this.combustivel > 20) {
			System.out.println("Combustível: nível NORMAL!");
			System.out.println("Tanque: " + getCombustivel() + "L");
		} else {
			System.err.println("Combustível: nível BAIXO!");
			System.out.println("Tanque: " + getCombustivel() + "L");
		}
	}
}
