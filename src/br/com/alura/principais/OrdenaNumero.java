package br.com.alura.principais;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import br.com.alura.Funcionario;

public class OrdenaNumero {
	public static void main(String[] args) {
		

		Funcionario f1 = new Funcionario("laisa Karoline", 19);
		Funcionario f2 = new Funcionario("Uires Deivide", 19);
		Funcionario f3 = new Funcionario("Raiumundo dos Santos", 19);
		
		
		
		Set<Funcionario> funcionarios  = new TreeSet<>(new OrdenaComparete());
		
	
		
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);
		
		Iterator<Funcionario> iterator = funcionarios.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next().getNome());
		}
		
		
		
	}

}
