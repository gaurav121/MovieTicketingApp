/**
 * 
 */
package bookticket.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import bookticket.app.DTO.MovieDTO;
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
		
		List<MovieDTO> movies=movieService.getallMovies();
		System.out.println("Movie list is "+movies);
		model.addAttribute("movielist", movies);
		model.addAttribute("test", "My name is Khan");
		model.addAttribute("testing2", "Logi aagye");
		
		return "movielist";		
	}

	@GetMapping("/showMovieList")
	@ResponseBody
	public  String getallMoviesList(Model model) {
		
		List<MovieDTO> movies=movieService.getallMovies();
	
		model.addAttribute("movielist", movies);
		return "welcomedude";		
	}

	
	@GetMapping("/bookMovie")
	public  String BookMovie(Model model,@ModelAttribute("movieID") int movieid) {
		
		System.out.println("Booking Movie"+movieid);
		//List<MovieDTO> movies=movieService.getallMovies();
	
//		model.addAttribute("movielist", movies);
		return "welcomedude";		
	}
	
	@RequestMapping(value="testform",method=RequestMethod.GET)
	public String test(Model model) {
		
	
		
		return "welcomedude";
		
		
		
	}
	
	
}
