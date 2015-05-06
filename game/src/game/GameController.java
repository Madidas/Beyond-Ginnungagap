package game;

import java.io.*;
import java.util.*;

// Demonstrates a simple gaming system, loaded from
// a persistent object store.

class GameController {
	private static final String filename = "gameworld.dat";

	// GameWorld
	private GameWorld game;

	// Game demo constructor
	public GameController() throws Exception {
		// Create a file input stream
		FileInputStream fin = new FileInputStream(filename);

		// Create an object input stream
		ObjectInputStream objectIn = new ObjectInputStream(fin);

		// Read an object in from object store, and cast it to a GameWorld
		game = (GameWorld) objectIn.readObject();

		// Set the object stream to standard output
		game.setOutputStream(System.out, 40);

		// Close object input stream
		objectIn.close();
	}

	public static void main(String args[]) throws Exception {
		new GameController().play();
	}

	public void play() throws Exception {
		String command = null;

		for (;;) {
			// Show location
			game.showLocation();

			if (game.getCurrentLocation().getName().equals("Emergency Shuttle")) {
				End.endingS();
			}

			else if (game.getCurrentLocation().getName().equals("Control Room")) {
				End.endingCR();
			}

			command = InputReader.getPlayerInput();
			int roomNumber = 0;

			// Possible Narrator... does not work
			if (command.compareTo("HELP") == 0) {

				if (game.getCurrentLocation().getName().equals("Corridor")) {
					roomNumber = 3;
				} else if (game.getCurrentLocation().getName().equals("Vent")) {
					roomNumber = 4;
				} else if (game.getCurrentLocation().getName()
						.equals("Kitchen Freezer")) {
					roomNumber = 12;
				} else if (game.getCurrentLocation().getName()
						.equals("Escape Shuttle")) {
					roomNumber = 15;
				} else if (game.getCurrentLocation().getName()
						.equals("Kitchen Storage Room")) {
					roomNumber = 11;
				} else if (game.getCurrentLocation().getName()
						.equals("Elevator")) {
					roomNumber = 5;
				}
				// System.out.println(roomNumber);

				/*
				 * This one will not be finished... Too many good ideas not so
				 * much time left.
				 */

				int number = (int) (Math.random() * 3 + 1);
				// First one is Death
				if (number == 1) {
					switch (roomNumber) {
					case 12: {
						System.out
								.println("DEATH: I THINK YOU MIGHT HAVE DONE SOMETHING TERMINAL FOR MY EXPERIENCE");
						break;
					}
					case 3: {
						System.out
								.println("DEATH: THIS PLACE LOOKS RATHER NOT FRIENDLY.");
						break;
					}
					case 15: {
						System.out
								.println("DEATH: YOU MIGHT HAVE SAVED YOURSELF NOW. SEE, THERE ARE CAT HERE ALREADY");
						break;
					}

					}

				}
				// Second one is Thor
				if (number == 2) {
					switch (roomNumber) {
					case 12: {
						System.out
								.println("Thor: You have any beer... I take it and don't help you.");
						break;
					}
					case 3: {
						System.out
								.println("Thor: It is dark and there are no beer here.");
						break;
					}
					case 11: {
						System.out.println("Thor: Any beer here ?");
						break;
					}
					case 5: {
						System.out
								.println("Thor: Too much speed for me... More beer NOW.");
						break;
					}

					}
				}
				// Third one is Bastet/Cat
				if (number == 3) {
					switch (roomNumber) {
					case 12: {
						System.out.println("Bastet: You majorly screwed now !");
						break;
					}
					case 3: {
						System.out
								.println("Bastet: Just be carefull... it is dark here.");
						break;
					}
					case 11: {
						System.out.println("Bastet: Yeah, free food for me.");
						break;
					}
					case 5: {
						System.out
								.println("Bastet: And here we go up and down... Hopefully down means your life ending.");
						break;
					}
					case 4: {
						System.out
								.println("Bastet: I like small places, where you can slowly die.");
						break;
					}
					}
				}
			}

			/*
			 * Integer roomNumber = game.getCurrentLocation().getNumber();
			 * //System.out.println(roomName);
			 * Narrator.talkNarrator(roomNumber);
			 */

			// Search for an exit match
			for (Enumeration<Exit> e = game.getCurrentLocation().getExits()
					.elements(); e.hasMoreElements();) {
				Exit an_exit = (Exit) e.nextElement();

				if ((an_exit.getDirectionName().compareTo(command) == 0)
						|| (an_exit.getShortDirectionName().compareTo(command) == 0)) {
					// Set location to the location pointed to by exit
					game.setCurrentLocation(an_exit.getLeadsTo());

					// No need to search exits anymore
					break;
				}
			}

			// Check to see if user wants to quit
			if (command.compareTo("QUIT") == 0) {
				System.out.println("Okay. Bye!");
				break;
			}

			// Time to save this stuff
			if (command.compareTo("SAVE") == 0) {
				System.out.println("Time to save and exit...");

				// Create a file to write game system
				FileOutputStream out = new FileOutputStream(filename);

				// Create an object output stream, linked to out
				ObjectOutputStream objectOut = new ObjectOutputStream(out);

				// Write game system to object store
				objectOut.writeObject(game);

				// Close object output stream
				objectOut.close();

				// Time to shut down
				break;

			}
		}
	}
}
