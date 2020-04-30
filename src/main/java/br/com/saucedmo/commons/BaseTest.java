package br.com.saucedmo.commons;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.saucedmo.configuration.WebApplication;

/**
 * 
 * @author felipe.silva
 *
 */

public class BaseTest {
	
	protected static WebDriver webDriver;
	protected static WebDriverWait wait;

	/**
	 * Inicializa o navegador {@code WebDriver} e o {@code WebDriverWait}
	 */
	protected void inicializaWebApplication(WebApplication webApplication) {
		webDriver = webApplication.getDriver();
		webDriver.manage().window().maximize();
		webDriver.get(PropertiesManager.getPropertiesValue("URL_SDEMO"));
		wait = new WebDriverWait(webDriver, 80);
	}
	
	/**
	 * Finaliza o Driver Web
	 */
	protected static void closeWeb() {
		webDriver.quit();
	}
}
