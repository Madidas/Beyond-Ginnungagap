package theGameV4;

public class PoliceStation extends Location {
	
	public PoliceStation(String t, Character c) {
		super(t, c);
		AskForHelp askForHelp = new AskForHelp(this, player);
		coms.put("ask for help",askForHelp);
		this.item = true;
		this.itemName = "gun";
	}

}
