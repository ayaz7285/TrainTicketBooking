package com.ayaz.tickets;
import java.util.List;
import com.ayaz.trains.Train;
import com.ayaz.users.Passenger;

public class Ticket {
	private int pnr;
	private Train train;
	private List<Passenger> passengers;
	
	public Ticket(int pnr, Train train, List<Passenger> passengers) {
		super();
		this.pnr = pnr;
		this.train = train;
		this.passengers = passengers;
	}
	public int getPnr() {
		return pnr;
	}
	public Train getTrain() {
		return train;
	}
	public List<Passenger> getPassengers() {
		return passengers;
	}
}
