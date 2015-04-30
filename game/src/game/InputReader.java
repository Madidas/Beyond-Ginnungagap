package game;

import java.util.*;

public class InputReader {

	static Scanner playerInput = new Scanner(System.in);

	public static String getPlayerInput() {
		System.out.println("Type something:");
		String inputLine = playerInput.nextLine();
		//System.out.println(inputLine);
		inputLine = inputLine.toUpperCase();
		if (inputLine.length !== 0) {
			return inputLine;
			System.out.println();
		} else {
			System.out.println("Try again you failure.");
		}
	}
}
