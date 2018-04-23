package bookticket.app.service;

import java.util.List;

import bookticket.app.DTO.MovieDTO;
import bookticket.app.model.Movie;

/**
 * @author gyadav
 *
 *17-Apr-2018 
 *BookMyShow
 */


public interface MovieService {

	public List<MovieDTO> getallMovies();
	
	public Movie getMovieDetails(int movieID);
	
	public Movie getMoviebyCity(String city);
	
	public Movie addnewMovie(Movie movie);
	
	public Movie updateMovie(Movie movie);
	
	
}
