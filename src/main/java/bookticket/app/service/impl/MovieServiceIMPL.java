/**
 * 
 */
package bookticket.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import bookticket.app.DAO.MovieDAO;
import bookticket.app.DTO.MovieDTO;
import bookticket.app.model.Movie;
import bookticket.app.service.MovieService;
import javassist.bytecode.Descriptor.Iterator;


/**
 * @author gyadav
 *
 *17-Apr-2018 
 *BookMyShow
 */

@org.springframework.stereotype.Service
public class MovieServiceIMPL implements MovieService{


	@Autowired
	MovieDAO movieDAO;

	@Override
	public List<MovieDTO> getallMovies() {

		System.out.println("In service ");
		
		List<Movie> movielist=movieDAO.findAll();
		System.out.println("In service "+movielist);
		List<MovieDTO> movielistDTO=new ArrayList<MovieDTO>();
		
		java.util.Iterator<Movie> itr=movielist.iterator();
		
		while(itr.hasNext()) {
			
			Movie temp=itr.next();
			MovieDTO dtotemp=new MovieDTO();
			dtotemp.setCast(temp.getCast());
			dtotemp.setMoviename(temp.getMoviename());
			dtotemp.setLanguage(temp.getLanguage());
			dtotemp.setMovieID(temp.getMovieID());
			dtotemp.setMovieLength(temp.getMovieLength());
			
			
			
			movielistDTO.add(dtotemp);
			
			System.out.println("->"+dtotemp);
		}
		
		
		
		return movielistDTO;
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
