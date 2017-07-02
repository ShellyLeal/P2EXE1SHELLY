package ita.P2EXE1SHELLY;

public interface Comprador {
	
	
	
	enum situaçãodevenda {NONE, SENT, ARRIVED};
	situaçãodevenda checkSellingStatus(String bname);

}
