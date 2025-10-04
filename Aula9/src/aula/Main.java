package aula;

public class Main {
	public static void main(String[] args) {
		Exemplo1_Arrays ea = new Exemplo1_Arrays();
		
		int tamanho = ea.tamanhoLista();
		int[] array = ea.criarArray(tamanho);
		ea.imprimirVetor(array);
	}
}
