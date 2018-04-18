/**
 * 
 */
package bookticket.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import bookticket.app.DAO.MovieDAO;
import bookticket.app.model.Movie;
import bookticket.app.service.MovieService;

/**
 * @author gyadav
 *
 *17-Apr-2018 
 *BookMyShow
 */
public class MovieServiceIMPL implements MovieService{


	@Autowired
	MovieDAO movieDAO;

	@Override
	public List<Movie> getallMovies() {
		return movieDAO.getAllMovie();
	}

	@Override
	public Movie getMovieDetails(int movieID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie getMoviebyCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie addnewMovie(Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie updateMovie(Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
