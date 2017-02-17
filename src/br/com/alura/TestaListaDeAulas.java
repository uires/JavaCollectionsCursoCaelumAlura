package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class TestaListaDeAulas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Aula a1 = new Aula("Revisando o assunto de ArrayList ", 24, "Alejan Silveira", 5);
		Aula a2 = new Aula("Lista de Objetos ", 12, "Bed Silveira ", 5);
		Aula a3 = new Aula("Relacionamento de listas e objetos ", 13,"P. Silveira", 5);
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		Collections.sort(aulas);
		
		//Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
			System.out.println(aulas);
	}

}
