package main.J_4;

public class J_r_4_4 {
	public static void main(String[] args) {
		int[] numbers = {3, 4, 9};
		System.out.println("一桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int value : numbers) {
			if (input == value) {
				System.out.println("アタリ！");
				break;
			}
		}
	}

}
