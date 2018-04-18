package bookticket.app.DAO;

import org.springframework.security.core.userdetails.User;

import bookticket.app.model.MovieTheatre;

public interface MovieTheatreDAO {

	public int bookMovie(MovieTheatre theatre, User usr);
	
	public MovieTheatre checkTheatreStatus(int theatreID);
	
}
