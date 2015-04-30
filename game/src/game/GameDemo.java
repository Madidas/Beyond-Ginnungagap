package game;
import java.io.*;
import java.util.*;

//
//
// GameDemo
//
// Demonstrates a simple gaming system, loaded from
// a persistent object store.
//
// Last modification date : December 20, 1997
//
class GameDemo
{
	private static final String filename = "gameworld.dat";

	// GameWorld
	private GameWorld game;

	// Game demo constructor
	public GameDemo() throws Exception
	{
		// Create a file input stream
		FileInputStream fin = new FileInputStream(filename);

		// Create an object input stream
		ObjectInputStream objectIn = new ObjectInputStream(fin);

		// Read an object in from object store, and cast it to a GameWorld
		game = (GameWorld) objectIn.readObject();

		// Set the object stream to standard output
		game.setOutputStream ( System.out, 40 );
	}

	public static void main(String args[]) throws Exception
	{
		new GameDemo().play();
	}

	public void play() throws IOException
	{
		String command = null;

		for (;;)
		{
			// Show location
			game.showLocation();

			command = InputReader.getPlayerInput();

			// Search for an exit match
			for (Enumeration e = game.getCurrentLocation().getExits().elements(); e.hasMoreElements();)
			{
				Exit an_exit = (Exit) e.nextElement();

				if ( (an_exit.getDirectionName().compareTo(command) == 0) ||
					 (an_exit.getShortDirectionName().compareTo(command) == 0 )
				   )
				{
					// Set location to the location pointed to by exit
					game.setCurrentLocation( an_exit.getLeadsTo() );

					// No need to search exits anymore
					break;
				}
			}

			// Check to see if user wants to quit
			if (command.compareTo( "QUIT" ) == 0)
			{
				System.out.println ("Okay. Bye!");
				break;
			}

			// Time to save this stuff
			if (command.compareTo( "SAVE" ) == 0)
			{
				System.out.println ("Time to save and exit...");

				// Create a file to write game system
				FileOutputStream out = new FileOutputStream (filename);

				// Create an object output stream, linked to out
				ObjectOutputStream objectOut = new ObjectOutputStream (out);

				// Write game system to object store
				objectOut.writeObject (game);

				// Close object output stream
				objectOut.close();

				//Time to shut down
				break;

			}
		}
	}
}
