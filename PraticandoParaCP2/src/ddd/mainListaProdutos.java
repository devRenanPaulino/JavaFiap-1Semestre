package ddd;

public class mainListaProdutos {
	public static void main(String[] args) {
		Produto produto = new Produto();
        
        int tamanho = produto.tamanhoLista();
        produto.cadastrarProdutos(tamanho);
        produto.listarProdutos();
        produto.valorEstoque();
	}
}
