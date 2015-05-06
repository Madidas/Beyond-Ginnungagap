package game;
import java.util.*;
import java.io.*;

//
public class GameWorld implements Serializable
{

	// List of Location objects
	private Vector<Room> locations;

	// List of Exit objects
	private Vector<Exit> exits;

	// The current location of the player
	private Room currentLocation;

	// Character width for descriptions
	private int charWidth;
	

	// Output stream for gaming system
	transient private WidthLimitedOutputStream output;

	// GameWorld constructor
	public GameWorld()
	{
		// Instantiate vector lists for location/exits
		locations = new Vector<Room>();
		exits = new Vector<Exit>();

		// The default location of a player isn't known
		currentLocation = null;

		// By default, use standard output
		setOutputStream (System.out, 80);
	}

	// GameWorld constructor
	public GameWorld(int characterWidth )
	{
		// Call default constructor
		this();

		charWidth = characterWidth;
	}

	/** Returns the current location of the player */
	public Room getCurrentLocation()
	{
		return currentLocation;
	}

	/** Assigns a new location to the current location of the player */
	public void setCurrentLocation(Room newRoom)
	{
		currentLocation = newRoom;		
	}

	/** Adds a new exit to the gaming system */
	public void addExit( Exit exit )
	{
		// Check if exit vector already contains exit
		if (! exits.contains ( exit ) )
			// Exit doesn't exist, and must be added
			exits.addElement ( exit);
	}

	/** Adds a new location to the gaming system */
	public void addRoom( Room location )
	{
		// Check if location vector already contains location
		if (! locations.contains ( location ) )
			// Location doesn't exist, and must be added
			locations.addElement( location );
	}

	/** Sets the output stream for the gaming system */
	public void setOutputStream(OutputStream out, int width)
	{
		output = new WidthLimitedOutputStream(out, width) ;
	}
	
	/**
	
	/** Shows the current game location */
	public Integer showNumber() {
		Integer number = getCurrentLocation().getNumber();
		return number;
	}
	
	public void showLocation()
	{
		// Show title
		output.println ( currentLocation.getName() );

		// Show description
		output.println ( currentLocation.getInfo() );

		output.println();

		// Show available exits
		if (!currentLocation.getName().equals("Keypad")) {
			output.println ( "Available exits :" );
	
			// Traverse elements of vector
			for (Enumeration<?> e = currentLocation.getExits().elements(); e.hasMoreElements();)
			{
				// Get next exit
				Exit an_exit = (Exit) e.nextElement();
	
				// Print exit to our output stream
				output.println (an_exit.toString());
			}
		}
		//Return value for current room
	}

}
