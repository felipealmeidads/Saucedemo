package br.com.saucedmo.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProdutosWebPage {
	
	public ProdutosWebPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(xpath = "//button[@class='btn_primary btn_inventory']")
	private WebElement adicionaProduto1;
	
	@FindBy(xpath = "//select[@class='product_sort_container']")
	private WebElement filtraProdutos;

	@FindBy(xpath = "//button[@class='btn_primary btn_inventory']")
	private WebElement adicionaProduto2;
	
	@FindBy(xpath = "//div[@class='shopping_cart_container']")
	private WebElement clicaCarrinho;
	
	@FindBy(xpath = "//div[@class='subheader']")
	private WebElement visualizaMsg;
	
	public WebElement getAdicionaProduto1() {
		return adicionaProduto1;
	}

	public WebElement getFiltraProdutos() {
		return filtraProdutos;
	}

	public WebElement getAdicionaProduto2() {
		return adicionaProduto2;
	}

	public WebElement getClicaCarrinho() {
		return clicaCarrinho;
	}

	public WebElement getVisualizaMsg() {
		return visualizaMsg;
	}
	
}
