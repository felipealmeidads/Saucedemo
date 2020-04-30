package br.com.saucedmo.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWebPage {

	public LoginWebPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(id = "user-name")
	private WebElement inputUsername;
	
	@FindBy(id = "password")
	private WebElement inputPasssword;
	
	@FindBy(xpath = "//input[@value='LOGIN']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//div[@class='product_label']")
	private WebElement visualizaProducts;

	public WebElement getVisualizaProducts() {
		return visualizaProducts;
	}

	public WebElement getInputUsername() {
		return inputUsername;
	}
	
	public WebElement getInputPasssword() {
		return inputPasssword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
}
