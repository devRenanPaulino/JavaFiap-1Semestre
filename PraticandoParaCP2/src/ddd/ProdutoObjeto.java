package ddd;

public class ProdutoObjeto {
	private String nome;
	private double preco;
	private int quantidade;
	
	// construtor
	public ProdutoObjeto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	// getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "ProdutoObjeto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
}
