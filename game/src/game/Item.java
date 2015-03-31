package game;

import java.util.ArrayList;

public class Item {
	private String itemName = "Name";
	private String itemDescription = "Description";
	
	ArrayList<String> itemProperties = new ArrayList<String>();
	
	public interface IsUsable {
	}
	
	public interface IsReadable {
	}
	
	public interface IsThrowable {
	}
	
	public interface IsEdible {
	}
	
	public class CanOfBeans extends Item implements IsEdible {
	}
}