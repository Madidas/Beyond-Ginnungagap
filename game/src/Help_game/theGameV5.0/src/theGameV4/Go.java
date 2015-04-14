package theGameV4;

public class Go extends Commands{
	
	Location loc;
	
	public Go(Location loc){
		this.loc = loc;
	}
	public String run(){
		System.out.println("You can go to: ");					//build input question for command
		loc.getPlaces();										//invoke method from super print locations inside location
		return "String";
	}
	public String runString(String t){
		Location next = loc.nxtLoc(t);							//set out put location to variable
		if (next != null){ 										//character location checker ,sets char location
			if(loc.getVisited() != true){						//entry message system
				if(next.getName().equals("Beach")){
					System.out.println("This is a once in a lifetime chance Anderson. That is if you don't survive. So sell that booze and get some money");
				} else if(next.getName().equals("Alley")){
					System.out.println("You feel a sense of dread wash over you as you enter the valley. Something isn't just right.");
				} else if(next.getName().equals("Bar")){
					System.out.println("As you step in you see some of the regulars on sitting near the counter.");
				} else if(next.getName().equals("Casino")){
					System.out.println("As you step in you can sense the excitement in the air as you head to the tables");
				} else if(next.getName().equals("Police")){
					System.out.println("As you enter you see a group of policemen working on some paperwork. You walk towards the frontdesk…");
				} else if(next.getName().equals("Park")){
					System.out.println("You see many people around with their families enjoying the good wather. A good possibillity to gain some money");
				} else if(next.getName().equals("Pizzeria")){
					System.out.println("The smell of food enters your nostrils as you enter the pizzeria. ");
				} else if(next.getName().equals("Schoolyard")){
					System.out.println("Many young students are drinking these days. It is always good bussines");
				} else if(next.getName().equals("Kiosk")){
					System.out.println("As you enter the kiosk you notice the scratchticket you know that it is a longshot but….");
				} else if(next.getName().equals("Pool")){
					System.out.println("It has been a while since you have been swimming and as you enter you hear someone bragging about their skills. You think that you could beat him at a race and make a bet with him");
				} else if(next.getName().equals("Friends house")){
					System.out.println("This friend of yours owes you some money. You could try to get the money back by asking but robbing him sounds also tempting ");
				} else if(next.getName().equals("Warehouse")){
					System.out.println("You decided to work at an all factory.  Maybe you could get a small bonus if you worked overtime");
				} else if(next.getName().equals("Mall")){
					System.out.println("The mall is busy as any other day. This is a great opportunity to sell your booze. Be vary of the guards though");
				} else if(next.getName().equals("Flea Market")){
					System.out.println("You have decided to tell your old stuff just to get some money out of them. Atleast this got some useless stuff out of your house because of this odreal.\n Every cloud has silver lining");
				} else if(next.getName().equals("Home")){
					System.out.println("Home sweet home as they say.");
				} else if(next.getName().equals("Basement")){
					System.out.println("A heard from a friend that this place is inspired by the movie fightclub. This could be interesting…");
				} else if(next.getName().equals("Movie theatre")){
					System.out.println("Many people want to have some alcohol but can't get their hands on some. And that is where you step in");
				} else if(next.getName().equals("Airport")){
					System.out.println("You are trying to escape. Not sure where but let's hope that those people don't find out.");
				} else if(next.getName().equals("Beach")){
					System.out.println("This is a once in a lifetime chance [player]. That is if you don't survive. So sell that booze and get some money");
				} else if(next.getName().equals("Industry inc")){
					System.out.println("This is your daytimejob.  The salary will arrive soon anyway so you may actually work here too");
				} else if(next.getName().equals("Pharmacy")){
					System.out.println("Get your painkillers here.");
				}
				  else if(next.getName().equals("Trainstation")){
					System.out.println("The trainstation is crowded as usual and this is a great time to scam some tourists by selling them some faketickets");
				}
				
				loc.setVisisted();
			}
			return next.getName();								//give out location name
		} else {
			return "input error";
		}
	}
}
