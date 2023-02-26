package main.game;

public class Cleric {
	String name;
	int hp = 50;
	final int max_Hp = 50;
	int mp = 10;
	final int max_Mp = 10;
	
	public void selfAid() {
		System.out.println(this.name + "は、セルフエイドを唱えた！");
		this.mp -= 5;
		this.hp = this.max_Hp;
		System.out.println("HPが最大まで回復した！");
	}

}
