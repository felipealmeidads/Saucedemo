package br.com.saucedemo.siteSaucedemo.steps.web;

import br.com.saucedmo.web.interfaces.LoginWebFuncionalidade;
import br.com.saucedmo.web.interfaces.ProdutosWebFuncionalidade;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

public class ProdutosWebSteps {

	private ProdutosWebFuncionalidade produtosWebFuncionalidade;
	private LoginWebFuncionalidade loginWebFuncionalidade;
	
	public ProdutosWebSteps() {
		this.produtosWebFuncionalidade = new ProdutosWebFuncionalidade();
		this.loginWebFuncionalidade = new LoginWebFuncionalidade();
	}
	
	@Dado("^que realizo o login no sistema$")
	public void queRealizoOLoginNoSistema() {
		this.loginWebFuncionalidade.fazLogin();
		this.loginWebFuncionalidade.clicaLogin();
	}
	
	@E("^adiciono o primeiro produto visivel$")
	public void adicionoOPrimeiroProdutoVisivel() {
		this.produtosWebFuncionalidade.adicionaPrimeiro();
	}

	@E("^filtro os produto mais caros$")
	public void filtroOsProdutoMaisCaros() {
		this.produtosWebFuncionalidade.selecionaFiltro();
	}

	@E("^adiciono o primeiro produto da lsita$")
	public void adicionoOPrimeiroProdutoDaLsita() {
		this.produtosWebFuncionalidade.adicionaSegundo();
	}

	@Quando("^clico no carrinho de compras$")
	public void clicoNoCarrinhoDeCompras() {
		this.produtosWebFuncionalidade.clicaCarrinho();
	}

	@Entao("^visualizo \"([^\"]*)\"$")
	public void visualizo(String mensagemCarrinho) {
		Assert.assertEquals("Your Cart", this.produtosWebFuncionalidade.pegaMsg());
	}

}
