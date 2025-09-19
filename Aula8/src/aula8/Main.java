package aula8;

public class Main {
	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		int op = calc.menu();
		float n1 = calc.entradaDeDados();
		float n2 = calc.entradaDeDados();
		float result = calc.controlador(op, n1, n2);
		calc.imprimir(result);
		
	}
}
