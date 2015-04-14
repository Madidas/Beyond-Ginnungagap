package theGameV4;

public class CAtteShip extends Location {
	
	private String itemName;
	
	public CAtteShip(String t, Character c) {
		super(t,c);
		this.item = true;
		this.itemName = "laser pistol";
	}
	public String loot(String t){
		if ((this.itemName == "looted")) {
			this.item = !true;
			return "The item is already Looted";
		}
		else if ((this.itemName.equals(t)) && (this.item == true)) {
			this.itemName = "looted";
			return t;
		} else {
			return "no such item";
		}
	}
	
	public String look(){
		System.out.println("You look around your glorious spaceship.");
		if (this.item == true){
			return this.itemName;
		} else {
			return "no item";
		}
	}
	

}
