package game;

import java.util.ArrayList;
import java.util.HashMap;

public class Room {
	
	private static Item roomItem;
	
	public Room(Item roomItem) {
		Room.roomItem = roomItem;
	}

	class TrapRoom extends Room {
		
	}
	
	class PuzzleRoom extends Room {
		
	}
	
	class ObstacleRoom extends Room {
		
	}
	
	class TestRoom extends Room {
		HashMap<Action, Item> testroomActions = new HashMap<Action, Item>;
		testroomActions.put("eat","CanOfBeans");
		
		ArrayList<Item> testroomItems = new ArrayList<Item>;
		testroomInventory.add(CanOfBeans);
		
		System.out.println(testroomItems);
	}

}
