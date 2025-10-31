package ddd;

public class MainAula12 {
	public static void main(String[] args) {
		System.out.println("--- Criando o Usuário no Sistema ---");
		
		//1. Instancia Cliente
		Cliente joao = new Cliente("João Silva", "joao@email.com", "123", true, 0);
		
		//2. Instancia Administrador
		Administrador ana = new Administrador("Ana Torres", "ana@email.com", "321", true, "Master");
		
		//3. instancia Funcionario
		Funcionario pedro = new Funcionario("Pedro Lima", "pedro@gmail.com", "456", true, "F007", "Vendas");
		
		System.out.println("--- Ações Específicas ---");
		//Cada classe faz sua ação especifica
		joao.fazerPedido();
		joao.visualizarPerfil();
		
		pedro.registrarPonto();
		pedro.visualizarPerfil();
		
		ana.deletarConta("algum_foi_de_vasco@gmail.com");
	}
}
