package main;

public class J_1_r_5_3 {
	public static void main(String[] args) {
		String title = "あいさつ";
		String address = "a@a";
		String text = "こんにちは";
		
		email(address, text);
	}
	
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信します");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
	
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信します");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}

}
