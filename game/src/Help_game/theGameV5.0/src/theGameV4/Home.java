package theGameV4;

public class Home extends Location {

	public Home(String t,Character c) {
		super(t, c);
		this.booze = 40 ;
		this.item = true;
		this.itemName = "knife";
		Take take = new Take(this, player);
		coms.put("take",take);
	}
}
