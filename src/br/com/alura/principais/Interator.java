package br.com.alura.principais;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Interator {

	public static void main(String[] args) {
		
		List<String> letras = new LinkedList<>();
		letras.add("A");
		letras.add("B");
		letras.add("C");
		
		Iterator<String> it = letras.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
