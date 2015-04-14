package theGameV4;

import java.util.Random;

public class Gamble extends Commands {

	Random rand = new Random();

	Location loc;
	Character player;

	public Gamble(Location loc, Character player){					
		this.player= player;
		this.loc = loc;
	}
	public String run(){

		if(this.player.getMoney() <0) {
			System.out.println("You don't have enough cash for this.");
			return "";
		} else {
			System.out.println("How much do you want to bet? Your chances to win are 50%. Maximum bet is 500");
			return "Character";
		}

	}
	public Character runCha(String t) {

		try{
			int c = Integer.parseInt(t);
			if(c > (this.player.getMoney()) && c>=500){	
				System.out.println("You don't have enough money or you're betting too much.");	
				return player;												//return current state
			} else {
				System.out.println("Rolling the dice.");					
				this.player.setMoney(-c);								//increase your money by input value


				float chance = rand.nextFloat();
				if (chance <= 0.50f){
					this.player.setMoney(2*c);
					System.out.println("You won "+ c);
				} else {
					System.out.println("You lost "+ c);
				}

				return this.player;										//return current state
			}	
		} catch (NumberFormatException ex){
			System.out.println(ex+" you have tried to crash the game , please don't resume this futile attempt, thank you.");
		}
		return this.player;										//return current state
	}
}


// If you want to gamble then im your man.... vai miten sen meni?
//anyway tässä ajattelin että olisi mahdollisuus riskeerata tietty määrä rahaa
// Panostukselle voisi asettaa tietyin ylärajan esimerkiksi vaikka 500 ettei peli kävisi liian helpokis
// Mahdollisuus voittoon olisi noin 50 % ja voittosuhde olisi 1:1
//Lopputuloksen voisi mahdollisest printata. Location casino
//Possible scam?
// There are possibillities here. We could print something which states that the chance of winning is 50-50
// But in fact it is just 20%
