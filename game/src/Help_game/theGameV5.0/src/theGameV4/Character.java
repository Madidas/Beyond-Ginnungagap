package theGameV4;

import java.util.HashMap;

public class Character {
	protected String name;
	protected int maxHp;
	protected int hp;
	protected int dmgOut;
	protected Location atLoc;
	protected int booze;
	protected HashMap<String,Boolean> items;
	protected int effect;
	protected int money;
	protected int painkillers;
	protected boolean robbed;
	protected boolean soldAll;
	protected boolean swim;

	public Character() {
		this.maxHp = 100;
		this.name = "john";
		this.effect = 0;
		this.booze = 0;
		this.painkillers = 1;
		this.items= new HashMap<String,Boolean>();	
		this.hp = 100;
		this.dmgOut = 40;
		this.money = 80;
		this.items.put("knife",false);				//home
		this.items.put("crowbar",false);			//warehouse
		this.items.put("laser pistol",false);		//chalck
		this.items.put("broken bottle",false);		//alley
		this.items.put("gun",false);				//police
		this.items.put("broken baseballbat",false);	//beach
		this.items.put("pipe",false);				//basement
		this.items.put("stick",false);				//park
		this.items.put("fork",false);				//pizzeria
		this.items.put("jacket",false);				//schoolyard
		this.items.put("vest",false);				//fleamarket
		this.items.put("plastic bottle", false);	//movie theathre
		
		this.items.put("power armor", false);		//chalck
		
	}

	public void setLoc(Location d) {
		this.atLoc = d;
	}
	public Location getLoc() {
		return this.atLoc;
	}
	public String setName(String o){
		this.name = o;
		return this.name;
	}
	public int getEffect(){
		return this.effect;
	}
	public int setEffect(int k){
		this.effect = this.effect + k;
		return this.effect;
	}
	public int getBooze(){
		return this.booze;
	}
	public int setBooze(int f){
		this.booze = this.booze + f;
		return this.booze;
	}
	public int getPainkillers(){
		return this.painkillers;
	}
	public int setPainkillers(int o){
		this.painkillers = this.painkillers + o;
		return this.painkillers;
	}
	public int getMoney(){
		return this.money;
	}
	public int setMoney(int m){
		this.money = this.money + m;
		if(this.money < 0){
			this.money = 0;
		}
		return this.money;
	}
	public int drinkBooze(int z){
		if (z > this.booze) {
			System.out.println("you don't have that much booze but you drink all you have");
			this.effect = this.booze;
			this.booze = this.booze-z-(this.booze-z);
			return this.effect;
		} else {
			this.effect = this.booze;
			this.booze = this.booze - z;
			return this.effect;
		}
	}

	public void poketItem(String t){
		items.put(t, true);
	}

	public void getItemList(){
		for (String givKeys:items.keySet()) {
			if(items.get(givKeys)){
				System.out.println (givKeys);
			}
		}
	}
	public String getName(){
		return this.name;
	}
	public void setHp(int p){
		this.hp = p;
	}
	public int getHp(){
		return this.hp;
	}
	public int getDmgOut(){
		for(String allItems:items.keySet()){
			if (items.get(allItems) == true){
				if(allItems.equals("knife") && (70>this.dmgOut)){
					this.dmgOut=70;
				} else if(allItems.equals("crowbar") && (60>this.dmgOut)){
					this.dmgOut=60;
				} else if(allItems.equals("laser pistol") && (270>this.dmgOut)){
					this.dmgOut=270;
				} else if(allItems.equals("broken bottle") && (50>this.dmgOut)){
					this.dmgOut=50;
				} else if(allItems.equals("gun") && (90>this.dmgOut)){
					this.dmgOut=90;
				} else if(allItems.equals("broken baseballbat") && (70>this.dmgOut)){
					this.dmgOut=70;
				} else if(allItems.equals("pipe") && (60>this.dmgOut)){
					this.dmgOut=60;
				} else if(allItems.equals("plastic bottle") && (45>this.dmgOut)){
					this.dmgOut=60;
				} else if(allItems.equals("fork") && (50>this.dmgOut)){
					this.dmgOut=60;
				} else if(allItems.equals("stick") && (45>this.dmgOut)){
					this.dmgOut=60;
				}
				return this.dmgOut;
			} else {
				return this.dmgOut;
			}
		}
		return this.dmgOut;
	}
	public int getMaxHp(){
		for(String allItems:items.keySet()){
			if (items.get(allItems) == true){
				if(allItems.equals("vest")){
					this.maxHp=this.maxHp+15;
				} else if(allItems.equals("jacket")){
					this.maxHp=this.maxHp+20;
				} else if(allItems.equals("helmet")){
					this.maxHp=this.maxHp+10;
				}
			}
		}
		return this.maxHp;
	}
		//Setup states for the character
		//Methods to check states and change them 
		//Create Location ,Create a call locations changing methods and limiter
		//Create command methods and limiter in random style
		//Do possible effect methods
		//
}
