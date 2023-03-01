package main_2;

import main.game.Hero;

public class J_1_2_1 {
	
	public static void prints(Object a, Object b) {
		for (int i= 0; i < (Integer)b; i++) {
			System.out.println(a);
		}
	}
	
	public static void main(String[] args) {
		Object s= "こんにちは";
		s = new Hero();
		Object n = 1;
		prints(s,n);
	}

}
