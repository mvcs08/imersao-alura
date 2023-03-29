package br.com.alura;

import java.util.ArrayList;

import br.com.alura.models.Movie;
import br.com.alura.service.ImdbService;

public class App {

	
	public static void main(String[] args) throws Exception{
		
		ImdbService service = new ImdbService();
		ArrayList<Movie> movies = service.getMovies();
		
		for (Movie movie : movies) {
			System.out.println(movie.getTitle());
			System.out.println(movie.getImage());
			System.out.println(movie.getRating());
			System.out.println();
		}
		
		
	}
}
