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
	private long screenID;
	
	private long totalSeats;

	private long bookedSeats;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="theatreID")
	private MovieTheatre theatreID;
	
	public Screen() {

	System.out.println("screen created");
	}

	public long getScreenID() {
		return screenID;
	}

	public void setScreenID(long screenID) {
		this.screenID = screenID;
	}

	public long getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(long totalSeats) {
		this.totalSeats = totalSeats;
	}

	public long getBookedSeats() {
		return bookedSeats;
	}

	public void setBookedSeats(long bookedSeats) {
		this.bookedSeats = bookedSeats;
	}
	
	
	
	
}
