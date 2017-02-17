package br.com.alura;

public class Aula implements Comparable<Aula>{
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
		return this.tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	public String toString(){
		return "[\nAula: " + this.titulo + "\nMinutos: " + this.tempo + "\nInstrutor: " +
				this.instrutorDaCaelum + "\nNível de dificuldade: " + this.dificuldadeDoCurso + "]";
	}

	@Override
	public int compareTo(Aula outraAula) {
		if(this.titulo.compareTo(outraAula.titulo)< 0 && 
				(this.instrutorDaCaelum.compareTo(outraAula.instrutorDaCaelum) < 0)){
			return -1;
		}else if(this.titulo.compareTo(outraAula.titulo) > 0 && 
				(this.instrutorDaCaelum.compareTo(outraAula.instrutorDaCaelum) > 0)){
			return 1;
		}// Retorna zero caso de impate :
		return 0;
	}
	
	
}
