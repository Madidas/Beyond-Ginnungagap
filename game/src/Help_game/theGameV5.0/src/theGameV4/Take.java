package theGameV4;

public class Take extends Commands{

	Location loc;
	Character player;

	public Take(Location loc,Character player){
		this.loc = loc;
		this.player = player;
	}

	public String run(){
		System.out.println("You look around the place and find some bottles. How many bottles you want to take?");				//ask for 2nd input
		return "Character";
	}
	public Character runCha(String t) {
		try{
			int c = Integer.parseInt(t);
			if (c > this.loc.booze){
				System.out.println("You clear place from booze that you can get your hands on.");
				int j=this.loc.booze;
				this.loc.booze = 0;
				this.player.setBooze(j);
			} 
			else {
				this.loc.booze = this.loc.booze-c;
				this.player.setBooze(c);
			}
		} catch (NumberFormatException ex){
			System.out.println(ex+" you have tried to crash the game , please don't resume this futile attempt, thank you.");
		}

		return this.player;
	}
}