package theGameV4;

public class SellFurniture extends Commands{
	
	Location loc;
	Character player;
	
	
	public SellFurniture(Location loc, Character player){
		this.player= player;
		this.loc = loc;
	}

	public String run(){
		int c = 500;
		if (!this.player.soldAll){
			System.out.println("After lorrying all of value from your home to the fleamarket you make up "+c+" off the 5000 that you desperately need.");
		this.player.setMoney(c);
		this.player.soldAll=true;
		} else {
			System.out.println("You don't think that it is a smart idea to rob people here again.");
		}
		return "";
	}
}
// There isn't much i can say here is there? Just selling your furniture in the fleamarket which takes a long time