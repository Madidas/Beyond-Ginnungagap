package theGameV4;

public class Industry extends Location {

	public Industry(String t, Character c) {
		super(t, c);
		Work work = new Work(this, player);
		coms.put("work",work);
		Rob rob = new Rob(this, player);
		coms.put("rob",rob);
	}
	
}