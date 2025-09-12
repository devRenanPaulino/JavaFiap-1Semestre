package aula;

public class Main {
	public static void main(String[] args) {
		Carro c1 = new Carro();
		
		System.out.println(">>> Tentando acelerar o carro!");
		c1.acelerar(30);
		System.out.println("\n>>> Ligando o carro!");
		c1.ligar();
		
		System.out.println(">>>Acelerando...");
		c1.acelerar(45);
		
		System.out.println(">>>Verificando Status");
		c1.exibirDetalhes();
		
		System.out.println(">>> Tentando Desligar o carro...");
		c1.desligar();
		
		System.out.println(" >>>Parando o carro...");
		c1.acelerar(-45);
		System.out.println("Velocidade atual: " + c1.getVelocidade());
		
		System.out.println("Desligando o carro...");
		c1.desligar();
	}
}
