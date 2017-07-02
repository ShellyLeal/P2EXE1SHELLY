package ita.P2EXE1SHELLY;

public interface Comprador {
	enum situaçãodevenda {NONE, SENT, ARRIVED}; // basic enum for book situation for purchaser
	situaçãodevenda checkSellingStatus(String livro);

}
