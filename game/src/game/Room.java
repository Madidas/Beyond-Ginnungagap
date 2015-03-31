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
		public static HashMap<String,String> roomItems() {
			HashMap<String,Action> itemHashmap = new HashMap<String,String>();
			
			translations.put("eat", Eat);
			translations.put("identify", Identify);
			
			return itemHashmap;
		}		
	}
}
