/**
 * 
 */
package bookticket.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author gyadav
 *
 */

@Entity
@Table(name="movietheatre")
public class MovieTheatre {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int theatreID;
	
	@NotNull
	private String theatreName;
	
	@NotNull
	private String city;
	
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="screenID")
	private List<Screen> screenID;


	public int getTheatreID() {
		return theatreID;
	}


	public void setTheatreID(int theatreID) {
		this.theatreID = theatreID;
	}


	public String getTheatreName() {
		return theatreName;
	}


	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public List<Screen> getScreenID() {
		return screenID;
	}


	public void setScreenID(List<Screen> screenID) {
		this.screenID = screenID;
	}
	
	
	
	
}