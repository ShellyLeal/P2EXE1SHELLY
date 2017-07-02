package ita.P2EXE1SHELLY;

public class MockComprador implements Comprador {

	public boolean LogIn(String userName) {
		return true;
	}

	public void LogOut() {
		
	}

	public void addBookToLaterSells(Livraria book) {
		
		
	}

	public situaçãodevenda checkSellingStatus(String bname) {
		
		return situaçãodevenda.ARRIVED;
	}

}