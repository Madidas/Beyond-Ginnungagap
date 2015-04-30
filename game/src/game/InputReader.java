package game;

import java.util.*;

public class InputReader {

	static Scanner playerInput = new Scanner(System.in);

	public static String getPlayerInput() {

		int x = 0;
		String inputLine;

		do {
			System.out.println("Type something:");
			inputLine = playerInput.nextLine();
			//System.out.println(inputLine);
			inputLine = inputLine.toUpperCase();
			if (inputLine.length() != 0) {
				x = 1;
				System.out.println();
			} else {
				System.out.println("Try again you failure.");
			}
		} while (x == 0);

		return inputLine;
	}
}
