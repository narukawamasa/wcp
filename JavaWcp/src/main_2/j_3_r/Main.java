package main_2.j_3_r;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> names = List.of("湊雄輔", "朝香あゆみ", "菅原拓真", "大江岳人");
//		上記Arrays.asListはJava9以前の記述、本来はList.ofで同じ効果
		names.stream()
		.filter(n -> n.length() <= 4)
		.map(n -> n + "さん")
		.forEach(System.out::println);
	}

}
