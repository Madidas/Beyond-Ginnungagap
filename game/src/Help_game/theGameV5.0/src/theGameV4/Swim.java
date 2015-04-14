package theGameV4;

import java.util.Random;

public class Swim extends Commands{
	
	Random rand = new Random();
	Location loc;
	Character player;
	
	
	public Swim(Location loc, Character player){
		this.player= player;
		this.loc = loc;
	}
	public String run(){

		float chance = rand.nextFloat();
		System.out.println("You try out the waters that you have not had contact with in ages.");
		if (chance <= 0.20f && !this.player.swim){
			System.out.println("You jump head first into the pool. It had been a while since you have last swum(?). Midway trough the pool you start getting\ncramps in your right leg. You start panicking which causes the pain to intensify. As you clench onto your pained leg you start\nslowly sinking towards the bottom of the pool  and gasp for some air. This causes the water to fill your lungs.\n Slowly your consciousness starts to fade to black."); 
			return "Game Over";
		} else {
			if (!this.player.swim){
			System.out.println("Congratulations, you truly can swim.");
			}
			System.out.println("How much do you want to bet? Seems the stakes are not too high.");
			this.player.swim = true;
			return "Character";
		}

	}
	public Character runCha(String t) {
		
		int c = Integer.parseInt(t);
		if(c > (this.player.getMoney()) && c<=200){	
			System.out.println("You don't have enough money or you're betting too much.");	
			return player;												//return current state
		} else {
			System.out.println("You swim like a shark.");					
			this.player.setMoney(-c);								//increase your money by input value
			
			
				float chance = rand.nextFloat();
				if (chance <= 0.40f){
					this.player.setMoney(2*c);
					System.out.println("You won "+ c);
				} else {
					System.out.println("You lost "+ c);
				}
				System.out.println("After swiming like mad you decide to rest for a moment.");
			return this.player;										//return current state
		}
	}
}
// Just another bet here maybe(?) Also if there is time a posibillity of death (by drowning chance 20%)
//The are is the pool as you have guessed