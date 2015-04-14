package theGameV4;

import java.util.Random;
import java.util.Scanner;

public class SellB extends Commands {

	int numBottles;
	int moneyStat;
	Scanner in = new Scanner(System.in);
	Random rand = new Random();
	Customer customer = new Customer();
	Location loc;
	Character player;


	public SellB(Location loc, Character player){
		this.player= player;
		this.loc = loc;
	}
	public String run(){
		System.out.println("You see those hobos, don't you? Maybe some liquer-selling? (yes/no)");
		return "Character";
	}

	public Character runCha(String t){								//takes said string from scanner
		try{
			if(player.getBooze() != 0){
				if(t.equals("yes")||t.equals("ye")||t.equals("y")){
					String[] enemies = { "Crazy-Rem", "Two-teeth Henry", "Coin-Con", "Bud Weischer" };
					int affordStatus = customer.getMoney();

					//Player's variables
					this.moneyStat = player.getMoney();
					this.player.money=0;
					this.numBottles = player.getBooze();
					this.player.booze=0;
					int bottleDropChance = 20; //percentage 


					boolean running = true;

					GAME:
						while(running) {
							System.out.println("------------------------------------------------");

							int afford = 10+rand.nextInt(affordStatus);
							String enemy = enemies[rand.nextInt(enemies.length)];
							System.out.println("\t#It's " +enemy+ ", try to guess the right prize! #\n\t#Don't sell it for too low, it ain't worth it!# ");


							while(afford > 10) {
								System.out.println("\n\tYou have " + moneyStat +" dollars");
								System.out.println("\t" + enemy + "'s dollars: " + afford);     
								System.out.println("\n\tSet your prize for one bottle.");     

								//Booze price 
								int userInt = Integer.parseInt(in.nextLine());
								if(userInt<=15 && afford>7)  {                                   //booze price 7-15 per bottle

									afford -= userInt;
									moneyStat += userInt;
									numBottles--;

									System.out.println("\t> One bottle sold, " + enemy + " gives you " + userInt + "dollars!");
									System.out.println("\t> You have " + numBottles + " bottles.");

									if(numBottles < 1)  {
										System.out.println("\t> You have sold out!");
										break;

									}
								}
								else if(userInt>15) {
									if(numBottles > 0) {
										moneyStat += 0;
										numBottles--;
										System.out.print("\t> Your asking prize is too high " + "." 
												+ "\n\t> You have " + moneyStat + " dollars."
												+"\n\t> You still have " + numBottles + " bottles left.\n");
									}
									else {
										System.out.println("\t> You have no bottles left! Try to beat these bums to steal more");
									}

									continue GAME;

								}
								else {
									System.out.println("\tInvalid command ");
								}
							}

							if(numBottles < 1) {
								System.out.println("You have sold out.");
								break;
							}

							System.out.println("-----------------------------------------");
							System.out.println(" # " + enemy + " was satisfied! # ");
							System.out.println(" # You have " + moneyStat + " dollars left. #");
							if(rand.nextInt(100) < bottleDropChance) {
								numBottles++;
								System.out.println(" # The " + enemy + " dropped a plastic drinkmix bottle! # ");
								System.out.println(" # You now have " + numBottles + " bottle(s).# ");


							}
							System.out.println("--------------------------------------------");
							System.out.println("What would you like to do now?");
							System.out.println("1. Continue selling");
							System.out.println("2. Exit selling");

							String input = in.nextLine();

							while(!input.equals("1") && !input.equals("2")) {
								System.out.println("Invalid command!");
								input = in.nextLine();
							}
							if(input.equals("1")) {
								System.out.println("You continue on selling, you sneaky fuck");
							}
							else if(input.equals("2")) {
								System.out.println("You exit sales, successfully!");
								break;
							}
						}

					System.out.println("############################");
					System.out.println(" YOU ARE A GOOD SALESMAN ! ");
					System.out.println("############################");

					this.player.setBooze(numBottles);
					this.player.setMoney(moneyStat);

				} else {
					System.out.println("Maybe this isn't the time and place for this.");
				}
			} else {
				System.out.println("You notice you don't have any booze on you and back out.");
			}
		} catch (NumberFormatException ex){
			System.out.println(ex+" you have tried to crash the game , please don't resume this futile attempt, thank you.");
			this.player.setBooze(numBottles);
			this.player.setMoney(moneyStat);
		}
		return this.player;
	}
}
//well... we kinda talked about this earlier. About the pricerange and stuff. We could also print the command to get the booze
//the booze while being home (i don't remember if it was there).