package br.com.alura.principais;

import java.util.List;

import br.com.alura.Alunos;
import br.com.alura.Aula;
import br.com.alura.Curso;

public class TestaCursoComAlunos {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando Collecitons",
				"Paulo Silveira");

		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		javaColecoes.adiciona(new Aula("ArrayList", 30, "Paulo Silveira ", 5));
		javaColecoes.adiciona(new Aula("Usando Polimorfismo ", 20,
				"Paulo Silveira", 5));
		javaColecoes.adiciona(new Aula("Polimorfismo de Listas", 30,
				"Paulo Silveira", 10));
		javaColecoes.adiciona(new Aula("Java: Orientado a Objeto", 32,
				"Guilherme Silveira", 8));

		Alunos a1 = new Alunos("João Lima", 10000);
		Alunos a2 = new Alunos("Laisa Karoline", 10001);
		Alunos a3 = new Alunos("Maurício Aniche", 10002);
		javaColecoes.matriculaAluno(a1);
		javaColecoes.matriculaAluno(a2);
		javaColecoes.matriculaAluno(a3);

		System.out.println(javaColecoes);
		System.out.println(javaColecoes.getAulas());
		System.out.println(javaColecoes.getAlunos());
		try {
			System.out.println(javaColecoes.estaMatriculado(a1));
		} catch (Exception e) {
			System.out.println("----" + e);
		}
		Alunos a4 = new Alunos("Jesus Santos ", 10003);
	
		
		
		
		

	}

}
