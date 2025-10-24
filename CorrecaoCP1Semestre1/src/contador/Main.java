package contador;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Contador cont = new Contador(0);
		
		boolean flag = true;
		
		while(flag) {
			System.out.println("1 - zerar contador");
			System.out.println("2 - incrementar contador");
			System.out.println("3 - decrementar contador");
			System.out.println("4 - mostrar o valor atual do contador");
			System.out.println("5 - sair");
			
			System.out.println("Escolha uma opção: ");
			int opcao = sc.nextInt();
			
			switch(opcao) {
			case 1:
				cont.zerar();
				break;
			case 2:
				cont.incrementar();
				break;
			case 3:
				cont.decrementar();
				break;
			case 4:
				System.out.println("QTDE: " + cont.getValor());
				break;
			case 5:
				flag = false;
				System.out.println("Finalizando o Programa...");
				break;
			default:
				System.out.println("Opção Inválida! Escolha uma opção (1-5)");
			}
			
		}
	}
}
