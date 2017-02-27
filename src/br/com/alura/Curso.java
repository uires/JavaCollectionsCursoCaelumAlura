package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Curso implements Comparable<Curso> {
	private String nome;
	private String nomeInstrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Integer tempoTotal = 0;
	private Set<Alunos> alunos = new HashSet<>();
	
	private Map<Integer, Alunos> matriculaParaAlunos = new HashMap<>();

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

	public String toString() {
		return "Curso: " + this.nome + "\nCom o instrutor: "
				+ this.nomeInstrutor + "\nTempo total das aulas: "
				+ this.getTempoTotal() + " minutos";

	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
		tempoTotal += aula.getTempo();

	}

	public Integer getTempoTotal() {
		return tempoTotal;
	}

	@Override
	public int compareTo(Curso outraAula) {
		return this.nome.compareTo(outraAula.nome);
	}

	public void matriculaAluno(Alunos aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAlunos.put(aluno.getNumeroMatricula(), aluno);
	}

	public Set<Alunos> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Alunos aluno) {
		return this.alunos.contains(aluno);
	}

	public Alunos buscaMatricula(int numero) {	
		return matriculaParaAlunos.get(numero);
				
	}

}
	