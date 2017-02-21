package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class Aula implements Comparable<Aula>{
	private String nome;
	private int tempo;
	private String instrutorDaCaelum;
	private int dificuldadeDoCurso;

	public Aula(String titulo, int tempo, String instrutorDaCaelum, int dificuldadeDoCurso) {
		
		this.nome = titulo;
		this.tempo = tempo;
		this.instrutorDaCaelum = instrutorDaCaelum;
		this.dificuldadeDoCurso = dificuldadeDoCurso;
	}

	public String getTitulo() {
		return nome;
	}

	public void setTitulo(String titulo) {
		this.nome = titulo;
	}

	public int getTempo() {
		return this.tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	public String toString(){
		return "[\n\n\nAula: " + this.nome + "\n" + this.tempo + " Minutos \n" + "Instrutor: " +
				this.instrutorDaCaelum + "\nNível de dificuldade: " + this.dificuldadeDoCurso + "]";
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.nome.compareTo(outraAula.nome);		
	}
	

	
}
