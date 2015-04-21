package game;

import java.util.ArrayList;

public class Item {
	private static String itemName = "Item name";
	private static String itemDescription = "Item description";
	ArrayList<String> itemProperties = new ArrayList<String>();
	
	public String getItemName() {
		return itemName;
	}
	
	public void eat() {
		System.out.println("Eating " + itemName);
	}
	
	public void identify(String itemName) {
		System.out.println("Identifying " + itemName);
		System.out.println(itemName + " looks like " + itemDescription);
	}	
	
	public interface Identifiable {
		public void identify(String itemName);
	}
	
/*	
	public interface Usable {
	}
	
	public interface Readable {
	}
	
	public interface Throwable {
	}*/
	
	public interface Edible {
		public void eat();
	}
	
	public static class CanOfBeans extends Item implements Identifiable, Edible {
		
		private String itemName;
		private String itemDescription;

		public CanOfBeans() {
			this.itemName = "Can of beans";
			this.itemDescription  = "A tasty can of beans";
		}
		
		public String getItemName() {
			return this.itemName;
		}
		
		public void eat() {
			System.out.println("Eating " + this.itemName);
		}
		public void identify(String itemName) {
			System.out.println("Identifying " + this.itemName);
			System.out.println(itemName + " looks like " + this.itemDescription);
		}
	}
}