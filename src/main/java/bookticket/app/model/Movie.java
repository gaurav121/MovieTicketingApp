/**
 * 
 */
package bookticket.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author gyadav
 *
 */

@XmlRootElement
@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="movieid")
	private long movieID;
	
	private long movieLength; 
	
	
	@ElementCollection
	@Column(name="moviecast")
	private List<String> cast;
	
	private String language;
	
	private String city;
	
	private String moviename;
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}



	public long getMovieID() {
		return movieID;
	}



	public void setMovieID(long movieID) {
		this.movieID = movieID;
	}



	public long getMovieLength() {
		return movieLength;
	}



	public void setMovieLength(long movieLength) {
		this.movieLength = movieLength;
	}



	public List<String> getCast() {
		return cast;
	}



	public void setCast(List<String> cast) {
		this.cast = (ArrayList<String>) cast;
	}



	public String getLanguage() {
		return language;
	}



	public void setLanguage(String language) {
		this.language = language;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getMoviename() {
		return moviename;
	}



	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	
	
	
}
