package game;

public class Narrator {

	public static void talkNarrator(Object number) {
		
		String umber = (String)number;
		System.out.println(umber);
		
		
		//First one is Death
		if (randomNumber() == 1) {
			switch(umber) {
			case "1": {
				
			}
			case "2": {
				
			}
			case "3": {
				
			}
			case "4": {
				
			}
			case "5": {
				
			}
			}

		}
		//Second one is Thor
		if (randomNumber() == 2) {
			switch(umber) {
			case "1": {
				
			}
			case "2": {
				
			}
			case "3": {
				
			}
			case "4": {
				
			}
			case "5": {
				
			}
		}
		}
		//Third one is Bastet/Cat
		if (randomNumber() == 3) {
			switch(umber) {
			case "1": {
				
			}
			case "2": {
				
			}
			case "3": {
				
			}
			case "4": {
				
			}
			case "5": {
				
			}
			}
		}

	private static int randomNumber() {
		int genNumber;
		genNumber = (int) (Math.random() * 3 + 1);
		return genNumber;
	}

}
