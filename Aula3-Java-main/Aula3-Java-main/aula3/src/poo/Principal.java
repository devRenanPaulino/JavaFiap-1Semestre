package poo;

public class Principal {
	public static void main(String[] args) {
		
		//Criado objeto da classe Carro
		Carro c1 = new Carro();
		
		/**
		Carro c2 = new Carro();
		Carro c3 = new Carro();
		
		//acesso direto aos atributos (Não é a melhor prática)
		c1.marca = "BMW";
		c1.modelo = "X6";
		c1.ano = 2026;
		c1.cor = "Azul";
		c1.ligado = false;
		
		//imprimindo os dados do objeto
		System.out.println("Marca: " + c1.marca);
		System.out.println("Modelo: " + c1.modelo);
		System.out.println("Ano: " + c1.ano);
		System.out.println("Cor: " + c1.cor);
		System.out.println("Ligado: " + c1.ligado);
		
		System.out.println("\n------------------------------\n");
		*/
		
		//acesso por métodos
		
		c1.setMarca("BMW");
		c1.setModelo("X6");
		c1.setAno(2026);
		c1.setCor("Azul");
		c1.setLigado(false);
		
		String marca = c1.getMarca();
		System.out.println("A marca do carro é: " + marca);
		System.out.println("Modelo: " + c1.getModelo());
		System.out.println("Ano: " + c1.getAno());
		System.out.println("Cor: " + c1.getCor());
		System.out.println("ligado: " + c1.getLigado());
		
		
	}
}
