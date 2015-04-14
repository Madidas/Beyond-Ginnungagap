package theGameV4;

public class Rob extends Commands {
	
	Location loc;
	Character player;
	Character victim = new Character();

	
	public Rob(Location loc, Character player){
		this.victim.setBooze(5);
		this.victim.setMoney(0);
		this.player= player;
		this.loc = loc;
	}
	
	public String run(){
		if (!this.victim.robbed){
			System.out.println("After careful and precise planning you rob a local");
		this.victim.setBooze(-5);
		this.victim.setMoney(-80);
		this.player.setBooze(5);
		this.player.setMoney(80);
		this.victim.robbed=true;
		} else {
			System.out.println("You don't think that it is a smart idea to rob people here again.");
		}
		return "";
	}
}
//well what i thought about this thing is the follows: You can rob places which we have adressed earlier
//(i think? and if not that can be checked in the Spreadsheet) The amount of cash that can be robbed could be around
// 100-500.
// Locations are Warehouse, Friends house and industry inc