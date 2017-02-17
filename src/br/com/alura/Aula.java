package br.com.alura;

public class Aula {
	private String titulo;
	private int tempo;
	private String instrutorDaCaelum;
	private int dificuldadeDoCurso;

	public Aula(String titulo, int tempo, String instrutorDaCaelum, int dificuldadeDoCurso) {
		
		this.titulo = titulo;
		this.tempo = tempo;
		this.instrutorDaCaelum = instrutorDaCaelum;
		this.dificuldadeDoCurso = dificuldadeDoCurso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	public String toString(){
		return "\nAula: " + this.titulo + "\nMinutos: " + this.tempo + "\nInstrutor: " +
				this.instrutorDaCaelum + "\nNível de dificuldade: " + this.dificuldadeDoCurso;
	}
	
	
}
