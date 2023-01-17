package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Joao");
		Aluno aluno2 = new Aluno("lucas");
		
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web 2023");
		
		
		curso1.adixionarAluno(aluno2);
		curso2.adixionarAluno(aluno1);
		
		for(Aluno aluno: curso1.alunos ) {
			System.out.println(aluno.nome);
		}
		for(Aluno aluno: curso2.alunos ) {
			System.out.println(aluno.nome);
		}
		
		
		
		
	}

}
