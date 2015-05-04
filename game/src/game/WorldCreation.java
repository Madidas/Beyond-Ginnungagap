package game;
import java.io.*;

public final class WorldCreation
{
	public static String filename = "gameworld.dat";

	public static void main(String args[])
	{
		// GameWorld
		GameWorld game;

		// Create a new instance of a GameWorld
		game = new GameWorld();

		// Create room objects
		Room bunk 			= new Room (1, "Spaceship's bunk bed", "You wake up in your sleep woken up by Death.");
		Room cabin 			= new Room (2, "Cabin", "You're in a cabin.");
		Room corridor1 		= new Room (3, "Corridor", "You're in a dimly lit corridor.");
		Room corridor3		= new Room (3, "Corridor", "You're in a dimly lit corridor. To west there's a vent large enough for you to crawl in. The corridor continues.");
		Room vent1			= new Room (4, "Vent", "You're crawling in a tight ventilation system.");
		Room corridor4 		= new Room (3, "Corridor", "You're in a dimly lit corridor. There's an elevator and the corridor continues.");
		Room elevator1		= new Room (5, "Elevator", "You're inside an elevator. The elevator can go up and down.");
		Room corridor5 		= new Room (3, "Corridor", "You're in a dimly lit corridor. There's a large storage room on your east side and the corridor continues.");
		Room corridor6 		= new Room (3, "Corridor", "You're in a dimly lit corridor. There's a large storage room on your east side and the corridor continues.");
		Room storageroom 	= new Room (6, "Storage Room", "You're in gigantic storage room. There's a vent in the south east corner.");
		Room vent2			= new Room (4, "Vent", "You're crawling in a tight ventilation system.");
		Room corridor7 		= new Room (3, "Corridor", "You're in a dimly lit corridor.");
		
		Room corridor2 		= new Room (3, "Corridor", "You're in a dimly lit corridor. There's a vent and the corridor continues in three directions.");
		Room vent3			= new Room (4, "Vent", "You're crawling in a tight ventilation system.");
		Room corridor8		= new Room (3, "Corridor", "You're in a dimly lit corridor.");
		Room corridor10		= new Room (3, "Corridor", "You're in a dimly lit corridor.");
		Room elevator2		= new Room (5, "Elevator", "You're inside an elevator. The elevator can go up and down.");
		Room dininghall		= new Room (7, "Dining Hall", "You're in a large dining hall.");
		
		Room engineroom		= new Room (8, "Engine Room", "You're in a loud engine room.");
		Room generatorroom	= new Room (9, "Generator Room", "You're in a loud generator room.");
		
		Room corridor9		= new Room (3, "Corridor", "You're in a dimly lit corridor");
		Room kitchen		= new Room (10, "Kitchen", "You're in a smelly kitchen. There's rotten food everywhere.");
		Room kitchenstorage = new Room (11, "Kitchen Storage Room", "You're in the kitchen's storage room.");
		Room kitchenfreezer = new Room (12, "Kitchen Freezer", "You're in the kitchen's freezer. It's freezingly cold.");
		Room vent4			= new Room (4, "Vent", "You're crawling in a tight ventilation system.");

		// Create exit objects
		Exit bunkout 				= new Exit ( Exit.OUT, cabin );
		
		Exit cabinin 				= new Exit ( Exit.IN, bunk);
		Exit cabinout				= new Exit (Exit.OUT, corridor1);
		
		Exit corridor1in	 		= new Exit (Exit.IN, cabin);
		Exit corridor1north 		= new Exit (Exit.NORTH, corridor2);
		Exit corridor1south 		= new Exit (Exit.SOUTH, corridor3);
		
		Exit corridor3north			= new Exit (Exit.NORTH, corridor1);
		Exit corridor3in			= new Exit (Exit.IN, vent1);
		Exit corridor3east			= new Exit (Exit.EAST, corridor4);
		
		Exit vent1east				= new Exit (Exit.EAST, vent2);
		Exit vent1north				= new Exit (Exit.NORTH,vent3);
		//Exit vent1up				= new Exit (Exit.UP, vent5);
		Exit vent1out				= new Exit (Exit.OUT, corridor3);
		
		Exit corridor4in			= new Exit (Exit.IN, elevator1);
		Exit corridor4north			= new Exit (Exit.NORTH, corridor5);
		Exit corridor4west			= new Exit (Exit.WEST, corridor3);
		
		//Exit elevator1up			= new Exit (Exit.UP, elevator3);
		Exit elevator1out			= new Exit (Exit.UP, corridor4);
		
		Exit corridor5north			= new Exit (Exit.NORTH, corridor6);
		Exit corridor5east			= new Exit (Exit.EAST, storageroom);
		Exit corridor5south			= new Exit (Exit.SOUTH, corridor4);
		
		Exit corridor6north			= new Exit (Exit.NORTH, corridor7);
		Exit corridor6east			= new Exit (Exit.EAST, storageroom);
		Exit corridor6south			= new Exit (Exit.SOUTH, corridor5);
		
		Exit storageroomnorth		= new Exit (Exit.NORTH, corridor6);
		Exit storageroomsouth		= new Exit (Exit.SOUTH, corridor5);
		Exit storageroomin			= new Exit (Exit.IN, vent2);
		
		Exit vent2west				= new Exit (Exit.WEST, vent1);
		Exit vent2north				= new Exit (Exit.NORTH,vent4);
		//Exit vent2up				= new Exit (Exit.UP, vent6);
		Exit vent2out				= new Exit (Exit.OUT, storageroom);
		
		Exit corridor7west			= new Exit (Exit.WEST, corridor8);
		Exit corridor7north			= new Exit (Exit.NORTH, corridor9);
		Exit corridor7south			= new Exit (Exit.SOUTH, corridor6);
		
		Exit corridor8west			= new Exit (Exit.WEST, corridor2);
		Exit corridor8east			= new Exit (Exit.EAST, corridor7);
		
		Exit corridor2south			= new Exit (Exit.SOUTH, corridor1);
		Exit corridor2north			= new Exit (Exit.NORTH, corridor10);
		Exit corridor2east			= new Exit (Exit.EAST, corridor8);
		Exit corridor2in			= new Exit (Exit.IN, vent3);
		
		Exit vent3south				= new Exit (Exit.SOUTH, vent1);
		//Exit vent3up				= new Exit (Exit.UP, vent7);
		Exit vent3out				= new Exit (Exit.OUT, corridor2);
		
		Exit corridor10in			= new Exit (Exit.IN, elevator2);
		Exit corridor10east			= new Exit (Exit.EAST, dininghall);
		Exit corridor10north		= new Exit (Exit.NORTH, engineroom);
		
		//Exit elevator2up			= new Exit (Exit.UP, elevator4);
		Exit elevator2out			= new Exit (Exit.UP, corridor10);
		
		Exit dininghalleast			= new Exit (Exit.EAST, corridor10);
		Exit dininghallwest			= new Exit (Exit.WEST, corridor9);
		
		Exit engineroomsouthwest	= new Exit (Exit.SOUTHWEST, corridor10);
		Exit engineroomsoutheast	= new Exit (Exit.SOUTHEAST, corridor9);
		Exit engineroomeast			= new Exit (Exit.EAST, generatorroom);
		
		Exit generatorroomwest		= new Exit (Exit.WEST, engineroom);
		
		Exit corridor9north			= new Exit (Exit.NORTH, engineroom);
		Exit corridor9west			= new Exit (Exit.WEST, dininghall);
		Exit corridor9south			= new Exit (Exit.SOUTH, corridor7);
		Exit corridor9east			= new Exit (Exit.EAST, kitchen);
		
		Exit kitchenwest			= new Exit (Exit.WEST, corridor9);
		Exit kitchennortheast		= new Exit (Exit.NORTHEAST, vent4);
		Exit kitcheneast			= new Exit (Exit.EAST, kitchenstorage);
		Exit kitchensoutheast		= new Exit (Exit.SOUTHEAST, kitchenfreezer);
		
		Exit vent4south				= new Exit (Exit.SOUTH, vent2);
		//Exit vent4up				= new Exit (Exit.UP, vent8);
		Exit vent4out				= new Exit (Exit.OUT, kitchen);
		
		Exit kitchenstoragewest		= new Exit (Exit.WEST, kitchen);
		Exit kitchenfreezerwest		= new Exit (Exit.WEST, kitchen);

		// Adding exits to correct rooms
		bunk.addExit(bunkout);
		cabin.addExit(cabinin);
		cabin.addExit(cabinout);
		corridor1.addExit(corridor1in);
		corridor1.addExit(corridor1north);
		corridor1.addExit(corridor1south);
		corridor3.addExit(corridor3north);
		corridor3.addExit(corridor3in);
		corridor3.addExit(corridor3east);
		corridor4.addExit(corridor4in);
		corridor4.addExit(corridor4north);
		corridor4.addExit(corridor4west);
		corridor5.addExit(corridor5north);
		corridor5.addExit(corridor5east);
		corridor5.addExit(corridor5south);
		corridor6.addExit(corridor6north);
		corridor6.addExit(corridor6east);
		corridor6.addExit(corridor6south);
	    vent1.addExit(vent1east);				
	    vent1.addExit(vent1north);				
		//vent1.addExit(vent1up);
	    vent1.addExit(vent1out);
		//elevator1.addExit(elevator1up);			
			               		                
	    storageroom.addExit(storageroomnorth);		
	    storageroom.addExit(storageroomsouth);		
	    storageroom.addExit(storageroomin);			
			                       
	    vent2.addExit(vent2west);				
	    vent2.addExit(vent2north);				
		//vent2.addExit(vent2up);
	    vent2.addExit(vent2out);
	    corridor7.addExit(corridor7west);
	    corridor7.addExit(corridor7north);	 
	    corridor7.addExit(corridor7south);	 
	    corridor8.addExit(corridor8west);	 
	    corridor8.addExit(corridor8east);	 
	    corridor2.addExit(corridor2south);	 
	    corridor2.addExit(corridor2north);	 
	    corridor2.addExit(corridor2east);
	    corridor2.addExit(corridor2in);
	    vent3.addExit(vent3south);
	    //vent3.addExit(vent3up);
	    vent3.addExit(vent1out);
	    corridor10.addExit(corridor10in);	 
	    corridor10.addExit(corridor10east);	 
	    corridor10.addExit(corridor10north);	 
	    //elevator2.addExit(elevator2up);
	    elevator2.addExit(elevator2out);
	    dininghall.addExit(dininghalleast);	 
	    dininghall.addExit(dininghallwest);	 
	    engineroom.addExit(engineroomsouthwest);	 
	    engineroom.addExit(engineroomsoutheast);	 
	    engineroom.addExit(engineroomeast);	 
	    generatorroom.addExit(generatorroomwest);	 
	    corridor9.addExit(corridor9north);	 
	    corridor9.addExit(corridor9west);
	    corridor9.addExit(corridor9south);	
	    corridor9.addExit(corridor9east);	
	    kitchen.addExit(kitchenwest);	
	    kitchen.addExit(kitchennortheast);
	    kitchen.addExit(kitcheneast);	
	    kitchen.addExit(kitchensoutheast);	
	    vent4.addExit(vent4south);
	    //vent4.addExit(vent4up);
	    vent4.addExit(vent4out);
	    kitchenstorage.addExit(kitchenstoragewest);
		kitchenfreezer.addExit(kitchenfreezerwest);	

		// Add locations/exits to our game lists
		game.addRoom(bunk);
		game.addRoom(cabin);
		game.addRoom(corridor1);
		game.addRoom(corridor2);
		game.addRoom(corridor3);
		game.addRoom(vent1);
		game.addRoom(corridor4);
		game.addRoom(elevator1);
		game.addRoom(corridor5);
		game.addRoom(corridor6);
		game.addRoom(storageroom);
		game.addRoom(corridor7);
		game.addRoom(vent2);
		game.addRoom(vent3);
		game.addRoom(corridor8);
		game.addRoom(corridor10);
		game.addRoom(elevator2);
		game.addRoom(dininghall);
		game.addRoom(engineroom);
		game.addRoom(generatorroom);
		game.addRoom(corridor9);
		game.addRoom(kitchen);
		game.addRoom(kitchenstorage);
		game.addRoom(kitchenfreezer);
		game.addRoom(vent4);
				
		
		game.addExit(bunkout);
		game.addExit(cabinin);
		game.addExit(cabinout);
		game.addExit(corridor1in);
		game.addExit(corridor1north);
		game.addExit(corridor1south);
		game.addExit(corridor3north);
		game.addExit(corridor3in);
		game.addExit(corridor3east);
		game.addExit(corridor4in);
		game.addExit(corridor4north);
		game.addExit(corridor4west);
		game.addExit(corridor5north);
		game.addExit(corridor5east);
		game.addExit(corridor5south);
		game.addExit(corridor6north);
		game.addExit(corridor6east);
		game.addExit(corridor6south);
	    game.addExit(vent1east);				
	    game.addExit(vent1north);				
		//game.addExit(vent1up);
	    game.addExit(vent1out);
		//game.addExit(elevator1up);
	    game.addExit(elevator1out);
			               		                
	    game.addExit(storageroomnorth);		
	    game.addExit(storageroomsouth);		
	    game.addExit(storageroomin);			
			                       
	    game.addExit(vent2west);				
	    game.addExit(vent2north);				
		//game.addExit(vent2up);
	    game.addExit(vent2out);
	    game.addExit(corridor7west);
	    game.addExit(corridor7north);	 
	    game.addExit(corridor7south);	 
	    game.addExit(corridor8west);	 
	    game.addExit(corridor8east);	 
	    game.addExit(corridor2south);	 
	    game.addExit(corridor2north);	 
	    game.addExit(corridor2east);
	    game.addExit(vent3south);
	    //game.addExit(vent3up);
	    game.addExit(vent3out);
	    game.addExit(corridor10in);	 
	    game.addExit(corridor10east);	 
	    game.addExit(corridor10north);	 
	    //game.addExit(elevator2up);
	    game.addExit(elevator2out);
	    game.addExit(dininghalleast);	 
	    game.addExit(dininghallwest);	 
	    game.addExit(engineroomsouthwest);	 
	    game.addExit(engineroomsoutheast);	 
	    game.addExit(engineroomeast);	 
	    game.addExit(generatorroomwest);	 
	    game.addExit(corridor9north);	 
	    game.addExit(corridor9west);
	    game.addExit(corridor9south);	
	    game.addExit(corridor9east);	
	    game.addExit(kitchenwest);	
	    game.addExit(kitchennortheast);
	    game.addExit(kitcheneast);	
	    game.addExit(kitchensoutheast);	
	    game.addExit(vent4south);
	    //game.addExit(vent4up);
	    game.addExit(vent4out);
	    game.addExit(kitchenstoragewest);
		game.addExit(kitchenfreezerwest);				                   
				
		
		// Set current location
		game.setCurrentLocation (bunk);

		try
		{
			// Create a file to write game system
			FileOutputStream out = new FileOutputStream (filename);

			// Create an object output stream, linked to out
			ObjectOutputStream objectOut = new ObjectOutputStream (out);

			// Write game system to object store
			objectOut.writeObject (game);

			// Close object output stream
			objectOut.close();

			System.out.println ("Game data created as " + filename );
		}
		catch (Exception e)
		{
			System.err.println ("Unable to create game data");
		}



	}

}
