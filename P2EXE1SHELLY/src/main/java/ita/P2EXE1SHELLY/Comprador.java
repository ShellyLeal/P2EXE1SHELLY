package ita.P2EXE1SHELLY;

public interface Comprador {
	
	
	void addBookToLaterSells(Livraria book);
	enum situaçãodevenda {NONE, SENT, ARRIVED};
	situaçãodevenda checkSellingStatus(String bname);

}
