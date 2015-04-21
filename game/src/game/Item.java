package game;

import java.util.ArrayList;

public class Item {
	private static String itemName = "Item's name";
	private static String itemDescription = "Item's description";
	
	//ArrayList<String> itemProperties = new ArrayList<String>();
	
	public interface Identifiable {
		public void identify(String itemName);
	}
	
	//public static String getValues() {
		//return itemName;
	//}
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
	
	public static class CanOfBeans extends Item {
		
		private String itemName;
		private String itemDescription;

		public CanOfBeans(String itemName) {
			this.itemName = "Can of beans";
			this.itemDescription  = "A tasty can of beans";
		}
		
		public String getItemName() {
			return itemName;
		}
		
		/*
		public void eat() {
			System.out.println("Eating " + itemName);
		}
		
		public void identify(String itemName) {
			System.out.println("Identifying: " + itemDescription);
		}
		*/		
	}
}

