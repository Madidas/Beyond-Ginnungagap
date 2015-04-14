package theGameV4;

public class RobPlace extends Location {

	public RobPlace(String t, Character c) {
		super(t, c);
		Rob rob = new Rob(this, player);
		coms.put("rob",rob);
	}

}
