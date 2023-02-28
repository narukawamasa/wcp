package main;

import java.util.ArrayList;
import java.util.List;

public class J_3_r_16_2 {
	public static void main(String[] args) {
		Hero_2 h1 = new Hero_2("斎藤");
		Hero_2 h2 = new Hero_2("鈴木");
		
		List<Hero_2> heros = new ArrayList<Hero_2>();
		
		heros.add(h1);
		heros.add(h2);
		
		for (Hero_2 s : heros) {
			System.out.println(s.getName());
		}
	}

}
