package theGameV4;

public class Kiosk extends Location{
	
	public Kiosk(String t, Character c) {
		super(t, c);
		
		BuyScratchTickets buyScratchTickets = new BuyScratchTickets(this, player);
		coms.put("buy scratchs",buyScratchTickets);
	}


}
