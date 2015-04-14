package theGameV4;


public class Customer {    //hamppeja, rähinäalttiita ostoehdokkaita.
	private int hp;
	private int dmgOut;
	private int money;
	
	
	public Customer(){
		this.hp = 30;
		this.dmgOut = 70;
		this.money = 25;
	}

	public int getHpMax(){
		return 30;
	}
	public int getHp(){
		return this.hp;
	}
	public int getDmgOut(){
		return this.dmgOut;
	}

    public int getMoney(){
    	return this.money;
    }
}