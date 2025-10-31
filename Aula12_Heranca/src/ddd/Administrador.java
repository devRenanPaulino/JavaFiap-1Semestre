package ddd;

public class Administrador extends Usuario {
	//atributo especifico
	private String nivelAcesso;
	
	
	public Administrador(String nome, String email, String senha, boolean ativo, String nivelAcesso) {
		super(nome, email, senha, ativo);
		this.nivelAcesso = nivelAcesso;
	}
	
	//metodo especifico
	public void deletarConta(String emailUsuario) {
		System.out.println("Admin (" + this.nivelAcesso + ") \n Conta do Usuário: " + super.getEmail() + "\n Deletado com Sucesso \n");
	}
}
