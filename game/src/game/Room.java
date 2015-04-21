package game;

import java.util.*;
import java.io.*;
import game.Item.CanOfBeans;

public class Room implements Serializable {
	
	//Room info
	private String m_roomName;
	private String m_roomInfo;
	private Vector vecExits;
	
	//Blank constructor
	public Room() {
		m_roomName = new String();
		m_roomInfo = new String();
		vecExits = new Vector();
	}
	
	//Partial constructor
	public Room(String title) {
		//Assign title
		m_roomName = title;
		
		//Blank description
		m_roomInfo = new String();
		
		//Blank exits
		vecExits = new Vector();
	}
	
	//Full constructor
	public Room(String title, String description) {
		//Assign title and description to the room
		m_roomName = title;
		m_roomInfo = description;
		
		//Blank exits
		vecExits = new Vector();
	}
	
	//toString method
	public String toString() {
		return m_roomName;
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
		return m_roomName;
	}
	//Assigns room name
	public void setName(String roomName) {
		m_roomName = roomName; 
	}
	//Return room info
	public String getInfo() {
		return m_roomInfo;
	}
	//Assign room info
	public void setInfo(String roomInfo) {
		m_roomInfo = roomInfo;
	}
	private Item roomItem;
	
	public Room (Item roomItem) {
		this.roomItem = roomItem;
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
		
		static Item testroomBeans(String itemName) = new Item.CanOfBeans(String itemName);
		
		public static void setRoomItems() {
			ArrayList<Item> testroomItems = new ArrayList<Item>();
			testroomItems.add(testroomBeans);
			System.out.println("Items in the room: " + testroomItems);
		}
	}
}
