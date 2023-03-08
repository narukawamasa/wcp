package main.j_5;

public class j_r_5_3 {
	public static void main(String[] args) {
		String address = "a@a";
		String text = "aa";
		email(address, text);
	}
	
	public static void email() {
		String title = "aaa";
		String address = "a@a";
		String text = "Hello";
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:無題");
		System.out.println("本文:" + text);
	}


}
