package game;

public class GameEngine {

	//InputReader theInputReader = new InputReader(); //Here game controller
	
	//Player thePlayer = new Player();
	//Room theTestRoom = new TestRoom();
	
	//private static InputReader geInputReader;
	
	public void startGame() {
		System.out.println("You will be moved to the test room");
		//getInput();
		getRoom();
	}
	
	public void getInput() {
		//System.out.println("Testing inputs");
		String playerInput = InputReader.getPlayerInput();
		System.out.println(playerInput);
	}
	
	public void getRoom() {
		Room.TestRoom.setRoomItems();
	}
}
