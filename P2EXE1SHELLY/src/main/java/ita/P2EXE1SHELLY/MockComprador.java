package ita.P2EXE1SHELLY;

public class MockComprador implements Comprador {


	public situaçãodevenda checkSellingStatus(String livro) {
		
		return situaçãodevenda.ARRIVED;
	}

}
