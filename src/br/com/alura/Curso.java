package br.com.alura;
import java.util.*;
public class Curso implements Comparable<Curso> {
	private String nome;
	private String nomeInstrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Integer tempoTotal = 0;
	public Curso(String nome, String nomeInstrutor) {
		this.nome = nome;
		this.nomeInstrutor = nomeInstrutor;
	}

	public String getNome() {
		return nome;
	}
	

	public String getNomeInstrutor() {
		return nomeInstrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
		
	public String toString(){
		return "Curso: " + this.nome + "\nCom o instrutor: " + this.nomeInstrutor +
				"\nTempo total de aula: " + this.getTempoTotal() + " minutos" ;
		
	}
	public void adiciona(Aula aula){
		this.aulas.add(aula);
		tempoTotal += aula.getTempo();
		
	}
	
	public Integer getTempoTotal() {
		return tempoTotal;
	}

	@Override
	public int compareTo(Curso arg0) {
		return this.nome.compareTo(arg0.nome);
	}
	
	
		
}
