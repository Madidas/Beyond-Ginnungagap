package game;

import java.util.HashMap;

public class Room {
	
	//Will this work now

	class TrapRoom extends Room {
		
	}
	
	class PuzzleRoom extends Room {
		
	}
	
	class ObstacleRoom extends Room {
		
	}
	
	class TestRoom extends Room {
		private static Inventory testroomInventory;
		
		public TestRoom(Inventory testroomInventory) {
			TestRoom.testroomInventory = testroomInventory;
		}
		testroom
		
		System.out.println("You're in TestRoom");
		System.out.println("Room's inventory:");
		
		
	}
}
