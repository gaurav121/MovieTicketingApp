/**
 * 
 */
package bookticket.app.model;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author gyadav
 *
 */
public class Movie {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int movieID;
	
	private int movieLength; 
	
	private List<String> cast;
	
	private String language;
	
	
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}



	public int getMovieID() {
		return movieID;
	}



	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}



	public int getMovieLength() {
		return movieLength;
	}



	public void setMovieLength(int movieLength) {
		this.movieLength = movieLength;
	}



	public List<String> getCast() {
		return cast;
	}



	public void setCast(List<String> cast) {
		this.cast = cast;
	}



	public String getLanguage() {
		return language;
	}



	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	
}
