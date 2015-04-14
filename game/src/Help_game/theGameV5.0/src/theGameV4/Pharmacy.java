package theGameV4;

public class Pharmacy extends Location{
	
	public Pharmacy(String t, Character c) {
		super(t, c);
		
		BuyPainkiller buyPainKiller = new BuyPainkiller(this, player);
		coms.put("buy painkillers",buyPainKiller);
	}


}
