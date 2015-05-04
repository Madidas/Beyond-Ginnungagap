package game;

public class Menu {

	public static void mainMenu() throws Exception {
		
		while (true) {
			System.out.println("Choose: \n1:Start New Game\n2:Load Saved Game\n"
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
				continue;
			}
			case "3": {
				System.out.println("Goodbey... You tiny Heathen.");
				System.exit(0);
			}
	}
}
}
}