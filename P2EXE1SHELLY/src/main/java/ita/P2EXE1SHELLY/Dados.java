package ita.P2EXE1SHELLY;

import java.util.ArrayList;

public abstract class Dados {
	ArrayList<Livraria> books;
	
	abstract void rate(String livro, int rate);
	abstract void review(String livro, String review);
	
	abstract ArrayList<Livraria> buscaPorAvaliacoes(int numEstrelasMin);

	abstract ArrayList<Livraria> buscaPorNome(String name);

	abstract ArrayList<Livraria> buscaPorPreco(float price);

	abstract boolean livroVendido(String name);

	
}
