package br.com.saucedmo.web.interfaces;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

import br.com.saucedmo.commons.BaseTest;
import br.com.saucedmo.web.pages.CompraWebPage;

public class CompraWebFuncionalidade extends BaseTest {

	private CompraWebPage compraWebPage;
	
	public CompraWebFuncionalidade() {
		this.compraWebPage = new CompraWebPage(webDriver);
	}
	
	public void fazCheckout() {
		wait.until(ExpectedConditions.elementToBeClickable(this.compraWebPage.getBtnCheckout()));
		this.compraWebPage.getBtnCheckout().click();
	}
	
	public void insereInfo() {
		wait.until(ExpectedConditions.elementToBeClickable(this.compraWebPage.getInputName()));
		this.compraWebPage.getInputName().sendKeys("Sagiri");
		this.compraWebPage.getInputLastName().sendKeys("Kanna");
		this.compraWebPage.getInputZipCode().sendKeys("06657130");
	}
	
	public void clicaContinue() {
		wait.until(ExpectedConditions.elementToBeClickable(this.compraWebPage.getBtnContinue()));
		this.compraWebPage.getBtnContinue().click();
	}
	
	public void clicaFinish() {
		JavascriptExecutor jse = (JavascriptExecutor) webDriver;
        jse.executeScript("window.scrollBy(0, 250)");
        wait.until(ExpectedConditions.elementToBeClickable(this.compraWebPage.getBtnFinish()));
        this.compraWebPage.getBtnFinish().click();
	}
	
	public String msgCompra() {
		return this.compraWebPage.getMsgCompra().getText();
	}
}
