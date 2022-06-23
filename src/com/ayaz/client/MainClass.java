package com.ayaz.client;

import java.util.Scanner;

import com.ayaz.tickets.TicketService;
import com.ayaz.trains.TrainService;
import com.ayaz.users.AccountService;

public class MainClass {
	public static void main(String[] args) {
		TrainService.generateTrainList();
		AccountService.generateAccountList();
		System.out.println("Hello User");
		System.out.println("Welcome to BookMyTrain.com");
		System.out.println("--->Press 1 for booking a ticket");
		System.out.println("--->Press 2 for viewing your ticket");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice==1)
		{
			TrainService.bookTicket();
		}
		else if(choice==2)
		{
			TicketService.viewTicket();
		}
	}

}
