package ddd;

public class Usuario {
	private String nome;
	private String email;
	private String senha;
	private boolean ativo;
	
	//constructor
	public Usuario(String nome, String email, String senha, boolean ativo) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.ativo = ativo;
	}
	
	
	//getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
	//métodos comuns e públicos
	
	public void login() {
		//lógica do método de login
		System.out.println(nome + "( " + email + " ) \n login efetuado com sucesso! \n");
	}
	
	public void visualizarPerfil() {
		System.out.println("Visualizando o perfil de " + nome + "\n");
	}
}
