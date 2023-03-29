package br.com.alura.models;

import java.util.Map;

public class Movie {

	private String title;
	private String image;
	private String rating;
	
	
	
	public Movie(Map<String, String> movie) {
		title = movie.get("title");
		image = movie.get("image");
		rating = movie.get("imDbRating");
	}



	public String getTitle() {
		return title;
	}



	public String getImage() {
		return image;
	}



	public String getRating() {
		return rating;
	}
	
	
	
}
