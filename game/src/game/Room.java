package game;

import java.util.ArrayList;
import java.util.HashMap;

public class Room {
	
	private Item roomItem;
	
	public Room (Item roomItem) {
		this.roomItem = roomItem;
	}
	
	public Room() {
		
	}
/*
	class TrapRoom extends Room {
		
	}
	
	class PuzzleRoom extends Room {
		
	}
	
	class ObstacleRoom extends Room {
		
	}
*/	
	static class TestRoom extends Room {
		
		public static void setRoomItems() {
			ArrayList<Item> testroomItems = new ArrayList<Item>();
			//testroomItems.add(Item.CanOfBeans);
			System.out.println("Items in the room: " + testroomItems);
		}
	}
}