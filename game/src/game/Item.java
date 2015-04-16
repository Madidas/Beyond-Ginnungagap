package game;

import java.util.ArrayList;

public class Item {
	private static String itemName = "Name";
	private static String itemDescription = "Description";
	
	ArrayList<String> itemProperties = new ArrayList<String>();
	
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
	
	public static class CanOfBeans extends Item implements Edible {
		
		private static String itemName = "Can of beans";
		private static String itemDescription = "A tasty can of beans";
		
		public static String getValues() {
			return itemName;
		}
		
		public void eat() {
			System.out.println("Eating " + itemName);
		}
		
		public void identify() {
			System.out.println("Identifying: " + itemDescription);
		}
	}
	
	public class EmptyCanOfBeans extends Item {
	}			
}
