package ddd;

public class MainAluno {
	public static void main(String[] args) {
		AlunoNotas a1 = new AlunoNotas("Renan");
		
		double[] notas = a1.notasAluno();
		a1.resultadoAluno(notas);
		
	}
}
