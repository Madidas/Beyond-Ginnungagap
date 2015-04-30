package game;

public class GameEngine {

	//InputReader theInputReader = new InputReader(); //Here game controller
	
	//Room theTestRoom = new TestRoom();
	
	//private static InputReader getInputReader;
	
	public void startGame() {
		printTestRoomItems();
		printInventory();
		geTestRoom.setRoomItems();
		takeItem();
		printInventory();
		printTestRoomItems();
	}
	
	public void getInput() {
		//System.out.println("Testing inputs");
		String playerInput = InputReader.getPlayerInput();
		System.out.println(playerInput);
	}
	
	Inventory geInventory = new Inventory();
	TestRoom geTestRoom = new TestRoom();
	
	public void takeItem() {
		geTestRoom.removeTestroomItem();
		geInventory.addInventoryItem();
	}
	
	public void printInventory() {
		System.out.println("Items currently in inventory:");
		
		for (String name: geInventory.inventoryItems.keySet()) {
			System.out.println(name);
		}
	}
	
	public void printTestRoomItems() {
		System.out.println("Items currently in room:");
		
		for (String name: geTestRoom.testroomItems.keySet()) {
			System.out.println(name);
		}
	}
}
