package game;

public class Narrator {

	public static void talkNarrator(Integer cat) {
		
		//System.out.println(cat);
		String playerName = Intro.playerName();
		int Cat = cat;
		
		/*This one will not be finished...
		 * Too many good ideas not so much time left.
		 */
		
		int number = randomNumber();
		
		//First one is Death
		if (number == 1) {
			switch(Cat) {
			case 12: {
				System.out.println("DEATH: I THINK YOU MIGHT HAVE DONE SOMETHING TERMINAL FOR MY EXPERIENCE, " + playerName);
			}
			case 3: {
				System.out.println("DEATH: THIS PLACE LOOKS RATHER NOT FRIENDLY.");
			}
			case 15: {
				System.out.println("DEATH: YOU MIGHT HAVE SAVED YOURSELF NOW " + playerName + ". SEE, THERE ARE CAT HERE ALREADY");
			}
			
			}

		}
		//Second one is Thor
		if (number == 2) {
			switch(Cat) {
			case 12: {
				System.out.println("Thor: You have any beer... I take it and don't help you.");
			}
			case 3: {
				System.out.println("Thor: It is dark and there are no beer here.");
			}
			case 11: {
				System.out.println("Thor: Any beer here ?");
			}
			case 5: {
				System.out.println("Thor: Too much speed for me... More beer NOW.");
			}
			
		}
		}
		//Third one is Bastet/Cat
		if (number == 3) {
			switch(Cat) {
			case 12: {
				System.out.println("Bastet: You majorly screwed now " + playerName + " !");
			}
			case 3: {
				System.out.println("Bastet: Just be carefull... it is dark here.");
			}
			case 11: {
				System.out.println("Bastet: Yeah, free food for me.");
			}
			case 5: {
				System.out.println("Bastet: And here we go up and down... Hopefully down means your life ending.");
			}
			case 4: {
				System.out.println("Bastet: I like small places, where you can slowly die.");
			}
			}
		}
	}
	private static int randomNumber() {
		int genNumber;
		genNumber = (int) (Math.random() * 3 + 1);
		return genNumber;
	}

}
