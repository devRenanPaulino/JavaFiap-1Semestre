package ddd;

public class MainListaAlunos {
	public static void main(String[] args) {
		ListaAlunos lista = new ListaAlunos(3);
		
		Aluno a1 = new Aluno(1, "Marcão", "1TDSPS", 8);
		
		System.out.println(a1.toString());
		System.out.println("=====================================================================");
		
		Aluno a2 = new Aluno(2, "Allyson", "1TDSPS", 9);
		Aluno a3 = new Aluno(3, "Andrew", "1TDSPS", 10);
		
		lista.inserir(a1);
		lista.inserir(a2);
		lista.inserir(a3);
		
		lista.listar();
		
		
	}
}
