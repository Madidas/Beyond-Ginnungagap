package theGameV4;


public class MafiaMember {    //astetta kovempi vastus mm. WarehouseAreaan.
	private int hp;
	private int dmgOut;
	
	public MafiaMember(){
		this.hp = 75;
		this.dmgOut = 95;
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