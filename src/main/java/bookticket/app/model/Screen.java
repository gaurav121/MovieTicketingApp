package bookticket.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="screen")
public class Screen {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int screenID;
	
	private int totalSeats;

	private int bookedSeats;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="theatreID")
	private MovieTheatre theatreID;
	
	public Screen() {

	System.out.println("screen created");
	}

	public int getScreenID() {
		return screenID;
	}

	public void setScreenID(int screenID) {
		this.screenID = screenID;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public int getBookedSeats() {
		return bookedSeats;
	}

	public void setBookedSeats(int bookedSeats) {
		this.bookedSeats = bookedSeats;
	}
	
	
	
	
}
