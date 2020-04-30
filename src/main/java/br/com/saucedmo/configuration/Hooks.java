package br.com.saucedmo.configuration;

import br.com.saucedmo.commons.BaseTest;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * 
 * @author felipe.silva
 * @since 2020-04-15
 * 
 */

public class Hooks extends BaseTest {
	
	@Before(value = "@startWeb")
	public void beforeStartWebWindows() {
		System.out.println("Teste de execução Hooks Web");
		inicializaWebApplication(Web.CHROME_WINDOWS);
	}
	
	@After(value = "@startWeb")
	public void afterStartWebWindows(Scenario scenario ) {
		closeWeb();
	}
}
