package com.Ticket;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Ticket ticket= new Ticket();
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter no of bookings:  ");
		int bookings= scan.nextInt();
		
		System.out.println("Enter the available tickets:  ");
		int available_tickets= scan.nextInt();
		ticket.setAvailableTickets(available_tickets);
		
		for(int i=0; i<bookings; i++) {
			
			
			System.out.println("Enter the ticketid:  ");
			int ticketid= scan.nextInt();
			
			System.out.println("Enter the price:  ");
			int price= scan.nextInt();
			ticket.setPrice(price);
			
			System.out.println("Enter the no of tickets:  ");
			int tickets_Number= scan.nextInt();
			
			int totalPrice= ticket.calculateTicketCost(tickets_Number);
			System.out.println("totalPrice  "+totalPrice);
			System.out.println("Available ticket after booking "+ ticket.getAvailableTickets());
		}
	}

}
