package br.com.alura.principais;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class AlunosPrincipal {
	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<>();
		
		alunos.add("João Lima");
		alunos.add("Laisa Karoline");
		alunos.add("Mario Neto");
		alunos.add("Paulo Silveira");
		alunos.add("Judas Santana");
		
		for (String aluno : alunos) {
			System.out.println(aluno);			
		}
		System.out.println("---------------");
		
		boolean testeContais = alunos.contains("João Lima");
		System.out.println(testeContais);
		
		
		
	}

}
