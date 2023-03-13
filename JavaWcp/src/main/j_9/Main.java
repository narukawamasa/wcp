package main.j_9;

public class Main {
	public static void main(String[] args) throws Exception {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero h1 = new Hero("ミナト");
		h1.sword = s;
		Hero h2 = new Hero("ミナト");
		h2.sword = s;
		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
		System.out.println("現在の武器は" + h1.sword.name);
		System.out.println(h2.hp);
	}

}
