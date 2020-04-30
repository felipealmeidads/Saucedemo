package br.com.saucedmo.configuration;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * 
 * @author felipe.silva
 * @since 2020-04-15
 * 
 */

public enum Web implements WebApplication {
	
	CHROME_WINDOWS {
		
		@Override
		public WebDriver getDriver() {
			System.setProperty("webdriver.chrome.driver", "chromedriver80-windows/chromedriver.exe");
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			return new ChromeDriver(options);
		}
	}
}
