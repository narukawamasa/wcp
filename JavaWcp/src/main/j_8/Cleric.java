package main.j_8;
import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;
	
	public void selfAid() {
		System.out.println(this.name + "は、セルフエイドを唱えた！");
		this.mp -= 5;
		this.hp = this.MAX_HP;
		
		System.out.println("HPが最大まで回復した");
	}
	
	public int pray(int sec) {
		int c = this.MAX_MP - this.mp;
		int recover = sec + new Random().nextInt(2);
		int recoverActual = Math.min(c, recover);
		this.mp += recoverActual;
	}

}
