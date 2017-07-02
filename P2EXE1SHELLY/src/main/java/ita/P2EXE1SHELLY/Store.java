package ita.P2EXE1SHELLY;

import java.util.ArrayList;

import ita.P2EXE1SHELLY.Comprador.situaçãodevenda;

public class Store {
	DadosMock dadosmock;
	Comprador comprador;
	
	
	
	public Store (DadosMock dadosmoc, Comprador comprador) {
		this.dadosmock = dadosmock;
		this.comprador = comprador;
		
		
	}
	
	public void review (String livro, String review) {
		
		dadosmock.review (livro, review);
	}
	
	public void rate (String livro, int rate) {
		
		dadosmock.rate (livro, rate);
	}

	
	public ArrayList<Livraria> buscaPorAvaliacoes(int numEstrelasMin) {
		
		return dadosmock.buscaPorAvaliacoes((numEstrelasMin));
	}
	
	public ArrayList<Livraria> buscaPorNome(String name) {
		
		return dadosmock.buscaPorNome(name);
	}
	
	public ArrayList<Livraria> buscaPorPreco(float price) {
		
		return dadosmock.buscaPorPreco(price);
	}
	
	public boolean buy (String name) {
			
		return dadosmock.livroVendido(name);
	}
	
	
	public situaçãodevenda checkSellingStatus (String livro) {
		return comprador.checkSellingStatus(livro);
	}
	
	
}
