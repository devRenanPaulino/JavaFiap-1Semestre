package ddd;

public class Estoque {
	private ProdutoObjeto[] produtos;
	private int i = 0; // indice do array de objetos
	
	public Estoque(int qtde){
		produtos = new ProdutoObjeto[qtde];
	}
	
	public String inserir(ProdutoObjeto produtoObjeto) {
		if (produtoObjeto == null) {
			return "Impossível inserir um objeto vazio";
		} else {
			produtos[i] = produtoObjeto;
			i++;
			return "Produto Cadastrado";
		}
	}
	
	public void listarProduto() {
		for (int i=0; i < produtos.length; i++) {
			System.out.println(produtos[i].toString());
		}
	}
	
	public void totalEstoque() {
		double soma = 0;
		for (int i=0; i < produtos.length; i++) {
			soma += produtos[i].getPreco() * produtos[i].getQuantidade();
		}
		
		System.out.println("O VALOR TOTAL EM ESTOQUE: R$: " + soma); 
	}
	
}
