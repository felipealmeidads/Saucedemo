package br.com.saucedmo.commons;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesManager {
	
	public static String getPropertiesValue(String valor) {
		Properties properties = new Properties();
		File file = new File("C:\\Users\\felipe.silva\\Projetos_eclipse\\projeto-saucedemo\\projeto-saucedemo\\src\\main\\resources");
		try {
			properties.load(new FileInputStream(file.getAbsolutePath()+"/application.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(valor);
	}

}