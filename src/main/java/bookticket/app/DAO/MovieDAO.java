package bookticket.app.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bookticket.app.model.Movie;

@Repository
@Transactional
public interface MovieDAO extends JpaRepository<Movie, Long>{


	public List<Movie> findAll();

	public Movie findByMovieID(int movieID);
	
	public Movie findByCity(String city);
	
	//public Movie addnewMovie(Movie movie);
	
	//public Movie update(Movie movie);
	
	
}
