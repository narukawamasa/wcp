package classMethod.human;

public class Human04_1 {
	
	static public int humanCount = 0;
	public String name;
	
	public static final String GREETING = "こんにちは";
	
	public Human04_1(String name) {
		this.name = name;
		Human04_1.humanCount++;
	}
	
	static public void staticMethodPrint() {
		System.out.println("人の数は" + Human04_1.humanCount);
	}
	
	public void instanceMethodPrint() {
		System.out.println("名前は" + name);
	}

}
