package com.ayaz.trains;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ayaz.client.MainClass;
import com.ayaz.tickets.TicketService;
import com.ayaz.users.AccountService;
import com.ayaz.users.Passenger;

public class TrainService {
	public static void generateTrainList()
	{
		List<Train> list=null;
		list=TrainList.getTrainDB();
		list.add(new Train(101,"Raajdhani Express","Delhi","Varanasi","20/06/2022",100,1000));
		list.add(new Train(102,"Shatabdi Express","Kolata","Varanasi","20/06/2022",100,1459));
		list.add(new Train(103,"East Coast Express","Delhi","Srinagar","20/06/2022",100,467));
		list.add(new Train(104,"West Coast Express","Delhi","Patna","21/06/2022",100,600));
		list.add(new Train(105,"Farakka Express","Mumbai","Bhopal","18/06/2022",100,8000));
		list.add(new Train(106,"UP-Bihar Express","Patna","Lucknow","19/06/2022",100,300));
		list.add(new Train(107,"North East SuperFast Express","Asansol","Durgapur","19/06/2022",100,2500));
		list.add(new Train(108,"Chennai Express","Delhi","Chennai","20/06/2022",100,460));
		list.add(new Train(109,"South India Express","Delhi","Hydrebad","20/06/2022",100,900));
		list.add(new Train(110,"Vizag-Kolkata SuperFast Express","Kolkata","Visakhapatnam","20/06/2022",100,2000));
		list.add(new Train(111,"Raajdhani Express","Bangalore","Trichy","19/06/2022",100,560));
		list.add(new Train(112,"Raajdhani Express","Goa","Raipur","18/06/2022",100,600));
		list.add(new Train(113,"Jab Shatabdi Express","Pilani","Kota","21/06/2022",100,790));
		list.add(new Train(114,"GareebRath Express","Chennai","Varanasi","22/06/2022",100,1200));
	}
	public static void bookTicket()
	{
		System.out.println("**************************************************");
		System.out.println("Book your Train Ticket");
		System.out.println("Enter Date of boarding in the form dd/mm/yyyy");
		Scanner sc = new Scanner(System.in);
		String date = sc.next();
		System.out.println("Enter boarding station");
		String start = sc.next();
		System.out.println("Enter destination station");
		String end = sc.next();
		System.out.println("Enter number of passengers");
		int passengers = sc.nextInt();
		System.out.println("Searching Trains.......");
		System.out.println("List of available trains are:");
		searchTrains(date,start,end,passengers);
	}
	public static void booking(Train train,int passengers)
	{
		int fare = train.getCost()*passengers;
		System.out.println("Your Total Fare is = " + train.getCost()*passengers);
		System.out.println("Press 1 to continue or press 2 to exit");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice==1)
		{
			List<Passenger> list = new ArrayList<Passenger>();
			for(int i=1;i<=passengers;i++)
			{
				System.out.println("Enter Passenger "+i+" details:");
				System.out.println("Enter Passenger "+i+" name:");
				String name=sc.next();
				System.out.println("Enter Passenger "+i+" age:");
				int age=sc.nextInt();
				System.out.println("Enter Passenger "+i+" gender:");
				String gender = sc.next();
				System.out.println("Enter Passenger "+i+" contact:");
				String contact = sc.next();
				System.out.println("Enter Passenger "+i+" email:");
				String email= sc.next();
				Passenger passDetails = new Passenger(name,age,gender,contact,email);
				list.add(passDetails);
			}
			System.out.println("Enter Bank AcCount Details:");
			System.out.println("Enter Account Number:");
			String accNo = sc.next();
			System.out.println("Enter Password:");
			String password = sc.next();
			if(AccountService.withdrawl(accNo, password, fare)==true)
			{
				int newSeats = train.getSeats()-passengers;
				train.setSeats(newSeats);
				TicketService.generateTicket(train,list);
//				TicketService.viewTicket();
				System.out.println("Ticket Booked Successfully");
				System.out.println("--->Press 1 to go back to HomePage ");
				System.out.println("--->Press 2 to view your ticket");
				int ip = sc.nextInt();
				if(ip==1) MainClass.main(null);
				else TicketService.viewTicket();
			}
		}
	}
	public static void searchTrains(String date,String start,String end,int seats)
	{
		List<Train> list = TrainList.getTrainDB();
		int c=0;
		for(Train train: list)
		{
			if(train.getDate().equals(date) && train.getStart().equals(start) && train.getEnd().equals(end) && train.getSeats()>=seats)
			{
				c++;
				System.out.println(train.getTrainNo()+"       "+train.getTrainName()+"           "+train.getDate()
				+"          "+train.getStart()+"          "+train.getEnd()+"           "+train.getSeats());
			}
		}
		if(c==0)
		{
			System.out.println("No available trains");
		}
		else
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the Train Number to book your ticket");
			int trainNo = sc.nextInt();
			for(Train train: list)
			{
				if(train.getTrainNo()==trainNo)
				{
					booking(train,seats);
				}
			}
		}
	}
}
