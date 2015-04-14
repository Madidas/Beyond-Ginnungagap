package theGameV4;

public class Pool extends Location{
	
	public Pool(String t, Character c) {
		super(t, c);
		
		Swim swim = new Swim(this, player);
		coms.put("swim",swim);
	}

}
