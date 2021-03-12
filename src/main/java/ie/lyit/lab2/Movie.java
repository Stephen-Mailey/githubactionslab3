/**
 * 
 */
package ie.lyit.lab2;

import java.util.ArrayList;

/**
 * @author Stephen.Mailey
 *
 */
public class Movie {
	
	private ArrayList<String> movies;
	
	public Movie() {
		this.movies = new ArrayList<>();
	}
	
	public ArrayList<String> movieSelection() {
		return this.movies;
	}
	
	public void add(String movie) {
		this.movies.add(movie);
	}
	
	

}
