package theGameV4;

public class Basement extends Location{
	
	public Basement(String t, Character c) {
		super(t, c);
		Fight fight = new Fight(this,player);
		coms.put("fight",fight);
		this.item = true;
		this.itemName = "pipe";
	}

}
