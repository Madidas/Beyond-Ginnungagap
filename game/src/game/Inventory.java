package game;

import java.util.ArrayList;

public class Inventory {
	private static Item inventoryItem;
	
	public Inventory(Item inventoryItem){
		Inventory.inventoryItem = inventoryItem;
	}
	
	public ArrayList<Item> getInventory(){
		ArrayList<Item> itemInventory = new ArrayList<Item>();
		return itemInventory;
	}
}
