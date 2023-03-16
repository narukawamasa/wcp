package main.j_12;

public class Main {
	public static void main(String[] args) {
		Character[] c = new Character[5];
		c[0] = new Hero();
		c[1] = new Hero();
		c[2] = new Thief("a");
		c[3] = new Wizard();
		c[4] = new Wizard();
		
		for (Character ch : c) {
			ch.hp += 50;
		}
	}

}
