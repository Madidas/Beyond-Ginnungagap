package game;

public class GameEngine {

	//InputReader theInputReader = new InputReader(); //Here game controller
	
	//Room theTestRoom = new TestRoom();
	
	//private static InputReader getInputReader;
	
	public void startGame() {
		//System.out.println("You will be moved to the test room");
		geInventory.setInventoryItems();
		geInventory.addInventoryItem();
		geInventory.removeInventoryItem();
	}
	
	public void getInput() {
		//System.out.println("Testing inputs");
		String playerInput = InputReader.getPlayerInput();
		System.out.println(playerInput);
	}
	
	public void getRoom() {
		TestRoom.setRoomItems();
	}
	
	Inventory geInventory = new Inventory();
}
