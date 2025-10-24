package ddd;

import java.util.Scanner;

public class Clima {
	private double[] temperatura;
	
	public double[] RegistrarTemperaturas(int dias) {
		temperatura = new double[dias];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < temperatura.length; i++) {
			System.out.println("Digite a temperatura do " + (i + 1) + "° dia: ");
			temperatura[i] = sc.nextDouble();
		}
		
		return temperatura;
	}
	
	public void mediaTemperatura() {
		double soma = 0;
		int qtde = 0;
		
		for(int i = 0; i < temperatura.length; i++) {
			soma += temperatura[i];
			qtde += 1;
		}
		
		double media = soma / qtde;
		
		System.out.println("A média de temperatura durante os dias foi: " + media + "°C");
	}
	
	public void maiorTemperatura(){
		double maior = 0;
		
		for(int i = 0; i < temperatura.length; i++) {
			if(i == 0) {
				maior = temperatura[i];
			}
			
			if (maior < temperatura[i]) {
				maior = temperatura[i];
			}
		}
		
		System.out.println("A maior temperatura registrada foi: " + maior + "°C");
	}
	
	public void menorTemperatura(){
		double menor = 0;
		
		for(int i = 0; i < temperatura.length; i++) {
			if(i == 0) {
				menor = temperatura[i];
			}
			
			if (menor > temperatura[i]) {
				menor = temperatura[i];
			}
		}
		
		System.out.println("A menor temperatura registrada foi: " + menor + "°C");
	}
}
