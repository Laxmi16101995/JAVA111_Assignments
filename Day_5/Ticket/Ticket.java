package com.Ticket;

public class Ticket {

	private int ticketid;
	private int price;
	static int availableTickets; 
	
	public void setTicketid(int a) {
		ticketid= a;
	}
	public int getTicketid() {
		return ticketid;
	}
	
	public void setPrice(int a) {
		price= a;
	}
	public int getPrice() {
		return price;
	}

	public void setAvailableTickets(int a) {
		if(a>1) {
			availableTickets= a;
		}else {
			System.out.println("Not a valid value");
		}
	}
	public int getAvailableTickets() {
		return availableTickets;
	}
	
	public int calculateTicketCost(int nooftickets) {
		
		if(nooftickets< availableTickets){
			availableTickets=  availableTickets-nooftickets;
			int total= nooftickets*price;
			return total;
		}else{
			int a=-1;
			return a;
		}
	}
}
