package ddd;

public class Cliente extends Usuario {
	private int totalPedidos;
	
	
	public Cliente(String nome, String email, String senha, boolean ativo, int totalPedidos) {
		super(nome, email, senha, ativo);
		this.totalPedidos = totalPedidos;
	}
	
	
	//método específico
	public void fazerPedido() {
		this.totalPedidos++;
		System.out.printf("O cliente %s fez o pedido! \n Total de Pedidos: %d \n", super.getNome(), this.totalPedidos);
	}
	
	@Override
	public void visualizarPerfil() {
		System.out.println("Visualizando o perfil de " + super.getNome() + ". Total Pedidos: " + this.totalPedidos + "\n");
	}
}
