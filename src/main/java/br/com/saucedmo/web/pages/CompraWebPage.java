package br.com.saucedmo.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompraWebPage {
	
	public CompraWebPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(xpath = "//a[@class='btn_action checkout_button']")
	private WebElement btnCheckout;
	
	@FindBy(id = "first-name")
	private WebElement inputName;
	
	@FindBy(id = "last-name")
	private WebElement inputLastName;
	
	@FindBy(id = "postal-code")
	private WebElement inputZipCode;
	
	@FindBy(xpath = "//input[@value='CONTINUE']") 
	private WebElement btnContinue;
	
	@FindBy(xpath = "//a[@class='btn_action cart_button']") 
	private WebElement btnFinish;
	
	@FindBy(xpath = "//h2[@class='complete-header']")  //MENSAGEM EXIBIDA AO FINALIZAR A COMPRA
	private WebElement msgCompra;

	public WebElement getBtnCheckout() {
		return btnCheckout;
	}

	public WebElement getInputName() {
		return inputName;
	}

	public WebElement getInputLastName() {
		return inputLastName;
	}

	public WebElement getInputZipCode() {
		return inputZipCode;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getBtnFinish() {
		return btnFinish;
	}

	public WebElement getMsgCompra() {
		return msgCompra;
	}
	
}
