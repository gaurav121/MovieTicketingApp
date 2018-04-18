
package bookticket.app.service;

import org.springframework.security.core.userdetails.User;

import bookticket.app.model.MovieTheatre;

/**
 * @author gyadav
 *
 *17-Apr-2018 
 *BookMyShow
 */
public interface MovieTheatreService {

	public int bookMovie(MovieTheatre theatre, User usr);
	
	public MovieTheatre checkTheatreStatus(int theatreID);
	
	
}
