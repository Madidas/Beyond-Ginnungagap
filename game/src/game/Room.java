package game;

import java.util.*;
import java.io.*;

public class Room implements Serializable {


	//Room info
	private static String numberRoom;
	private String nameRoom;
	private String infoRoom;
	private Vector<Exit> vecExits;
	//private HashMap<String,Item> inventoryRoom;

	//Blank constructor
	public Room() {
		numberRoom = new String();
		nameRoom = new String();
		infoRoom = new String();
		vecExits = new Vector<Exit>();
		//inventoryRoom = new HashMap<String, Item>();
	}

	//Partial constructor
	public Room(String number, String title) {
		//Assign number
		numberRoom = number;
		
		//Assign title
		nameRoom = title;

		//Blank description
		infoRoom = new String();

		//Blank exits
		vecExits = new Vector<Exit>();
		
		//Blank Hashmap
		//inventoryRoom = new HashMap<String, Item>();
	}

	//Full constructor
	public Room(String number, String title, String description) {
		//Assign number, title and description to the room
		numberRoom = number;
		nameRoom = title;
		infoRoom = description;
		//Blank exits
		vecExits = new Vector<Exit>();
		//Blank inventory
		//inventoryRoom = new HashMap<String, Item>();
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
	public Vector<Exit> getExits() {
		//Return clone so not to modify original
		return (Vector<Exit>)vecExits.clone();
	}
	//Return room number
	public String getNumber() {
		return numberRoom;
	}
	//Assigns room number
	public void setNumber(String Number) {
		numberRoom = Number;
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
	//Add inventory to this room
	//public void addInventory (Inventory inventoryItems) {
		//inventoryRoom.putAll((Map<? extends String, ? extends Item>) inventoryItems);

/*
	class TrapRoom extends Room {

	}

	class PuzzleRoom extends Room {

	}

	class ObstacleRoom extends Room {

	}
*/
	/*static class TestRoom extends Room {

		
		/*
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

		}*/
	}

