package main;

import java.util.HashMap;
import java.util.Map;

public class J_3_r_16_2 {
	public static void main(String[] args) {
		Hero_2 h1 = new Hero_2("斎藤");
		Hero_2 h2 = new Hero_2("鈴木");
		
		Map<Hero_2, Integer> heroes = new HashMap<Hero_2, Integer>();
		
		heroes.put(h1, 3);
		heroes.put(h2, 7);
		
		for (Hero_2 key : heroes.keySet()) {
			Integer value = heroes.get(key);
			System.out.println(key.getName() + "が倒した敵＝" + value);
		}
	}

}
