package theGameV4;

public class End extends Commands{
	
	Character player;
	Location loc;
	
	public End(Location loc, Character player){
		this.player = player;
		this.loc = loc;
	}
	
	public String run(){
		System.out.println("You invoke the wrath of the locan mob.");
		return "BATTLE";
	}
}
