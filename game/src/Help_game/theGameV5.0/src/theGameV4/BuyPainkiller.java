package theGameV4;

public class BuyPainkiller extends Commands{

	Location loc;
	Character player;


	public BuyPainkiller(Location loc, Character player){
		this.player= player;
		this.loc = loc;
	}

	public String run(){

		if(this.player.getMoney() <0) {
			System.out.println("You don't have enough cash for this.");
			return "";
		} else {
			System.out.println("How many do you want they seem to cost around 14 per pill?");
			return "Character";
		}

	}
	public Character runCha(String t) {
		try{
			int c = Integer.parseInt(t);
			if(c*14 > (this.player.getMoney())){	
				System.out.println("You don't have enough money for that many.");	
				return player;												//return current state
			} else {			
				this.player.setMoney(-14*c);								//decrease your money by input value
				this.player.setMoney(2*c);
				this.player.setPainkillers(c);
				System.out.println("You bought "+ c + " pills.");
				return this.player;										//return current state
			}	
	} catch (NumberFormatException ex){
		System.out.println(ex+" you have tried to crash the game , please don't resume this futile attempt, thank you.");
	}
	return this.player;										//return current state
}
}


// Buying painkillers here as you might have guessed. A price could be around 10-30 units per painkiller