package br.com.saucedmo.web.interfaces;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import br.com.saucedmo.commons.BaseTest;
import br.com.saucedmo.web.pages.ProdutosWebPage;

public class ProdutosWebFuncionalidade extends BaseTest {
	
	private ProdutosWebPage produtosWebPage;
	
	//CONSTRUTOR
	public ProdutosWebFuncionalidade() {
		this.produtosWebPage = new ProdutosWebPage(webDriver);
	}
	
	public void adicionaPrimeiro() {
		wait.until(ExpectedConditions.elementToBeClickable(this.produtosWebPage.getAdicionaProduto1()));
		this.produtosWebPage.getAdicionaProduto1().click();
	}
	
	public void selecionaFiltro() {
		Select seleciona = new Select(this.produtosWebPage.getFiltraProdutos());
		seleciona.selectByVisibleText("Price (high to low)");
	}
	
	public void adicionaSegundo() {
		wait.until(ExpectedConditions.elementToBeClickable(this.produtosWebPage.getAdicionaProduto2()));
		this.produtosWebPage.getAdicionaProduto2().click();
	}
	
	public void clicaCarrinho() {
		wait.until(ExpectedConditions.elementToBeClickable(this.produtosWebPage.getClicaCarrinho()));
		this.produtosWebPage.getClicaCarrinho().click();
	}
	
	public String pegaMsg() {
		wait.until(ExpectedConditions.visibilityOf(this.produtosWebPage.getVisualizaMsg()));
		return this.produtosWebPage.getVisualizaMsg().getText();
	}
}
