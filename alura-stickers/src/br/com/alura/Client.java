package br.com.alura;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Client {

    private URI uri;
    private HttpClient client;
    private HttpRequest request;
    
    
    public Client(String endpoint) {
		this.uri = URI.create(endpoint);
		this.connection();
	}

	private void connection() {
		this.client = HttpClient.newHttpClient();
		this.request = HttpRequest.newBuilder(uri).GET().build();
	}
	
	public HttpResponse<String> response(){
		
		try {
			
			HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
			return response;
		
		} catch(IOException | InterruptedException ex) {
			System.out.println(ex.getMessage());
		}
		
		return null;
	}
}
