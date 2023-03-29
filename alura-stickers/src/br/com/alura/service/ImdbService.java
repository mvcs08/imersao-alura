package br.com.alura.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.alura.ImdbClient;
import br.com.alura.models.Movie;
import br.com.alura.utils.JsonParser;

public class ImdbService {

	private List<Map<String, String>> dataMovies;
	private String movies;
	
	
	public ImdbService() {
		request();
		parseData();
	}
	
	private void request() {
		ImdbClient client = new ImdbClient();
		movies = client.getData();
	}
	
	private void parseData() {
		JsonParser parse = new JsonParser();
		dataMovies = parse.parse(movies);
	}
	
	public ArrayList<Movie> getMovies(){
		ArrayList<Movie> moviesList = new ArrayList<>();
		
		for(Map<String, String> movieInList : dataMovies) {
			Movie movie = new Movie(movieInList);
			moviesList.add(movie);
		}
		
		return moviesList;
	}

	

}
