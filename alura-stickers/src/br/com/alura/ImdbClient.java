package br.com.alura;


import java.util.Properties;

public class ImdbClient {

	private Properties prop = ArquivoPropertie.getProps();
	private Client client;
	@SuppressWarnings("unused")
	private String response;
	
	
	public ImdbClient() {
		this.client = new Client(prop.getProperty("prop.endpoint"));
	}
	
	public String getData() {
		return this.response = client.response().body();
	}
	
}
