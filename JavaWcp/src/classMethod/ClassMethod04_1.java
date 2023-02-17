package classMethod;

import classMethod.human.Human04_1;

public class ClassMethod04_1 {
	
	public static void main(String[] args) {
		Human04_1 yamada = new Human04_1("山田");
		
		Human04_1.staticMethodPrint();
		
		System.out.println(Human04_1.GREETING);
		
		yamada.instanceMethodPrint();
	}

}
