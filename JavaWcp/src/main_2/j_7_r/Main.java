package main_2.j_7_r;

import java.util.ResourceBundle;

public class Main {
	public static void main(String[] args) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("pref");
		System.out.println(rb.getString("aichi.capital") + ":"
				+ rb.getString("aichi.food"));
	}

}
