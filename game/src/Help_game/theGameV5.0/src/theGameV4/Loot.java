package theGameV4;

public class Loot extends Commands{

	Location loc;
	Character player;
	
	
	public Loot(Location loc, Character player){
		this.player= player;
		this.loc = loc;
	}
	public String run(){
		System.out.println("What do you wish to loot?");	//Setup for for next input
		return "Character";									//makes commands run through string scanner
	}
	public Character runCha(String t){								//takes said string from scanner
		if ((loc.item == true) &&(loc.itemName.equals(t))) {		//if there is scanner inputed item
			loc.itemName = "looted";								//set item name to looted
			this.player.poketItem(t);								//pocket the item
			System.out.println("You have looted a "+t);				//message of looting the item was successful
			return this.player;										//return new state
		} else if ((loc.itemName == "looted")) {					//if item is looted
				loc.item = !true;									//set item to false
				System.out.println("The item is already Looted");	//you looted this item recently
				return this.player;									//return current state
		} else {
			System.out.println("no such item");						//item value = false
			return this.player;										//return current state
		}
	}
}