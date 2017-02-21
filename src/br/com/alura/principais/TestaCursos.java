package br.com.alura.principais;

import java.util.List;
import java.util.*;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

import br.com.alura.Aula;
import br.com.alura.Curso;

public class TestaCursos{

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando Collecitons",
				"Paulo Silveira");
		List<Aula> aulas = javaColecoes.getAulas();	
		javaColecoes.adiciona(new Aula("ArrayList", 30, "Paulo Silveira ", 5));
		javaColecoes.adiciona(new Aula("Usando Polimorfismo: ",20, "Paulo Silveira", 5));
		javaColecoes.adiciona(new Aula("Polimorfismo de Listas", 30 ,"Paulo Silveira",10));
		//System.out.println(javaColecoes.getAulas());
		
		javaColecoes.adiciona(new Aula("Java: Orientado a Objeto" , 32, "Guilherme Silveira", 8));
		Aula a1 = new Aula("Operando Bent to Fly ", 66, "Lucas Silva", 9);
		//System.out.println(javaColecoes.getAulas());
		
		
		javaColecoes.adiciona(a1);
		//System.out.println(aulas);
		System.out.println(javaColecoes.getAulas());
		
		
		System.out.println("Tempo Total de todas as aulas é: " + javaColecoes.getTempoTotal());
		
		
		
		
		
		
	}

}
