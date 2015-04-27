package game;

import java.util.*;
import java.io.*;

public class Room implements Serializable {
	
	//Room info
	private String nameRoom;
	private String infoRoom;
	private Vector vecExits;
	
	//Blank constructor
	public Room() {
		nameRoom = new String();
		infoRoom = new String();
		vecExits = new Vector();
	}
	
	//Partial constructor
	public Room(String title) {
		//Assign title
		nameRoom = title;
		
		//Blank description
		infoRoom = new String();
		
		//Blank exits
		vecExits = new Vector();
	}
	
	//Full constructor
	public Room(String title, String description) {
		//Assign title and description to the room
		nameRoom = title;
		infoRoom = description;
		//Blank exits
		vecExits = new Vector();
	}
	
	//toString method
	public String toString() {
		return nameRoom;
	}
	
	//Add exits to this location
	public void addExit (Exit exit) {
		vecExits.addElement(exit);
	}
	//Remove exits from this location
	public void removeExit (Exit exit) {
		if (vecExits.contains (exit)) {
			vecExits.removeElement(exit);
		}
	}
	//Return a vector of exits
	public Vector getExits() {
		//Return clone so not to modify original
		return (Vector)vecExits.clone();
	}
	//Return room name
	public String getName() {
		return nameRoom;
	}
	//Assigns room name
	public void setName(String Name) {
		nameRoom = Name; 
	}
	//Return room info
	public String getInfo() {
		return infoRoom;
	}
	//Assign room info
	public void setInfo(String roomInfo) {
		infoRoom = roomInfo;
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
		
		public static Item testroomCanOfBeans = new Item.CanOfBeans();
		
		public static void setRoomItems() {
			ArrayList<Item> testroomItems = new ArrayList<Item>();
			testroomItems.add(testroomCanOfBeans);
			System.out.println("Items in the room: " + testroomCanOfBeans.getItemName());
			testroomCanOfBeans.eat();
			testroomCanOfBeans.identify("Can Of Beans");
		}
		
		public void removeRoomItem() {
			testroomItems.remove(testroomCanOfBeans);
		}
		
		public void addRoomItem() {
			
		}
	}
}
