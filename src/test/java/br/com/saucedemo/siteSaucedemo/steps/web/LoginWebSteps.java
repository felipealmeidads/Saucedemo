package br.com.saucedemo.siteSaucedemo.steps.web;

import br.com.saucedmo.web.interfaces.LoginWebFuncionalidade;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import org.junit.Assert;

public class LoginWebSteps {
	
	private LoginWebFuncionalidade loginWebFuncionalidade;
	
	public LoginWebSteps() {
		this.loginWebFuncionalidade = new LoginWebFuncionalidade();
	}

	@Dado("^que preencho os campos com login e senha validos$")
	public void quePreenchoOsCamposComLoginESenhaValidos() {
		this.loginWebFuncionalidade.fazLogin();
	}
	
	@E("^clico no botao de 'LOGIN'$")
	public void clicoNoBotaoDeLOGIN() {
		this.loginWebFuncionalidade.clicaLogin();
	}

	@Então("^visualizo a pagina de \"([^\"]*)\"$")
	public void visualizoAPaginaDe(String mensagemLogin) {
		Assert.assertEquals("Products", this.loginWebFuncionalidade.visualizaLogin());
	}

}
