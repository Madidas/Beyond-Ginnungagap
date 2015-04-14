package theGameV4;

public class AskForHelp extends Commands {

	Location loc;
	Character player;
	Character helper = new Character();

	public AskForHelp(Location loc, Character player){
		this.player= player;
		this.loc = loc;
	}

	public String run(){

		if(this.loc.getName().equals("Friends house")) {
			this.helper.setMoney(20);
		} else if(this.loc.getName().equals("Police")) {
			this.helper.setMoney(-20);
		}

		if (helper.getMoney()==0){
			System.out.println("I can't help you");
			return "";
		} else {
			System.out.println("I can arrange you some money to help your problems. How much you need?");	//Setup for for next input
			return "Character";									//makes commands run through string scanner
		}

	}
	public Character runCha(String t) {

		try {
			int c = Integer.parseInt(t);
			if(c > (this.helper.getMoney())){									//check helpers money situation
				System.out.println("I don't have that much money to spare");	
				return this.player;												//return current state
			} else {
				System.out.println("Here you go you.");					
				this.player.setMoney(c);								//increase your money by input value
				return this.player;										//return current state
			}
		} catch (NumberFormatException ex){
			System.out.println(ex+" you have tried to crash the game , please don't resume this futile attempt, thank you.");
		}
		return this.player;										//return current state
	}
}
// Well... Anyway this is just a small amount money which you can get for free. FOR FREE I TELL YOU
// Locations Friends house and Police