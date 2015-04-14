package theGameV4;

public class Beach extends Location{
	
	public Beach(String t, Character c) {
		super(t, c);
		Work work = new Work(this, player);
		coms.put("work",work);
		Rob rob = new Rob(this, player);
		coms.put("rob",rob);
		Fight fight = new Fight(this, player);
		coms.put("fight",fight);
		SellB sellb = new SellB(this, player);
		coms.put("sell booze",sellb);
		this.item = true;
		this.itemName = "broken baseballbat";
	}
	
}
