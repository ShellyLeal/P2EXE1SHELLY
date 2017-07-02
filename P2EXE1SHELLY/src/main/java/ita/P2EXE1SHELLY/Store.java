package ita.P2EXE1SHELLY;

import java.util.ArrayList;

import ita.P2EXE1SHELLY.Comprador.situaçãodevenda;

public class Store {
	DadosMock dadosmock;
	Comprador comprador;
	
	
	
	public Store (DadosMock bdb, Comprador ubd) {
		this.dadosmock = bdb;
		this.comprador = ubd;
		
		
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
	
	
	
	
	
	public situaçãodevenda checkSellingStatus (String bname) {
		return comprador.checkSellingStatus(bname);
	}
}