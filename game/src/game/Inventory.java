package game;

import java.util.HashMap;

import game.Item;

public class Inventory {
	Item testItem = new Item();
	public Item inventoryCanOfBeans = testItem.new CanOfBeans();
	
	HashMap<String,Item> inventoryItems = new HashMap<String,Item>();
	
	public void setInventoryItems() {		
		inventoryItems.put("Can Of Beans",inventoryCanOfBeans);
		System.out.println("Items currently in inventory:");
		
		for (String name: inventoryItems.keySet()) {
			System.out.println(name);
		}
	}
	
	public void addInventoryItem() {
		System.out.println("Adding " + inventoryCanOfBeans.getItemName() + " to inventory.");	
		inventoryItems.put("Can Of Beans",inventoryCanOfBeans);		
	}
	
	public void removeInventoryItem() {
		System.out.println("Removing " + inventoryCanOfBeans.getItemName() + " from inventory.");
		inventoryItems.remove("Can Of Beans");
	}
	
	public HashMap<String,Item> getInventory() {
		return inventoryItems;
	}
}