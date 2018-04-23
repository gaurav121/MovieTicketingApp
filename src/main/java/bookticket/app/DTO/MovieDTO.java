package bookticket.app.DTO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import bookticket.app.model.Movie;

public class MovieDTO {

	private long movieID;
	
	private long movieLength; 
	
	private List<String> cast;
	
	private String language;
	private String moviename;

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
		this.cast = cast;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "MovieDTO [movieID=" + movieID + ", movieLength=" + movieLength + ", cast=" + cast + ", language="
				+ language + "]";
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	
	
	
	
}
