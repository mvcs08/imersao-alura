package br.com.alura;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ArquivoPropertie {

	private static String path = "C:\\Users\\Vinicius\\eclipse-workspace\\alura-stickers\\src\\properties\\dados.properties";
	private static Properties prop;

	
	public static Properties getProps(){
		prop = new Properties();
		try {
			FileInputStream file = new FileInputStream(path);
			prop.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
		
}
