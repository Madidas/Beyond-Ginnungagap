package theGameV4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;

public class GC {

	private int time;
	private int timeleft;
	private String game;
	private int day;
	Random rand=new Random(System.currentTimeMillis());
	HashMap<String,Integer> coms;
	Commands comds = new Commands();
	Character john = new Character();
	Character jesus = new Character();
	WareHouse i18 = new WareHouse("Warehouse",john);
	WorkPlace i21 = new WorkPlace("Pizzeria",john);
	Industry i11 = new Industry("Industry inc",john);
	Beach i2 = new Beach("Beach", john);
	Alley i20 = new Alley("Alley", john);
	SellBLocation i1 = new SellBLocation("Trainstation", john);
	SellBLocation i6 = new SellBLocation("Park", john);
	SellBLocation i7 = new SellBLocation("Mall", john);
	SellBLocation i13 = new SellBLocation("Movie theatre", john);
	SellBLocation i9 = new SellBLocation("Schoolyard", john);
	RobPlace i4 = new RobPlace("Bar", john);
	RobPlace i16 = new RobPlace("Friends house", john);
	PoliceStation i8 = new PoliceStation("Police", john);
	Airport i3 = new Airport("Airport", john);
	Casino i5 = new Casino("Casino", john);
	Basement i19 = new Basement ("Basement", john);
	Pool i10 = new Pool ("Pool", john);
	Pharmacy i12 = new Pharmacy("Pharmacy", john);
	Fleamarket i14 = new Fleamarket ("Fleamarket", john);
	Kiosk i17 = new Kiosk ("Kiosk", john);
	Home i15 = new Home("Home", john);

	CenterPark l8 = new CenterPark("Center Park", john);
	WarehouseArea l9 = new WarehouseArea("Warehouse Area", john);
	CAtteShip l7 = new CAtteShip("Chalck", john);

