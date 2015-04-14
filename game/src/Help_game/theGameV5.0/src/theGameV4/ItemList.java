package theGameV4;

public class ItemList extends Commands{
	
	Location loc;
	Character player;

	public  ItemList(Location loc, Character player) {
		this.loc = loc;
		this.player = player;
	}
	
	public String run(){
		String p;
		if(this.player.getPainkillers() == 1){
			p ="a painkiller";
		} else {
			p = this.player.getPainkillers()+"painkillers";
		}
		System.out.println("You check the contents of your wallet, you have "+this.player.getMoney()+".");
		player.getItemList();
		System.out.println("and you have " +this.player.getBooze()+ " bottles of booze with you.");
		System.out.println("and you have "+p+ " on you.");
		return "";
	}

}
