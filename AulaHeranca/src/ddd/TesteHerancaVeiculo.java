package ddd;

public class TesteHerancaVeiculo {
	public static void main(String[] args) {
		Carro c1 = new Carro("FIAT", "147", 1978, 120, "vermelho", 2);
		
		//uso método herdado
		c1.acelerar();
		
		//uso método da própria marca (veiculo)
		c1.ligarLimpadorParabrisa();
		
		//uso método herdado
		c1.parar();
		
		//uso método herdado
		System.out.println("Marca do Carro: " + c1.getMarca());
		
		//uso método da própria marca (veiculo)
		System.out.println("Número de portas: " + c1.getNumeroPortas());
		
		System.out.println("Avião");
		
		Aviao meuAviao = new Aviao("Boing", "777", 2025, 980, "branco", 4);
		
		//uso método reescrito
		meuAviao.acelerar();
		
		//uso de metodo proprio
		meuAviao.decolar();
		
		//uso de método herdado
		meuAviao.parar();
	}
}
