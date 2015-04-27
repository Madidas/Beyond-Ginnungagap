package game;

import java.util.ArrayList;
import game.Item;

public class Inventory {
	public static Item inventoryCanOfBeans = new Item.CanOfBeans();
	
	public static void setInventoryItems() {
		ArrayList<Item> inventoryItems = new ArrayList<Item>();
		inventoryItems.add(inventoryCanOfBeans);
		System.out.println("Items in the room: " + inventoryCanOfBeans.getItemName());
		inventoryCanOfBeans.eat();
		inventoryCanOfBeans.identify();
	}
	
	public static void removeInventoryItem(ArrayList<Item> inventoryItems) {
		System.out.println("Removing " + inventoryCanOfBeans.getItemName() + " from inventory.");
		inventoryItems.remove(inventoryCanOfBeans);
		System.out.println(inventoryItems);
	}
	
	public static void addInventoryItem(ArrayList<Item> inventoryItems) {
		System.out.println("Adding " + inventoryCanOfBeans.getItemName() + " to inventory.");	
		inventoryItems.add(inventoryCanOfBeans);
		System.out.println(inventoryItems);
	}
}
