package Session15;

public class Ticket {
	private int ticketid;
	private int price;
	private static int availableTickets;
	
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}
	public static void setAvailableTickets(int availableTickets) {
		Ticket.availableTickets = availableTickets;
	}
	public int calculateTicketCost(int nooftickets){
		int totalAmt = 0;
		if(Ticket.getAvailableTickets()>=nooftickets) {
			totalAmt= nooftickets*this.getPrice();
			Ticket.setAvailableTickets(Ticket.getAvailableTickets()-nooftickets);
			return totalAmt;
		}
		else {
			return -1;
		}
	}
}
