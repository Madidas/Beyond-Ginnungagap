package theGameV4;

public class WorkPlace extends Location {

	public WorkPlace(String t,Character c) {
		super(t,c);
		Work work = new Work(this, player);
		coms.put("work",work);
		this.item = true;
		this.itemName = "fork";
	}

}
