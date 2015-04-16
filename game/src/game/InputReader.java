package game;

import java.util.*;

public class InputReader {
	
	static Scanner playerInput = new Scanner(System.in);
	
	public static String getPlayerInput() {
		System.out.println("Type something:");
		String inputLine = playerInput.nextLine();
		inputLine.toLowerCase();
		return inputLine;
	}
}