package theGameV4;

public class Airport extends Location {
	public Airport(String t, Character c) {
		super(t, c);
		Flee flee = new Flee(this, player);
		coms.put("fly away",flee);

	}

}
