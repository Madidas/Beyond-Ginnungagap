package theGameV4;

import java.util.Random;
import java.util.Scanner;

public class Survive extends Commands {

	Scanner in = new Scanner(System.in);
	Random rand = new Random(System.currentTimeMillis());
	Customer customer = new Customer();
	Character player = new Character();
	Location loc;

	public Survive(Location loc){
		this.loc = loc;
	}

	public String run(){
		//Game variables
		String[] enemies = { "Crazy-Rem", "Rapist the Rapper", "Coin-Con" };
		int maxEnemyHealth = customer.getHpMax();
		int enemyAttackDamage = customer.getDmgOut();

		//Player's variables
		int health = player.getHp() ;
		int attackDamage = 40;
		int numHealthPotions = 1;
		int healthPotionHealAmount = 30;
		int healthPotionDropChance = 40; //percentage 

		boolean running = true;

		System.out.println("You see those hobos, don't you? Maybe some liquer-selling?");

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
					System.out.println("\t3. Run from the mafiamember!");   

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
							System.out.println("\t> You have no potions left! Defeat enemies to get");
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
					System.out.println(" # The " + enemy + " dropped a health potion! # ");
					System.out.println(" # You now have " + numHealthPotions + " health potion(s).# ");
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
		return "";
	}
}


