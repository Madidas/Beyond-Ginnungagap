package theGameV4;

public class Work extends Commands {
	
	Location loc;
	Character player;
	
	
	public Work(Location loc, Character player){
		this.player= player;
		this.loc = loc;
	}
	
	public String run(){
		System.out.println("After careful and precise planning you work for an hour at a part-time job.");
		this.player.setMoney(14);
		return "";
	}
}
 // Just some work what can be done. I though the money which will be achieved here is Hour*30-50 euros or so
// the areas where the work can be done are Pizzeria, warehouse and industry inc.