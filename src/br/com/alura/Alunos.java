package br.com.alura;

import java.util.*;

public class Alunos {

	private String nomeAluno;
	private Integer numeroMatricula;

	public Alunos(String nomeAluno, Integer numeroMatricula) {
		if (nomeAluno == null) {
			throw new NullPointerException("Nome não pode ser null");
		}
		this.nomeAluno = nomeAluno;
		if (numeroMatricula == 0) {
			throw new NullPointerException("Valor de entrada incorreto");
		}

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
		return "\n-----------------------------------" + "\nNome aluno: "
				+ this.nomeAluno + "\nNúmero matrícula :"
				+ this.numeroMatricula;
	}

}
