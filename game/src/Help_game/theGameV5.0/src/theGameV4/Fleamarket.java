package theGameV4;

public class Fleamarket extends Location{

	public Fleamarket(String t, Character c) {
		super(t, c);
		
		SellFurniture sellFurniture = new SellFurniture(this, player);
		coms.put("sell the furniture",sellFurniture);
		this.item = true;
		this.itemName = "vest";
	}

}
