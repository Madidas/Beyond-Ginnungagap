package theGameV4;

public class Look extends Commands {
	
	Location loc;
	
	public Look(Location loc){
		this.loc = loc;
	}
	public String run(){
		if (loc.item == true){
			return loc.itemName;
		} else {
			return "no item";
		}
	}
}
