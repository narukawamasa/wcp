package main.j_13;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
	void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int)(basePoint * this.wand.isPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
	}

}
