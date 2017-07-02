package ita.P2EXE1SHELLY;

import java.util.ArrayList;

public class Livraria {
	private String name;
	int totalEstrelas;
	int numeroAvaliadores;
	int numLivros;
	float price;
	ArrayList<String> reviews;
	
	public Livraria (String name, int qnt, float price) {
		numeroAvaliadores = 0;
		totalEstrelas = 0;
		this.name = name;
		this.numLivros = qnt;
		this.price = price;
		reviews = new ArrayList<String>();
	}
	
	public void rate (int avaliacao) {
		
		numeroAvaliadores++;
		totalEstrelas += avaliacao;
	}
	public float avaliacaoMedia () {
		return totalEstrelas / numeroAvaliadores;
	}
	
	public String getName () {
		return name;
	}
	
	void livroVendido () {
		if (numLivros != 0)
			numLivros--;
	}
	
	float getPrice () {
		return price;
	}
	public void review (String comentario) {
		reviews.add(comentario);
	}
	
	int quantidadeEstoque () {
		return numLivros;
	}
}
