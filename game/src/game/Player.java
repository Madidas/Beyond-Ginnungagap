package game;

import game.Room.TestRoom;

public class Player  {
	private String playerName = "Viking";

	private class PlayerInventory {
		private static Inventory playerInventory;
		
		public PlayerInventory(Inventory playerInventory) {
			PlayerInventory.playerInventory = playerInventory;
		}
	}
	
	private class PlayerLocation {
		int playerLocation = 1;
		
	}
}
