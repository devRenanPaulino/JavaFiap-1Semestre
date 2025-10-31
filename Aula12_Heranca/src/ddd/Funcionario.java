package ddd;

public class Funcionario extends Usuario{
	private String matricula;
	private String setor;

	public Funcionario(String nome, String email, String senha, boolean ativo, String matricula, String setor) {
		super(nome, email, senha, ativo);
		this.matricula = matricula;
		this.setor = setor;
	}
	
	
	public void registrarPonto() {
		System.out.println(super.getNome() + " (Matrícula: " + matricula + ") \n Registrou o Ponto!\n");
	}
	
	@Override
	public void visualizarPerfil() {
		System.out.println("Visualizando o perfil do funcionário: " + super.getNome() + " Setor: " + setor + ". Matricula: " + matricula + "\n");
	}
}
