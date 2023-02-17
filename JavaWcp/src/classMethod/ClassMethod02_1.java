package classMethod;

import classMethod.human.Human02_1;

public class ClassMethod02_1 {
	public static void main(String[] args) {
		Human02_1 yamada = new Human02_1();
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");
		
		Human02_1 sato = new Human02_1("佐藤", 25);
		System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
	}

}
