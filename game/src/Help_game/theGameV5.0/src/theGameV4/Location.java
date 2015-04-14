package theGameV4;

import java.util.HashMap;

public class Location {
	private boolean visited;
	protected boolean item;
	protected String itemName;
	protected int booze;
	private String name;
	private HashMap<String,Location> loc;
	HashMap<String,Commands> coms;
	Character player;

	public Location(String t,Character c){
		this.player = c;
		this.name = t;
		this.loc= new HashMap<String,Location>();
		this.coms = new HashMap<String,Commands>();
		End end = new End(this,player);
		Look look = new Look(this);
		Loot loot = new Loot(this, player);
		Go go = new Go(this);
		ItemList itemList= new ItemList(this,player);
		coms.put("look",look);
		coms.put("loot",loot);
		coms.put("go",go);
		coms.put("item list", itemList);
		coms.put("it is a good day to die",end);
	}

	public void player(Character player){
		this.player = player;
	}
	public Commands command(String t){
		return coms.get(t);
	}
	public void addLoc(Location s){
		this.loc.put(s.getName(), s);	
	}
	public void removeLoc(Location s){
		this.loc.remove(s.getName(), s);
	}
	public String getName(){
		return this.name;
	}

	public Location nxtLoc(String e){
		if(e.length() < 1){
			return loc.get(e);
		} else {
			String s =e.substring(0, 1).toUpperCase() + e.substring(1).toLowerCase();
			return loc.get(s);
		}
	}
	
	public void getPlaces(){
		for (String givKeys:loc.keySet()) {
			System.out.print(givKeys+", ");
		}
		System.out.println();
	}
	public boolean ifItem(){
		return this.item;
	}
	public void setVisisted(){
		this.visited = true;
	}
	public boolean getVisited(){
		return this.visited;
	}
	//Setup states and define possible superclass as is so you can split indoors or other such fine detailed locations
	//Methods to check states and change them add possible randomize on after date check
	//
}
