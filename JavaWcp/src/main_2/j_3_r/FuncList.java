package main_2.j_3_r;

public class FuncList {
	public static boolean isOdd(int x) {
		return (x % 2 == 0);
	}
	
	public String passCheck(int point, String name) {
		return name + "さんは" + (point > 65 ? "合格" : "不合格");
	}

}
