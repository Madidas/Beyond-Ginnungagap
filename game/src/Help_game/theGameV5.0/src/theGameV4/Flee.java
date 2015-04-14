package theGameV4;

public class Flee extends Commands {

	Location loc;
	Character player;


	public Flee(Location loc, Character player){
		this.player= player;
		this.loc = loc;

	}
	public String run(){

		if(this.player.getMoney() <1500) {
			System.out.println("You don't have enough cash for this.");
			return "";
		} else {
			System.out.println("The week is halfway in and you don’t enough money collected. You have sold some of your booze and most of your\nfurniture. Then an idea was born.  You could try to flee from the country. You starts heading to the airport \nand get in the next plane. The flight did cost quite a amount of money but atleast It will guarantee your safety \nAfter the flight you settle into a small village in china and become a farmer.");
			return "Game Over";
		}
	}
}
//Tässä meillä on tämä pakotsydeemi. Ajattelin että pelaajalla täytyisi olla vähintää 1000 euroa että tämä onnistuisi
//Tästä tulisi seuraava ending
//The week is halfway in and you don’t enough money collected. You have sold some of your booze and most of your
//furniture. Then an idea was born.  You could try to flee from the country. You starts heading to the airport
//and get in the next plane. The flight did cost quite a amount of money but atleast It will guarantee your safety
//After the flight you settle into a small village in china and become a farmer.