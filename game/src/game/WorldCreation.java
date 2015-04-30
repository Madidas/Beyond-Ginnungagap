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
		Room bunk = new Room ("Spaceship`s bunk bed", "You wake up in your sleep woken up by Death.");
		Room testroom = new Room ("eufauhew", "hfrhefouahreof");
		

		// Create exit objects
		Exit e1 = new Exit ( Exit.OUT, testroom );
		Exit e2 = new Exit ( Exit.IN, bunk);
		
		// Adding exits to correct rooms
		bunk.addExit (e1);
		testroom.addExit(e2);
	
		// Add locations/exits to our game lists
		game.addRoom (bunk);
		game.addRoom (testroom);
		
		game.addExit(e1);
		game.addExit(e2);

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

