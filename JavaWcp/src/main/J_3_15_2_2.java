package main;

public class J_3_15_2_2 {
	public static void main(String[] args) {
		String s1 = "Java and JavaScript";
		if (s1.contains("Java")) {
			System.out.println("文字列s1は、Javaを含んでいます");
		}
		if (s1.endsWith("Java")) {
			System.out.println("文字列s１はJavaが末尾にあります");
		}
		System.out.println("文字列s１で最初にJavaが登場する位置は" + s1.indexOf("Java"));
		System.out.println("文字列s１で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
	}

}
