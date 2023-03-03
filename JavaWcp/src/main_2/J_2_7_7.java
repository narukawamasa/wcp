package main_2;

import java.util.ResourceBundle;

public class J_2_7_7 {
	public static void main(String[] args) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle(
				"jp.miyabilink.rpg.rpgdata");
		String heroName = rb.getString("heroName");
		System.out.println("勇者の名前:" + heroName);
	}

}
