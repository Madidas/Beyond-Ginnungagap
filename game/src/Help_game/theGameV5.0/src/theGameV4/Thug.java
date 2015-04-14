package theGameV4;

public class Thug {
	private int hp;
	private int dmgOut;
	
	public Thug(){
		this.hp = 75;
		this.dmgOut = 50;
	}

	public int getHpMax(){
		return 75;
	}
	public int getHp(){
		return this.hp;
	}
	public int getDmgOut(){
		return this.dmgOut;
	}
}
