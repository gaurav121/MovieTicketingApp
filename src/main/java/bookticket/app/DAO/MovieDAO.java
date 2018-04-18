package bookticket.app.DAO;

import java.util.List;

import bookticket.app.model.Movie;

public interface MovieDAO {


	public List<Movie> getAllMovie();

	public Movie getMovieDetails(int movieID);
	
	public Movie getMoviebyCity(String city);
	
	public Movie addnewMovie(Movie movie);
	
	public Movie updateMovie(Movie movie);
	
	
}
