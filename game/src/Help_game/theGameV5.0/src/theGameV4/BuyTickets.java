package theGameV4;

import java.util.Random;

public class BuyTickets extends Commands{
	Random rand = new Random(System.currentTimeMillis());

	Location loc;
	Character player;

	public BuyTickets(Location loc, Character player){					
		this.player= player;
		this.loc = loc;
	}
	public String run(){

		if(this.player.getMoney() <25) {
			System.out.println("You don't have enough cash for this.");
			return "";
		} else {
			System.out.println("How many scratchtickets do you want to buy?");
			return "Character";
		}

	}
	public Character runCha(String t) {

		try {
			int c = Integer.parseInt(t);
			if(c*25 > (this.player.getMoney())){									//check helpers money situation
				System.out.println("You don't have enough money");	
				return player;												//return current state
			} else {
				System.out.println("Here you go you.");					
				this.player.setMoney((-25)*c);								//increase your money by input value
				int y = 0;
				for(int s=0 ; s < c ;s++){
					float chance = rand.nextFloat();
					if (chance <= 0.03f){
						this.player.setMoney(750);
						y++;
					}
				}
				System.out.println("You won "+y*750);	
				return this.player;										//return current state
			}
		} catch (NumberFormatException ex){
			System.out.println(ex+" you have tried to crash the game , please don't resume this futile attempt, thank you.");
		}
		return this.player;										//return current state
	}
}
//A scratchticket if we had a winning chance of 5 percent and the cost for the ticket would be around 25 units
//(winning amount would be around 500-1000)
//if possible we could buy several tickets at once. But one of a time is good too
//Location Kiosk