package main;

import java.util.Set;
import java.util.TreeSet;

public class J_3_16_5 {
	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>();
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("pands");
		
		for (String s : words) {
			System.out.print(s + "→");
		}
	}

}
