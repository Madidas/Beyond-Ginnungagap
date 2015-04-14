package game;

import java.util.*;

public class InputReader {
	
	Scanner playerInput = new Scanner(System.in);
	
	public String getPlayerInput() {
		System.out.println("Type something:");
		String inputLine = playerInput.nextLine();
		inputLine.toLowerCase();
		return inputLine;
	}
}