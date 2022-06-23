package com.ayaz.tickets;
import java.util.List;
import java.util.Scanner;

import com.ayaz.trains.Train;
import com.ayaz.users.Passenger;

public class TicketService {
	public static void generateTicket(Train train,List<Passenger> passengers)
	{
		List<Ticket> list = TicketList.getTicketDB();
		int len = list.size();
		int pnr = len;
		Ticket newTicket = new Ticket(pnr,train,passengers);
		list.add(newTicket);
	}
	public static void viewTicket()
	{
		System.out.println("View Your ticket");
		System.out.println("Enter your PNR Number:");
		Scanner sc = new Scanner(System.in);
		int pnr = sc.nextInt();
		List<Ticket> list = TicketList.getTicketDB();
		int len = list.size();
		if(pnr<len)
		{
			Ticket ticket = list.get(pnr);
			System.out.println("PNR    "+pnr);
			System.out.println("Train Number    "+ticket.getTrain().getTrainNo());
			System.out.println("Boarding Station   "+ticket.getTrain().getStart());
			System.out.println("Destination Station    "+ticket.getTrain().getEnd());
			System.out.println("Passenger Details: ");
			System.out.println("Name                    Age                  Gender");
			List<Passenger> passList = ticket.getPassengers();
			for(Passenger x:passList)
			{
				System.out.println(x.getName()+"                    "+x.getAge()+"                    "+x.getGender());
			}
		}
		else
		{
			System.out.println("PNR not found");
		}
	}
}
