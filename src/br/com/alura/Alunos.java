package br.com.alura;

import java.util.*;

public class Alunos {

	private String nomeAluno;
	private Integer numeroMatricula;
	private int matriculaLimite = 10000;

	public Alunos(String nomeAluno, Integer numeroMatricula) {
		if (nomeAluno == null) {
			throw new NullPointerException("Nome não pode ser null");
		}
		this.nomeAluno = nomeAluno;
		if (numeroMatricula < matriculaLimite) {
			throw new NullPointerException("Valor de Entrada pequeno");
		}else if (numeroMatricula >= 15000) {
			throw new NullPointerException("VALOR DE ENTRADA ACIMA!!");			
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alunos other = (Alunos) obj;
		if (nomeAluno == null) {
			if (other.nomeAluno != null)
				return false;
		} else if (!nomeAluno.equals(other.nomeAluno))
			return false;
		if (numeroMatricula == null) {
			if (other.numeroMatricula != null)
				return false;
		} else if (!numeroMatricula.equals(other.numeroMatricula))
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nomeAluno == null) ? 0 : nomeAluno.hashCode());
		result = prime * result
				+ ((numeroMatricula == null) ? 0 : numeroMatricula.hashCode());
		return result;
	}
}
