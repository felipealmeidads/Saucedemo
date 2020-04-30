package br.com.saucedmo.web.interfaces;

import org.openqa.selenium.support.ui.ExpectedConditions;

import br.com.saucedmo.commons.BaseTest;
import br.com.saucedmo.web.pages.LoginWebPage;

public class LoginWebFuncionalidade extends BaseTest {
	
	private LoginWebPage loginWebPage;

	//CONSTRUTOR
	public LoginWebFuncionalidade() {
		this.loginWebPage = new LoginWebPage(webDriver);
	}
	
	public void fazLogin() {		
		this.loginWebPage.getInputUsername().sendKeys("standard_user");
		this.loginWebPage.getInputPasssword().sendKeys("secret_sauce");
	}
	
	public void clicaLogin() {
		wait.until(ExpectedConditions.elementToBeClickable(this.loginWebPage.getBtnLogin()));
		this.loginWebPage.getBtnLogin().click();
	}
	
	public String visualizaLogin() {
		wait.until(ExpectedConditions.visibilityOf(this.loginWebPage.getVisualizaProducts()));
		return this.loginWebPage.getVisualizaProducts().getText();
	}
}
