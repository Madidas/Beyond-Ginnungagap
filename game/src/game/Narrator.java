package game;

import java.util.*;

public class Narrator {

	public static void talkNarrator() {
		//First one is Death
		if (randomNumber() == 1) {

		}
		//Second one is Thor
		if (randomNumber() == 2) {

		}
		//Third one is Bastet/Cat
		if (randomNumber() == 3) {

		}
	}

	private static int randomNumber() {
		int genNumber;
		genNumber = (int) (Math.random() * 3 + 1);
		return genNumber;
	}
}
