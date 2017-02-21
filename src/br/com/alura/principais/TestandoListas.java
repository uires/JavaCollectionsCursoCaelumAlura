package br.com.alura.principais;

import java.util.*;

public class TestandoListas {
	public static void main(String[] args) {
		String aula1 = "Conhecendo mais Listas";
		String aula2 = "Modelando a Classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		List<String> listasAulas = new ArrayList<String>();
		
		listasAulas.add(aula1);
		listasAulas.add(aula2);
		listasAulas.add(aula3);
				
		for (String aula : listasAulas) {
			System.out.println("Aula :: " +  aula);
			
		}
		
		
	}
}
