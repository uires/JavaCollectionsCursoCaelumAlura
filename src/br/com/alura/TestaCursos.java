package br.com.alura;

import java.util.List;

public class TestaCursos {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando Collecitons",
				"Paulo Silveira");
			
		javaColecoes.adiciona(new Aula("ArrayList", 30, "Paulo Silveira ", 5));
		javaColecoes.adiciona(new Aula("Usando Polimorfismo: ",20, "Paulo Silveira", 5));
		javaColecoes.adiciona(new Aula("Gii", 30 ,"Paulo Silveira",10));
		
	}

}
