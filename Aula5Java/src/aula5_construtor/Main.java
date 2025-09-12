package aula5_construtor;

public class Main {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno(123, "Renan Paulino", "TDS", true);
		aluno1.calcularMedia(10, 10, 10);
		
		aluno1.setCurso("Engenharia de Software");
		
		System.out.println("Matrícula: " + aluno1.getMatricula());
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Curso: " + aluno1.getCurso());
        System.out.println("Status: " + aluno1.getStatus());
        System.out.println("Média Geral: " + aluno1.getMediaGeral());
        
        System.out.println("\n----------------------------------\n");
        
        Aluno aluno2 = new Aluno();
        
        aluno2.setNome("Kelvin Durant");
        aluno2.setCurso("Ciência da Computação");
        aluno2.setStatus(false);
        aluno2.calcularMedia(6,7,8);
        
        System.out.println("Matrícula: " + aluno2.getMatricula());
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Curso: " + aluno2.getCurso());
        System.out.println("Status: " + aluno2.getStatus());
        System.out.println("Média Geral: " + aluno2.getMediaGeral());
	}
}
