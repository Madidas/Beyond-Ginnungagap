package theGameV4;

import java.util.Random;
import java.util.Scanner;

public class Fight extends Commands{
	Scanner in = new Scanner(System.in);
	Random rand = new Random(System.currentTimeMillis());
	Thug thug = new Thug();
	Character player;
	Location loc;
	
	public Fight(Location loc, Character player){
		this.player = player;
		this.loc = loc;
	}
	
	public String run(){
		System.out.println("Do you wish fight? (yes/no)");
		return "Character";
	}
	
	public Character runCha(String t){								//takes said string from scanner
		if(t.equals("yes")||t.equals("ye")||t.equals("y")){
		//Game variables
				String[] enemies = { "Thug", "Friend of thugs" };
				int maxEnemyHealth = thug.getHpMax();
				int enemyAttackDamage = thug.getDmgOut();
				//Player's variables
				int health = (player.getMaxHp()-(100-player.getHp()));
				if (player.getHp()>player.getMaxHp()){
					health= player.getMaxHp();
				}
				int attackDamage = player.getDmgOut();
				int numHealthPotions = player.getPainkillers();
				int healthPotionHealAmount = 30;
				int healthPotionDropChance = 50; //percentage 

				boolean running = true;

				System.out.println("You are meeting your debthtakers");

				GAME:
					while(running) {
						System.out.println("------------------------------------------------");

						int enemyHealth = rand.nextInt(maxEnemyHealth);
						String enemy = enemies[rand.nextInt(enemies.length)];
						System.out.println("\t# " +enemy+ " has appeared! #\n");


						while(enemyHealth > 0) {
							System.out.println("\tYour HP: " + health);
							System.out.println("\t" + enemy + "'s HP: " + enemyHealth);   
							System.out.println("\n\tWhat would you like to do?");   
							System.out.println("\t1. Attack");    
							System.out.println("\t2. Take painkiller");     
							System.out.println("\t3. Run from the debthtakers!");   

							String input = in.nextLine();
							if(input.equals("1"))  {
								int damageDealt = rand.nextInt(attackDamage);
								int damageTaken = rand.nextInt(enemyAttackDamage);

								enemyHealth -= damageDealt;
								health -= damageTaken;

								System.out.println("\t> You strike the " + enemy + " for " + damageDealt + "damage.");
								System.out.println("\t> You receive " + damageTaken + " in retaliation!");

								if(health < 1)  {
									System.out.println("\t> You have taken too much damage!");
									break;

								}
							}
							else if(input.equals("2")) {
								if(numHealthPotions > 0) {
									health += healthPotionHealAmount;
									numHealthPotions--;
									System.out.print("\t> You drink a health potion for " + "." 
											+ "\n\t> You now have " + health + "HP."
											+"\n\t> You have " + numHealthPotions + " health potions left.\n");
								}
								else {
									System.out.println("\t> You have no pills left! Defeat enemies to get");
								}
							}

							else if(input.equals("3")) {
								System.out.println("\tYou run away from the " + enemy + "!");           
								continue GAME;

							}
							else {
								System.out.println("\tInvalid command ");
							}
						}

						if(health < 1) {
							System.out.println("You limp out of the pit, weak from battle.");
							break;
						}

						System.out.println("-----------------------------------------");
						System.out.println(" # " + enemy + " was defeated! # ");
						System.out.println(" # You have " + health + " HP left. #");
						if(rand.nextInt(100) < healthPotionDropChance) {
							numHealthPotions++;
							System.out.println(" # The " + enemy + " dropped a pill! # ");
							System.out.println(" # You now have " + numHealthPotions + " pill(s).# ");
						}
						System.out.println("--------------------------------------------");
						System.out.println("What would you like to do now?");
						System.out.println("1. Continue fighting");
						System.out.println("2. Exit fighting");

						String input = in.nextLine();

						while(!input.equals("1") && !input.equals("2")) {
							System.out.println("Invalid command!");
							input = in.nextLine();
						}
						if(input.equals("1")) {
							System.out.println("You continue on battling, never back down!");
						}
						else if(input.equals("2")) {
							System.out.println("You exit struggles, successfully!");
							break;
						}
					}

				System.out.println("############################");
				System.out.println(" YOU SURVIVED, CHAMP ! ");
				System.out.println("############################");
				
				this.player.painkillers = numHealthPotions;
				this.player.setHp(health);
				return this.player;  //final return player state
				
		} else {
		return this.player;
		}
	}
}
