package game;

import java.util.ArrayList;
import java.util.HashMap;

public class Room {
	
	private static Inventory roomInventory;
	
	public Room(Inventory roomInventory) {
		Room.roomInventory = roomInventory;

	class TrapRoom extends Room {
		
	}
	
	class PuzzleRoom extends Room {
		
	}
	
	class ObstacleRoom extends Room {
		
	}
	
	class TestRoom extends Room {
		ArrayList<Item> testroomInventory = new ArrayList<Item>();
		testroomInventory.add(CanOfBeans);
	}
}

}
