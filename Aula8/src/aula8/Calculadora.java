package aula8;

import java.util.Scanner;

public class Calculadora {
	
	//menu
	public int menu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--- Menu ---");
		System.out.println("1. Adição");
		System.out.println("2. Subtração");
		System.out.println("3. Multiplição");
		System.out.println("4. Divisão");
		System.out.println("5. Sair");
		
		System.out.println("Digite a opção desejada: ");
		int op = sc.nextInt();
		return op;
	}
	
	
	//entrada de dados
	public float entradaDeDados() {
		System.out.println("--- Entrada de Dados ---");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		float numero = sc.nextFloat();
		return numero;
	}
	
	//adição
	public float adicao(float n1, float n2) {
		System.out.println("--- Adição ---");
		float result = n1 + n2;
		return result;
	}
	
	//subtração
	public float subtracao(float n1, float n2) {
		System.out.println("--- Subtração ---");
		float result = n1 - n2;
		return result;
	}
	
	//multiplicação
	public float multiplicacao(float n1, float n2) {
		System.out.println("--- Multiplicação ---");
		float result = n1 * n2;
		return result;
	}
	
	//divisão
	public float divisao(float n1, float n2) {
		System.out.println("--- Divisão ---");
		float result = n1 / n2;
		return result;
	}
	
	//imprimir
	public void imprimir(float result) {
		System.out.println("--- Imprimir ---");
		System.out.println("Resultado: " + result);
	}
	
	//controladora
	public float controlador(int op, float n1, float n2) {
		System.out.println("--- Controlador ---");
		float result = 0;
		
		switch(op) {
		case 1:
			result = adicao(n1, n2);
			break;
		case 2: 
			result = subtracao(n1, n2);
			break;
		case 3: 
			result = multiplicacao(n1, n2);
			break;
		case 4: 
			result = divisao(n1, n2);
			break;
		}
		return result;
	}
}
