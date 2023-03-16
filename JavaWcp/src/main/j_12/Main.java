package main.j_12;

public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero();
		Hero h2 = new Hero();
		Thief t1 = new Thief("a");
		Wizard w1 = new Wizard();
		Wizard w2 = new Wizard();
		
		h1.hp += 50;
		h2.hp += 50;
		t1.hp += 50;
		w1.hp += 50;
		w2.hp += 50;
	}

}
