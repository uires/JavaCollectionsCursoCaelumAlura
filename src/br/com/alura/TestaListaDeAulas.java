package br.com.alura;
import java.util.*;
public class TestaListaDeAulas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Aula a1 = new Aula("Revisando o assunto de ArrayList ", 24, "Paulo Silveira", 5);
		Aula a2 = new Aula("Lista de Objetos ", 15, "Silveira ", 5);
		Aula a3 = new Aula("Relacionamento de listas e objetos ", 15,"P. Silveira", 5);
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
	}

}
