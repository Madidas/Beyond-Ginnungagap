package game;

import java.util.ArrayList;

public class Item {
	private String itemName = "Name";
	
	ArrayList<String> itemProperties = new ArrayList<String>();
	
	public interface IsEdible {
	}
	
	public class CanOfBeans extends Item implements IsEdible {
	}
}