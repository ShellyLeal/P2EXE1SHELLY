package ita.P2EXE1SHELLY;

public class MockComprador implements Comprador {


	public situaçãodevenda checkSellingStatus(String bname) {
		
		return situaçãodevenda.ARRIVED;
	}

}