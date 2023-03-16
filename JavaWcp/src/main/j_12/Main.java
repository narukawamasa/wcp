package main.j_12;

public class Main {
	public static void main(String[] args) {
		Monster[] monsters = new Monster[3];
		monster[0] = new Slime();
		monster[1] = new Goblin();
		monster[2] = new DeathBat();
		for (Monster m : monsters) {
			m.run();
		}
	}

}
