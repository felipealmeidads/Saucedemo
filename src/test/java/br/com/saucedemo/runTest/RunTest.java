package br.com.saucedemo.runTest;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import br.com.saucedmo.commons.BaseTest;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

/**
 * 
 * @author felipe.silva
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, snippets = SnippetType.CAMELCASE, plugin = { "pretty", "json:target/cucumber.json" },
 features = { ".//src//test//resources//features" }, 
 glue = { "br.com.saucedemo.siteSaucedemo.steps.web", "br.com.saucedmo.configuration" },
 tags = {"@loginSaucedemo, @produtosSaucedemo, @compraSaucedemo"})

public class RunTest extends BaseTest {
	
	@AfterClass
	public static void AfterTests() {
		if(webDriver != null) {
			closeWeb();
		}
	}
}