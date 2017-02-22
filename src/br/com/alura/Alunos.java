package br.com.alura;

import java.util.*;

public class Alunos {

	private String nomeAluno;
	private Integer numeroMatricula;

	public Alunos(String nomeAluno, Integer numeroMatricula) {

		this.nomeAluno = nomeAluno;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public Integer getNumeroMatricula() {
		return numeroMatricula;
	}
	@Override
	public String toString() {
		return "\n-----------------------------------" + "\nNome aluno: " + this.nomeAluno +
				"\nNúmero matrícula :" + this.numeroMatricula; 
	}

}
