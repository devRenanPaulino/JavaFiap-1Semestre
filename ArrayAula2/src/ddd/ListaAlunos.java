package ddd;

public class ListaAlunos {
	
	private Aluno[] alunos; //declaração de um array de objetos do tipo aluno
	private int i = 0; //variável de controle do índice do array
	
	//construtor
	public ListaAlunos(int qtde) {
		System.out.println("=== Lista Criada! ===");
		
		//instanciando o array (alunos)
		alunos = new Aluno[qtde];
	}
	
	public String inserir(Aluno aluno) {
		if (aluno != null) {
			alunos[i] = aluno;
			i++;
			return "Aluno inserido na lista!";
		} else {
			return "Aluno Não Inserido!";
		}
	}
	
	public void listar() {
		for (int i=0; i < alunos.length; i++) {
			System.out.println(alunos[i].toString());
		}
	}
}
