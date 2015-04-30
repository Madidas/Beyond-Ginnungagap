package game;
import java.util.HashMap;

public class TestRoom {
	Item testroomItem = new Item();

	HashMap<String,Item> testroomItems = new HashMap<String,Item>();	
	public Item testroomCanOfBeans = testroomItem.new CanOfBeans();
	
	public void setRoomItems() {
		testroomItems.put("Can Of Beans",testroomCanOfBeans);
		System.out.println("Items currently in room: ");
		
		for (String name: testroomItems.keySet()) {
			System.out.println(name);
		}
	}

	public void addTestroomItem() {
		System.out.println("Adding " + testroomCanOfBeans.getItemName() + " to inventory.");	
		testroomItems.put("Can Of Beans",testroomCanOfBeans);
	}

	public void removeTestroomItem() {
		System.out.println("Removing " + testroomCanOfBeans.getItemName() + " from room.");	
		testroomItems.remove("Can Of Beans");	
	}

	public HashMap<String,Item> getTestroomItems() {
		return testroomItems;
	}
}