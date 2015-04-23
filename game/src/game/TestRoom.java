package game;

import java.util.ArrayList;

public class TestRoom {
	public static Item testroomCanOfBeans = new Item.CanOfBeans();
	
	public static void setRoomItems() {
		ArrayList<Item> testroomItems = new ArrayList<Item>();
		testroomItems.add(testroomCanOfBeans);
		System.out.println("Items in the room: " + testroomCanOfBeans.getItemName());
		testroomCanOfBeans.eat();
		testroomCanOfBeans.identify();
	}
	
	public void removeRoomItem() {
		
	}
	
	public void addRoomItem() {
		
	}
}
