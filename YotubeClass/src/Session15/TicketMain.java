package Session15;

import java.util.Scanner;

public class TicketMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ticket tkt = new Ticket();
		System.out.println("No of Ticket Available: ");
		Ticket.setAvailableTickets(sc.nextInt());
		System.out.println("Number of Booking: ");
		int bk = sc.nextInt();
		for (int i = 1; i <= bk; i++) {
			System.out.println("Ticket ID");
			tkt.setTicketid(sc.nextInt());
			System.out.println("Ticket Price");
			tkt.setPrice(sc.nextInt());
			System.out.println("No of Ticket: ");
			int noOfTkt = sc.nextInt();
			
			int res = tkt.calculateTicketCost(noOfTkt);
			
			if(res==-1){
				System.out.println("No Tickets are available");
				break;
			}
			else {
				System.out.println("Total Amout: "+res);
			}
			System.out.println("Available tickets are: "+ Ticket.getAvailableTickets());
			System.out.println("----------------");
		}
	}
}