	public GC(){

		this.coms = new HashMap<String,Integer>();
		this.coms.put("it is a good day to die",162);
		this.coms.put("look", 1);
		this.coms.put("loot", 1);
		this.coms.put("go", 1);
		this.coms.put("fight",2);
		this.coms.put("item list",0);
		this.coms.put("ask for help",1);
		this.coms.put("buy scratchs",1);
		this.coms.put("get lucky",1);
		this.coms.put("fly away",1);
		this.coms.put("rob",3);
		this.coms.put("sell the furniture",5);
		this.coms.put("swim",3);
		this.coms.put("take",1);
		this.coms.put("work",1);
		this.coms.put("get lucky",1);
		this.coms.put("buy painkillers",1);
		this.coms.put("buy tickets",1);
		this.coms.put("sell booze",1);
		this.time = 6;
		this.timeleft = 6 ;
		//location creation
		l7.addLoc(i15);
		//l1.addLoc(l8);  //link to
		//l1.addLoc(l9);	//link to
		//location creation end
		//newer locations link up creation
		john.setLoc(i15);
		i1.addLoc(i2);
		i1.addLoc(i3);
		i1.addLoc(i4);
		i2.addLoc(i1);
		i2.addLoc(i4);
		i2.addLoc(i6);
		i3.addLoc(i1);
		i3.addLoc(i4);
		i4.addLoc(i1);
		i4.addLoc(i3);
		i4.addLoc(i2);
		i4.addLoc(i20);
		i5.addLoc(i6);
		i5.addLoc(i8);
		i5.addLoc(i7);
		i6.addLoc(i5);
		i6.addLoc(i8);
		i6.addLoc(i9);
		i6.addLoc(i2);
		i7.addLoc(i5);
		i7.addLoc(i8);
		i7.addLoc(i9);
		i8.addLoc(i5);
		i8.addLoc(i6);
		i8.addLoc(i7);
		i8.addLoc(i9);
		i9.addLoc(i6);
		i9.addLoc(i8);
		i9.addLoc(i7);
		i9.addLoc(i10);
		i10.addLoc(i14);
		i10.addLoc(i11);
		i10.addLoc(i12);
		i10.addLoc(i13);
		i11.addLoc(i10);
		i11.addLoc(i12);
		i11.addLoc(i13);
		i11.addLoc(i15);
		i12.addLoc(i11);
		i12.addLoc(i14);
		i12.addLoc(i13);
		i13.addLoc(i10);
		i13.addLoc(i11);
		i13.addLoc(i12);
		i13.addLoc(i14);
		i14.addLoc(i10);
		i14.addLoc(i12);
		i14.addLoc(i13);
		i15.addLoc(i11);
		i15.addLoc(i16);
		i15.addLoc(i19);
		i15.addLoc(i18);
		i15.addLoc(i20);
		i16.addLoc(i17);
		i16.addLoc(i18);
		i16.addLoc(i15);
		i17.addLoc(i16);
		i17.addLoc(i18);
		i17.addLoc(i20);
		i18.addLoc(i20);
		i18.addLoc(i17);
		i18.addLoc(i16);
		i18.addLoc(i15);
		i19.addLoc(i15);
		i20.addLoc(i4);
		i20.addLoc(i17);
		i20.addLoc(i18);
		i20.addLoc(i15);



		//link up end
	}
	public void iAm(Character player){
		this.john = player;
	}
	public String finalBattle(){

		Scanner in=new Scanner(System.in);
		String[] enemies = { "Older brother Harpo", "Younger brother Max" };
		int health = john.getHp();
		int attackDamage = john.getDmgOut();
		int numHealthPotions = john.getPainkillers();
		int healthPotionHealAmount = 80;

		boolean running = true;

		System.out.println("This might be the final confrontation. These Cons are hideous.");
		System.out.println("Use 1 and 2 for Input");
		while(running) {
			System.out.println("------------------------------------------------");
			int enemyAttackDamage = 40;
			int enemyHealth = 170;
			String enemy = enemies[rand.nextInt(enemies.length)];
			if(Arrays.asList(enemy).contains("Older brother Harpo")) {
				enemyAttackDamage = enemyAttackDamage+30; 
			}
			System.out.println("\t# " +enemy+ " is #\n");


			while(enemyHealth > 0) {
				System.out.println("\tYour HP: " + health);
				System.out.println("\t" + enemy + "'s HP: " + enemyHealth);   
				System.out.println("\n\tWhat would you like to do?");   
				System.out.println("\t1. Attack");    
				System.out.println("\t2. Take painkiller, they look delicious");     
				System.out.println("\tYou can't run away from this.");   

				String input = in.nextLine();
				if(input.equals("1"))  {
					int damageDealt = 30+(rand.nextInt(attackDamage-30));
					int damageTaken1 = 20+rand.nextInt(enemyAttackDamage-25);
					int damageTaken2 = 20+rand.nextInt(enemyAttackDamage-25);


					enemyHealth -= damageDealt;
					health -= (damageTaken1+damageTaken2);

					System.out.println("\t> You strike the " + enemy + " for " + damageDealt + "damage.");
					System.out.println("\t> You receive " + (damageTaken1+damageTaken2) + " in retaliation!");


					if(health < 1)  {
						System.out.println("\t> You have taken too much damage!");
						return "you dead";

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
				} else {
					System.out.println("\tInvalid command ");
				}
			}

			if(health < 1) {
				System.out.println("You limp out of the pit, weak from battle.");
				return "you dead";
			}

			System.out.println("--------------------------------------------");
			System.out.println(" # " + enemy + " was defeated! # ");
			System.out.println(" # You have " + health + " HP left. #");
			System.out.println("--------------------------------------------");

			System.out.println("#####################################");
			System.out.println(" YOU MADE IT, CUT THE SNAKE'S HEAD ! ");
			System.out.println("#####################################");
			return "you win";
		}
		in.close();
		return "derp";
	}
	public void credits(){
		System.out.println();
		System.out.println("Credits");
		System.out.println();
		System.out.println("TEAM 7");
		System.out.println();
		System.out.println("Game logic engine by Timo");
		System.out.println();
		System.out.println("Battle systems by Joni");
		System.out.println();
		System.out.println("Story by Commander Atte");

	}
	public void checkComs(){
		for(String j:coms.keySet()){
			if(john.getLoc().command(j) instanceof Commands && coms.get(j)<=timeleft){
				System.out.print(j+", ");
			}
		}
		System.out.println();
	}
	public void checkIf(String g){
		if(john.getLoc().command(g) instanceof Commands) {
			if(coms.get(g)==162){

			} else {
				if(coms.get(g)<=timeleft){
				}	else {
					this.time = 6;
				}
			} 
		}
	}

	public void load(String s) throws InterruptedException{

		//should move the game setups to Main.java
		if(s.equals("New")){
			this.day = 0;
			this.game = "New Game";
			System.out.println(game);
			System.out.println("You have Started a new game.");
			Scanner theScanner= new Scanner(System.in);
			System.out.print("Input your name: ");
			john.setName(theScanner.nextLine());
			System.out.println("Your name is "+ john.getName() +".");

			//easter egg
			if (john.getName().equals("Atte")){
				i15.addLoc(l7);
			} else if(john.getName().equals("Rick")){
				john.setMoney(575239000);
			}
			else if(john.getName().equals("Joe")){
				john.setBooze(8000);
			}
			//easter egg 

			//story printer start
			try {

				FileReader fileReader = new FileReader("The story.txt");
				BufferedReader reader = new BufferedReader(fileReader);
				String lein = null;
				while ((lein = reader.readLine()) != null){
					System.out.println(lein);
					TimeUnit.MILLISECONDS.sleep(0);
				}
				reader.close();
			} catch(IOException ex) {
				ex.printStackTrace(); //catch a fish 9002
			}

			//story printer end

			//should move the game setups to Main.java
			Scanner sc = new Scanner(System.in);

			while (!game.equals("over")){
				if (day >= 5){  // check date 
					if(john.getMoney()>=5000){
						System.out.println("As you hear a knock on the door. After a few seconds of thinking you realize, that it is Friday and what the\nknocking means. It is time to pay your debt one way or another. Luckily you have managed to gather all the\nmoney needed and you open the door. The same group you met on Monday stands in front of your door.\nThe group push you back to your house and pin you against the wall by your neck. “Where is the money the\nshort man asked.” Gasping for air you point at the kitchens table where the money is packed in a paperbag.\n The short man looks into the bag and chuckles:” I this is enough. Let’s go boys.” One of the big men picks\n up the bag and leaving you gasping for air on your floor. Once you have managed to regain your composure\n you sigh:” What a week”");
					} else {
						System.out.println("You walk home and sleep a while.");
						System.out.println("Friday afternoon is nearing its end and you are shaking violently. Soon those people from mafia will arrive\nand you don’t have the money. How has it come to this? And how did I spend that money in the first place?\nWell that is not important, what is more important is how am I going to survive? Maybe I wil- Your\nthoughtprocess was cut short as you hear banging on the door…. You take your knife and proceed to the\ndoor.");
						if(finalBattle().equals("you win")){
							System.out.println("Your hands are shaking as you see the collectors lying on the floor, blood oozing out of their bodies. “Are\nyou happy now?” you hear a voice in your head saying “those were human lives. With families” it continues\nas you start panicking. After you realize what you have done you decide to bury the bodies. Next Monday\nyou hear a banging on the door and there are three policemen standing in front of your door. It seems that\nthey have found the bodies but they offered a deal. They won’t arrest you since if you will pay them 5000\neuros until Friday. Will you take up on the offer?");
						}else{
							System.out.println("You feel your bruised body going numb as you fall down to the floor. The last thing you see before you fall\nto your eternal sleep is the tree men searching for something in your room. Before your eyes close\nthe words:” this just isn’t my day” escape your lips.");
						}
					}
					this.game = "over";
				} else { // main while

					//new command system theGameV4

					System.out.println("You are in the " + john.getLoc().getName());	//current location

					while (this.timeleft > 0 && !game.equals("over")){
						System.out.println("time total: " + this.time);
						System.out.println("remaining time left: " + this.timeleft);
						System.out.print("You can: ");
						checkComs();								//check what commands current location has
						String in = sc.nextLine();
						checkIf(in);
						john.getLoc().player(john);										//feed the locations commands the current player state
						if(john.getLoc().command(in) instanceof Commands){  				//primary command checker
							String ComIn = john.getLoc().command(in).run();					//run the regular command and bind it so it doesn't run it multiple time on checks
							if(ComIn.equals("String")){					// Commands class checker if further input
								String inS= sc.nextLine();									//take 2nd input after in as requested on primary checker
								String stringOut = john.getLoc().command(in).runString(inS);	//run command with 2nd input and set returned String to comOutS
								this.time =this.time+coms.get(in);							//loop time used increaser
								this.timeleft = this.timeleft-coms.get(in);					// loop time left reducer
								if(john.getLoc().nxtLoc(stringOut) instanceof Location) {		//catch location changing (nothing should give out location name string
									john.setLoc(john.getLoc().nxtLoc(stringOut));				//set new location
								}
							} else if(ComIn.equals("Character")){					// Commands class checker if further input
								String inS= sc.nextLine();									//take 2nd input after in as requested on primary checker
								Character player = john.getLoc().command(in).runCha(inS);	//run command with 2nd input and set returned Character to player
								iAm(player);												//call GC method to set current player state to return value
								this.time =this.time+coms.get(in);							//loop time used increaser
								this.timeleft = this.timeleft-coms.get(in);					// loop time left reducer
							} else if(ComIn.equals("Integer")){			// Commands class checker if further input
								int inI= Integer.parseInt(sc.nextLine());					//take integer with scanner bound to integer and take integer 
								int intOut = john.getLoc().command(in).runInt(inI);			//run command with 2nd input and set returned integer to integer intOut
								System.out.println(intOut);									// no further instructions print out value after
								this.time =this.time+coms.get(in);							//loop time used increaser
								this.timeleft = this.timeleft-coms.get(in);					// loop time left reducer
							}  else if(ComIn.equals("Game Over")){			// Commands class checker if further input
								this.game ="over";
							}  else if(ComIn.equals("BATTLE")){			// hax to final battle
								this.day =2357;
								this.timeleft =0;
							}else {
								System.out.println(ComIn);				//print out main command result if no specification
								this.time =this.time+coms.get(in);							//loop time used increaser
								this.timeleft = this.timeleft-coms.get(in);					// loop time left reducer
							}
						} else {											//errors
							System.out.println("input error");
						}
						System.out.println("You are in the " + john.getLoc().getName());	//current location
					}
					//new command system end

					//The time mechanism
					this.timeleft = 6;
					if(this.time >= 24){
						System.out.println("The sun has set and the moon is shining. Maybe it is time to get to sleep?");
						this.time=this.time-24;
						this.jesus=this.john;
						this.day++;
					} else if(this.time==6) {
						System.out.println("Rise and shine Mr. Anderson. Rise and shine. Not that i wish to imply that you were sleeping on the job but you need some money.");
					} else if(this.time==12) {
						System.out.println("The sun is in its highest peak and the day is halfway through.");
					} else if(this.time==18) {
						System.out.println("As the sun starts to set you start feeling a bit tired. Hang in there dude.");
					}
				}
				//jesus saves
				if(this.day<5 && game.equals("over")){			//catch game over before time is up
					int r = 3;
					System.out.println("Game Over");
					while(r>0){
						System.out.println("Do you wish to continue from the start of the day");
						String in = sc.nextLine();
						if(in.equals("yes")){
							iAm(this.jesus);				//reload char state from earlier
							this.time = 0;					//reset time to the start of the day;
							break;
						} else if(in.equals("no")){
							this.game="over";
							break;
						}
						r--;
					}
				}
			}
			sc.close();
			theScanner.close();
			System.out.println();
			System.out.println("Game Over");
			credits();
		}	
	}
}
