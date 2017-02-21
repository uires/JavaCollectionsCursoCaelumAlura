package br.com.alura.principais;

import java.util.ArrayList;
import java.util.List;
import java.util.*;




import br.com.alura.Aula;
import br.com.alura.Curso;

public class TestaCurso2 {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando Collecitons",
				"Paulo Silveira");
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();	
		javaColecoes.adiciona(new Aula("ArrayList", 30, "Paulo Silveira ", 5));
		javaColecoes.adiciona(new Aula("Usando Polimorfismo ",20, "Paulo Silveira", 5));
		javaColecoes.adiciona(new Aula("Polimorfismo de Listas", 30 ,"Paulo Silveira",10));
		javaColecoes.adiciona(new Aula("Java: Orientado a Objeto" , 32, "Guilherme Silveira", 8));
		
		List <Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		
		Aula a1 = new Aula("Operando Bent to Fly ", 66, "Lucas Silva", 9);
		
		javaColecoes.adiciona(a1);
		System.out.println(javaColecoes + "\n" + aulas);
		//System.out.println(javaColecoes + "\n" +  javaColecoes.getAulas());
		System.out.println("---------------------------------------");
		
		
		
	}

}
