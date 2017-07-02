package ita.P2EXE1SHELLY;

import java.util.ArrayList;

public class DadosMock extends Dados {
	
	
	DadosMock () {
		books = new ArrayList<Livraria>();
		
		books.add(new Livraria("Livro1" , 1, 5.4f));
		books.add(new Livraria("Livro2" , 5, 12.6f));
		books.add(new Livraria("Livro3" , 8, 6.5f));
		
	}
	public void rate(String nomeLivro, int rate) {
		
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getName().equals(nomeLivro) &&
					books.get(i).quantidadeEstoque() > 0) {
				books.get(i).rate(rate);
			}
		}
	}

	public void review(String nomeLivro, String review) {
		
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getName().equals(nomeLivro) &&
					books.get(i).quantidadeEstoque() > 0) {
				books.get(i).review(review);
			}
			else
				System.out.println("Livro não encontrado no estoque");
		}
	}
	public ArrayList<Livraria> buscaPorAvaliacoes(int numEstrelasMin) {
		ArrayList<Livraria> res = new ArrayList<Livraria>();
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).avaliacaoMedia() >= numEstrelasMin) {
				res.add(books.get(i));
			}
			else
				System.out.println("Nenhum livro encontrado no estoque");
		}

		return res;
	}

	public ArrayList<Livraria> buscaPorNome(String name) {
		ArrayList<Livraria> res = new ArrayList<Livraria>();
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getName().contains(name)) {
				res.add(books.get(i));
			}
		}

		return res;
	}
	
	public ArrayList<Livraria> buscaPorPreco (float price) {
		ArrayList<Livraria> res = new ArrayList<Livraria>();
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getPrice() < price) {
				res.add(books.get(i));
			}
		}

		return res;
	}

	public boolean livroVendido(String name) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getName().equals(name) &&
					books.get(i).quantidadeEstoque() > 0) {
				books.get(i).livroVendido();
				return true;
			}
		}
		return false;
	}

	
}