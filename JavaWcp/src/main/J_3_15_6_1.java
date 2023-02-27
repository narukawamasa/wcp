package main;

import java.util.Date;

public class J_3_15_6_1 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		Date past = new Date(1600705425827L);
		System.out.println(past);
	}

}
