package game;

public class Menu {

	public static void mainMenu() throws Exception {
		
		boolean keepGoing = true;
		
		while (keepGoing == true) {
			System.out.println("Choose number: \n1:Start New Game\n2:Load Saved Game\n"
					+ "3.Quit");
			String number = InputReader.getPlayerInput();
			switch(number) {
			case "1": {
				//WorldCreation wg = new WorldCreation();
				WorldCreation.main(null);
				GameDemo gd = new GameDemo();
				gd.play();
			}
			case "2": {
				GameDemo gd = new GameDemo();
				gd.play();
			}
			case "3": {
				System.out.println("Goodbey... You tiny Heathen.");
				keepGoing = false;
				
			}
	}
}
}
}