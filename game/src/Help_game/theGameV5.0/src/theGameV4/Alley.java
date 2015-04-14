package theGameV4;

import java.util.Random;
import java.util.Scanner;

public class Alley extends Location {
	Scanner in = new Scanner(System.in);
	Random rand = new Random();
	Thug thug = new Thug();

	public Alley(String t,Character c) {
		super(t,c);
		Fight fight = new Fight(this,player);
		coms.put("fight",fight);
		Take take = new Take(this, player);
		coms.put("take",take);
		this.item = true;
		this.itemName = "broken bottle";
	}
}

