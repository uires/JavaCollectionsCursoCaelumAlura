package br.com.alura;
import java.util.*;
public class Curso {
	private String nome;
	private String nomeInstrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	
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
		return "Nome curso: " + this.nome + "\nNome Instrutor: " + this.nomeInstrutor;
		
	}
	public void adiciona(Aula aula){
		this.aulas.add(aula);	
	}
	
	
		
}
