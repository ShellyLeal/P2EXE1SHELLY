package ita.P2EXE1SHELLY;

import static org.junit.Assert.*;

import java.util.ArrayList;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
public class LivrariaTeste {

	DadosMock dadosmock = new DadosMock();
	  MockComprador mockcomprador = new MockComprador();
	  Store s = new Store(dadosmock, mockcomprador);
	  ArrayList<Livraria> listalivros;

	  @Given("^Uma lista de livros$")
	  public void given() throws Throwable {
		 
	  }

	  @When("^Comprador faz uma busca$")
	  public void when(float price) throws Throwable {
		  listalivros = s.buscaPorPreco(price);
	  }

	  @Then("^O comprador encontra o livro certo$")
	  public void then(ArrayList<Livraria> books) throws Throwable {
		  assertThat(books.get(0).getName(), is(listalivros.get(0).getName()));
		  assertThat(books.get(0).getPrice(), is(listalivros.get(0).getPrice()));
	  }

}
