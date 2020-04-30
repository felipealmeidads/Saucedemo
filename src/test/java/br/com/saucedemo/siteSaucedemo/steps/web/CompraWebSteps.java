package br.com.saucedemo.siteSaucedemo.steps.web;

import br.com.saucedmo.web.interfaces.CompraWebFuncionalidade;
import br.com.saucedmo.web.interfaces.LoginWebFuncionalidade;
import br.com.saucedmo.web.interfaces.ProdutosWebFuncionalidade;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

public class CompraWebSteps {
	
	private CompraWebFuncionalidade compraWebFuncionalidade;
	private LoginWebFuncionalidade loginWebFuncionalidade;
	private ProdutosWebFuncionalidade produtosWebFuncionalidade;
	
	public CompraWebSteps() {
		compraWebFuncionalidade = new CompraWebFuncionalidade();
		loginWebFuncionalidade = new LoginWebFuncionalidade();
		produtosWebFuncionalidade = new ProdutosWebFuncionalidade();
	}
	
	@Dado("^que adiciono um produto ao carrinho$")
	public void queAdicionoUmProdutoAoCarrinho() {
		this.loginWebFuncionalidade.fazLogin(); this.loginWebFuncionalidade.clicaLogin();
		this.produtosWebFuncionalidade.adicionaPrimeiro();
	}

	@E("^acesso o carrinho$")
	public void acessoOCarrinho() {
		this.produtosWebFuncionalidade.clicaCarrinho();
	}

	@E("^clico em 'CHECKOUT'$")
	public void clicoEmCHECKOUT() {
		this.compraWebFuncionalidade.fazCheckout();
	}

	@E("^preencho as informacoes$")
	public void preenchoAsInformacoes() {
		this.compraWebFuncionalidade.insereInfo();
	}

	@E("^clico em 'CONTINUE'$")
	public void clicoEmCONTINUE() {
		this.compraWebFuncionalidade.clicaContinue();
	}

	@Quando("^clico em 'FINISH'$")
	public void clicoEmFINISH() {
		this.compraWebFuncionalidade.clicaFinish();
	}

	@Entao("^exibe na tela \"([^\"]*)\"$")
	public void exibeNaTela(String mensagemCompra) {
		Assert.assertEquals("THANK YOU FOR YOUR ORDER", this.compraWebFuncionalidade.msgCompra());
	}
	
}
