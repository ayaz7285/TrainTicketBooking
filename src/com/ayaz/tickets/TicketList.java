package com.ayaz.tickets;

import java.util.ArrayList;
import java.util.List;

public class TicketList {
	private static List<Ticket> ticketDB = new ArrayList<Ticket>();

	public static List<Ticket> getTicketDB() {
		return ticketDB;
	}	
}
