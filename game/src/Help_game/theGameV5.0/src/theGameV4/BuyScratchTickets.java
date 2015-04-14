package theGameV4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BuyScratchTickets extends Commands{
	Scanner in = new Scanner(System.in);
	Random rand = new Random();
	Location loc;
	Character player;
	
	
	public BuyScratchTickets(Location loc, Character player){					
		this.player= player;
		this.loc = loc;
	}

	
	public String run(){
		System.out.println("Are you sure you want to buy one ticket?");
		return "Character";
	}
	
	public Character runCha(String t){								//takes said string from scanner
		if(t.equals("yes")){
		//Game variables
				String[] clerks = { "Deusche Clerk", "Charming seller" };

				//Player's variables
				int moneyStat = player.getMoney();
				this.player.money=0;
				int numHealthPotions = 1;
				//int healthPotionHealAmount = 30;
				int winChance = 10; //percentage 
				int winChance500 = 5; //percentage

				boolean running = true;

				System.out.println("You're next customer. What would it be?");

				GAME:
					while(running) {
						System.out.println("------------------------------------------------");

						//int enemyHealth = rand.nextInt(maxEnemyHealth);
						String clerk = clerks[rand.nextInt(clerks.length)];
					     if(Arrays.asList(clerk).contains("Charming seller")) {
							winChance = winChance+30; 
							System.out.println(winChance);
					     }
						System.out.println("\t# " +clerk+ " is at the salesdesk! #\n");


						while(moneyStat > 4) {
							System.out.println("\tYour money status: " + moneyStat); 
							System.out.println("\n\tWhat would you like to do?");   
							System.out.println("\t1. Buy. It costs five dollars.");    
							System.out.println("\t2. Buy a ticket to win 500 dollars, it costs 30 dollars.");     
							System.out.println("\t3. Go to exit doors!");   

							String input = in.nextLine();
							if(input.equals("1") && moneyStat > 4)  {
								moneyStat -= 5;
								//int damageDealt = rand.nextInt(attackDamage);
								//int damageTaken = rand.nextInt(enemyAttackDamage);

								//enemyHealth -= damageDealt;
								//moneyStat -= damageTaken;
								if(rand.nextInt(100) < winChance) {
									moneyStat +=20; 
									System.out.println("You won 20 dollars!");
								}	
								System.out.println("\t> You have " + moneyStat + " dollars.");
								//System.out.println("\t> You receive " + damageTaken + " in retaliation!");
                                
								
								if(moneyStat < 5)  {
									System.out.println("\t> You can't afford this tickets dawgh!");
									break GAME;

								}
							}
							else if(input.equals("2")) {
								moneyStat -= 30;
								
								if(rand.nextInt(100) < winChance500) {
									moneyStat +=500; 
									System.out.println("You won the main prize 500 dollars!");
								}
								if(moneyStat<0){
									moneyStat=0;
								}
								System.out.println("\t> You have " + moneyStat + " dollars.");
							}

							else if(input.equals("3")) {
								System.out.println("\tYou stopped buying, " + clerk + " says thank you!");           
								break GAME;

							}
							else {
								System.out.println("\tInvalid command ");
							}
						}

						if(moneyStat < 1) {
							System.out.println("Get a job, you're broke.");
							break;
						}

						System.out.println("-----------------------------------------");
						System.out.println(" # " + clerk + " was defeated! # ");
						System.out.println(" # You have " + moneyStat + " dollars. #");
						if(rand.nextInt(100) < winChance) {
							numHealthPotions++;
							System.out.println(" # The " + clerk + " dropped a health potion! # ");
							System.out.println(" # You now have " + numHealthPotions + " health potion(s).# ");
						}
						System.out.println("--------------------------------------------");
						System.out.println("What would you like to do now?");
						System.out.println("1. Continue buying tickets.");
						System.out.println("2. Exit from this kiosk");

						String input = in.nextLine();

						while(!input.equals("1") && !input.equals("2")) {
							System.out.println("Invalid command!");
							input = in.nextLine();
						}
						if(input.equals("1")) {
							System.out.println("You are steady to stay in this kiosk.");
						}
						else if(input.equals("2")) {
							System.out.println("You decided to exit the kiosk!");
							break;
						}
					}

				System.out.println("############################");
				System.out.println(" LUCKY BASTARD ! ");
				System.out.println("############################");
				
				this.player.setMoney(moneyStat);
				return this.player;  //final return player state
				
		} else {
		return this.player;
		}
	}
}

//A scratchticket if we had a winning chance of 5 percent and the cost for the ticket would be around 25 units
//(winning amount would be around 500-1000)
//if possible we could buy several tickets at once. But one of a time is good too
//Location Kiosk