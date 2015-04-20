package game;

public class Menu {
	
	private static boolean b;

	public static void mainMenu() {
		InputReader theInputReader = new InputReader();
		
		while (true) {
			System.out.println("Choose: \n1:Start New Game\n2:Load Saved Game\n"
					+ "3.Quit");
			String number = InputReader.getPlayerInput();
			switch(number) {
			case "1": {
				GameEngine ge = new GameEngine();
				ge.startGame();
			}
			case "2": {
				return;
			}
			case "3": {
				System.exit(0);
			}
	}
}
}
}