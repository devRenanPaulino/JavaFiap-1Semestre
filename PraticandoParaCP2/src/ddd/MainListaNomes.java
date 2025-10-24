package ddd;

public class MainListaNomes {
	public static void main(String[] args) {
		CadastroNomes lista = new CadastroNomes();
		
		int tamanho = lista.tamanhoLista();
		String[] array = lista.listaNomes(tamanho);
		lista.imprimirLista(array);
		
	}
}
