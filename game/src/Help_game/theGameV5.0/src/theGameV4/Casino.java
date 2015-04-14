package theGameV4;

public class Casino extends Location {
	
	public Casino(String t, Character c) {
		super(t, c);
		Gamble gamble = new Gamble(this, player);
		coms.put("get lucky",gamble);
		BuyTickets buytickets = new BuyTickets(this, player);
		coms.put("buy tickets",buytickets);
	}

}
