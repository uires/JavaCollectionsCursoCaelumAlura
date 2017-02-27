package br.com.alura.principais;

import java.util.Comparator;

import br.com.alura.Funcionario;

public class OrdenaComparete implements Comparator<Funcionario>{
	  
	@Override
	    public int compare(Funcionario funcionario, Funcionario outroFuncionario) {
	        return funcionario.getIdade() - outroFuncionario.getIdade();
	    }

	
	
}
