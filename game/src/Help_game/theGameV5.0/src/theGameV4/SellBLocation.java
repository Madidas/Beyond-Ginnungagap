package theGameV4;

public class SellBLocation extends Location {

	public SellBLocation(String t, Character c) {
		super(t, c);
		SellB sellb = new SellB(this, player);
		coms.put("sell booze",sellb);
		if(t.equals("Park")){
			this.item = true;
			this.itemName = "stick";
		} else if(t.equals("Schoolyard")){
			this.item = true;
			this.itemName = "jacket";
		}else if(t.equals("Movie theatre")){
			this.item = true;
			this.itemName = "plastic bottle";
		}
	}

}
