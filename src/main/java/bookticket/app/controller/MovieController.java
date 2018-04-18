/**
 * 
 */
package bookticket.app.controller;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import bookticket.app.model.Movie;
import bookticket.app.service.MovieService;

/**
 * @author gyadav
 *
 *17-Apr-2018 
 *BookMyShow
 */
@Controller
@RequestMapping("/movie")
public class MovieController {
	
	@Autowired
	MovieService movieService;
	
	
	@RequestMapping("/movieslist")
	public String getallMovies(Model model) {
		
		List<Movie> movies=movieService.getallMovies();
	
		model.addAttribute("movielist", movies);
		return "movielist";		
	}

}
